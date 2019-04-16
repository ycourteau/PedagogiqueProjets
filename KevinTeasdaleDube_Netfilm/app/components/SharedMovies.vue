<template>
    <Page @loaded="onLoadedPage" >
        <ActionBar>
            <label class="actionbarTitle" text="FILMS PRÊTÉS"/>
            <NavigationButton text="Go Back" android.systemIcon="ic_menu_back" @tap="onBackPressed"></NavigationButton>
        </ActionBar>
        <StackLayout>
            <!-- Header de la page. -->
            <Label text="Liste des films prêté." id="headerText" class="header"></Label>
            <!-- ListView des titres de films qui sont prêtés. -->
            <ListView for="item in sharedMovies" @itemTap="onItemTap">
                <v-template>
                    <StackLayout orientation="horizontal" class="listviewcell">
                        <!-- Titre du film. -->
                        <Label :text="item.titre" class="listViewLabel" textWrap="true"></Label>
                    </StackLayout>
                </v-template>
            </ListView>
        </StackLayout>

    </Page>
</template>

<script>
    import * as httpWithSSLCertificate from "http";
    import home from "./App";
	import * as localStorage from "nativescript-localstorage";


    export default {
        mounted(){
        	/* Va chercher les statuts pour pouvoir le changer dans la base de données */
			httpWithSSLCertificate.getJSON("https://pam-api.duckdns.org/kevstatuts").then(
        		result => {
					this.sharedStatus = result;
				}
            );
        },
        data() {
            return {
            	// Liste des statuts
				sharedStatus: [],
                // Liste des films prêtés
                sharedMovies: [],
                page: null,
				headerLabel: null
            }
        },
        methods: {
			/**
             * Fonction qui vérifie si la liste de films prêtés est vide et si "TRUE"
             * change le texte dans le Label ID -> headerText.
			 */
			checkIfListIsEmpty:function(){
				if (this.sharedMovies.length < 1 || this.sharedMovies === null) {
					this.headerLabel.text = "Aucun films n'est prêtés."
				}
            },
			/**
             * Fonction qui enregistre localement les films qui sont emprunté par des amis
             * avant de retourner à la page précédente.
			 */
			onBackPressed: function () {
				localStorage.removeItem("sharedMovies");
				localStorage.setItem("sharedMovies", JSON.stringify(this.sharedMovies));
                this.$navigateTo(home);
            },
			/**
             * Lorsque l'utilisateur sélectionne un film de la liste, une fenêtre s'ouvre
             * pour savoir si le film est retourné. Dans l'affirmative, il est retiré de la liste
             * et le statut est changé dans la base de données.
             *
			 * @param index position dans la liste du film sélectionné.
			 * @param e erreur
			 */
			onItemTap: function ({index, e}) {
				confirm( {
					title: "Le film à été rendu?",
					message: "Veuillez choisir",
					okButtonText: "Oui",
					cancelButtonText: "cancel"
				}).then(result => {
					console.log(result);
					/* Si le résultat est "TRUE" */
					if (result){
						var monFilm = this.sharedMovies[index];
						/* Retirer le film de la liste. */
						this.sharedMovies.splice(this.sharedMovies.indexOf(monFilm));

						/* Requête pour changer le statut sur la base de données en ligne. */
						httpWithSSLCertificate.request({
							url: "https://pam-api.duckdns.org/kevfilms/" + monFilm.id.toString(),
							method: "PUT",
							headers: {"Content-Type": "application/json"},
							content: JSON.stringify({
								kevstatut: this.sharedStatus[0].id
							})
						}).then((response) => {
							console.log(JSON.stringify(response));
						});
                    }
					this.checkIfListIsEmpty();
				});
            },
			/**
             * Lorsque la page se charge, le local storage s'ouvre et charge la liste de films prêté.
			 * @param args
			 */
			onLoadedPage: function (args) {
            	this.page = args.object;
				this.headerLabel = this.page.getViewById("headerText");
				/* Ouverture de la sauvegarde locale. */
				var patate = JSON.parse(localStorage.getItem("sharedMovies") || []);
				this.sharedMovies = patate;
				console.log("MON LOCAL STORAGE " + JSON.stringify(patate));
				this.checkIfListIsEmpty();
			}
        }
    }


</script>

<style scoped>

    /* Voir fichier app.scss */

</style>
