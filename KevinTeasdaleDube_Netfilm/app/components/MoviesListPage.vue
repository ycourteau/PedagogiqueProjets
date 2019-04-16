<template>
    <Page @loaded="onLoaded">
        <ActionBar>
            <label class="actionbarTitle" text="FILMS"/>
            <NavigationButton text="Go Back" android.systemIcon="ic_menu_back" @tap="onBackPressed"/>
            <ActionItem android.position="actionBar" text="Ajouter" android.systemIcon="ic_menu_add" @tap="onAddTap"/>
        </ActionBar>
        <StackLayout orientation="vertical">
            <SearchBar hint="Search" id="searchbar"  @textChange="onTextChanged" @submit="onSubmit" @clear="onClear" />
            <Label class="header" text="Je suis la page de liste de films"/>
            <ListView for="item in listMovieItem"  @itemTap="onItemTap" height="100%">
                <v-template>
                    <StackLayout orientation="horizontal" class="listviewcell" >
                        <Label :text="item.titre" class="listViewLabel" textWrap="true"/>
                    </StackLayout>
                </v-template>
            </ListView>
        </StackLayout>
    </Page>
</template>

<script >
    import * as http from "http";
    import home from "./App";
    import detail from "./DetailPage";
    import addmovie from "./AddMovie";
    export default {
        props: ["titre", "allMovies"],

        mounted(){
            this.listMovieItem = this.allMovies;

            console.log("mounted");
            // Va chercher la liste de films à partir d'un URL.
            http.getJSON("https://pam-api.duckdns.org/kevfilms").then(
                result => {
                    this.listMovieItem = result;
                    this.movieArraybackUp = result;
                    console.log("STRING OF LIST" + JSON.stringify(result));
                },
                error => {
                    console.log("ERREUR" + error);
                });

            /* Va chercher toutes les années et créer 2 tableaux. Un qui sert à garder toutes l'informations
             * de l'objet année et un autre qui contient seulement l'année en STRING pour l'afficher dans le
             * ListPicker dans la page  AddMovie.vue */
            http.getJSON("https://pam-api.duckdns.org/kevannees").then(
                result => {
                    this.anneeArray = result;

                    for (var x = 0; x < this.anneeArray.length; x++){
                        this.anneeAsNumber.push(this.anneeArray[x].annee.toString());
                    }
                }, error => {
                    console.log("ERREUR" + error);
                }
            );
        },
        data() {
            return {
            	// Liste de tous les films
                listMovieItem: [],
                // Liste des OBJETS année
                anneeArray: [],
                // Liste des années seulement pour le ListPicker
                anneeAsNumber: [],
                page: null,
                searchbar: null,
                // Liste de BackUp pour réinitialiser listMovieItem
                // lors de la recherche avec la SearchBar
				movieArraybackUp: []

            };
        },
        methods: {
        	/**
			 * Fonction qui va chercher le texte dans la SearchBar et qui fait appel à une
			 * fonction pour filtrer la liste avec le contenu du SearchBar.
             */
			onTextChanged: function(){
				var recherche = this.page.getViewById("searchbar").text.toString();
				this.findSomethingWithThat(recherche);
            },

            /**
             * Fonction qui va chercher le texte dans la SearchBar et qui fait appel à une
             * fonction pour filtrer la liste avec le contenu du SearchBar.
             */
            onSubmit:function(){
            var recherche = this.page.getViewById("searchbar").text.toString();
            this.findSomethingWithThat(recherche);
            },

            /**
             * LA fameuse fonction qui recherche les titres de films selon ce qui est
             * contenu dans la barre de rechercher.
             *
             * @param recherche Le contenu de la barre de recherche à chercher dans la liste de films.
             */
            findSomethingWithThat: function(recherche){
				var myItems = [];
				if (recherche !== "") {
					for (let i = 0; i < this.movieArraybackUp.length; i++) {
						/* Comparaison des titres dans la liste et du contenu de la recherche */
						if (this.movieArraybackUp[i].titre.toLowerCase().includes(recherche.toLowerCase())) {
							myItems.push(this.movieArraybackUp[i]);
						}
					}
				}
				this.listMovieItem = myItems;
            },
            /**
             * Fonction qui réinitialise la liste complète des films.
             */
            onClear: function(){
            	this.listMovieItem = this.movieArraybackUp;

            },
            /**
             * Navique vers la page précédente
             */
            onBackPressed: function() {
				this.hideTheF_____Keyboard();
                this.$navigateTo(home);
            },
            /**
             * Losrque l'utilisateur sélectionne un item dans la liste de films
             * il est propulsé vers la page détaillée du films sélectionné.
             */
            onItemTap: function({index, e}){
				this.hideTheF_____Keyboard();
                console.log("onItemTap");
                this.$navigateTo(detail, {
                    props: {
                        movie: this.listMovieItem[index],

                    }
                });
                console.log("MOVIE " + this.listMovieItem[index])
            },

            /**
             * Fonction qui est appelée losrque l'utilisateur appuie sur le + dans la
             * ActionBar. Il est sur le champs attiré dans le trou noir qui mène vers
             * la page pour ajouter un film.
             */
            onAddTap: function(){
				this.hideTheF_____Keyboard();
                this.$navigateTo(addmovie, {
                    props: {
                        annees: this.anneeAsNumber,
                        myAnneeArray: this.anneeArray

                    }
                });
            },
            onLoaded: function (args) {
                this.page = args.object;
				this.searchbar = this.page.getViewById("searchbar");
				this.hideTheF_____Keyboard();
            },

			/**
             * Quoi de plus agressant que quelque chose qui apparait quand on a absolument
             * rien demandé, tout comme un Windows Update. Le clavier du téléphone apparaissait
             * sans avoir appuyé sur la searchbar. Avec cette fonction le "FOCUS" n'est plus sur la searchbar
             * donc le clavier appprait seulement quand on appuie sur la celle-ci.
             *
             * Magie Magie!
			 */
			hideTheF_____Keyboard:function () {
				this.searchbar.android.clearFocus();
			}

        }
    };
</script>

<style scoped>

    /* Voir fichier app.scss */

</style>
