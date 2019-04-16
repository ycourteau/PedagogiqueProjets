<template>
    <Page @loaded="onLoaded">
        <ActionBar>
            <label class="actionbarTitle" text="FILM EN DÉTAILS"/>
            <NavigationButton text="Go Back" android.systemIcon="ic_menu_back" @tap="onBackPressed"/>
        </ActionBar>
        <ScrollView height="100%">
            <StackLayout class="container">
                <Image src="https://i.imgur.com/x3QWpLs.jpg" class="image"/>
                <StackLayout orientation="vertical">
                    <TextField :text="this.myMovie.titre" class="title" textWrap="true" id="modifTitle"/>
                    <Label :text="`(` + this.myAnnee + `)`" class="text" textWrap="true"/>
                    <StackLayout orientation="horizontal">
                        <TextField :text="this.myMovie.duree" class="text" id="modifDuree" textWrap="true" keyboardType="number" width="13%"/>
                        <Label text=" minutes" class="text" textWrap="true" verticalAlignment="center"/>
                    </StackLayout>

                    <StackLayout orientation="horizontal">
                        <ListView for="item in kevtypesArray" class="typelv">
                            <v-template>
                                <StackLayout orientation="vertical">
                                    <Label :text="item.description" class="movieLabel" textWrap="true"/>
                                </StackLayout>
                            </v-template>
                        </ListView>
                    </StackLayout>
                </StackLayout>

                <TextView :text="this.myMovie.scenario" class="text" id="boringStory" textWrap="true" maxLength="255"/>

                <StackLayout orientation="horizontal">
                    <Button text="Prêter" @tap="onButtonSharedTap" class="button" id="sharedButton" isEnabled="true"/>
                    <Button text="Modifier" @tap="onUpdateTap" class="button"/>
                    <Button text="Supprimer" @tap="onDeleteTap" class="button"/>
                </StackLayout>
            </StackLayout>
        </ScrollView>

    </Page>
</template>

<script>
	import * as JeSurfSurLeNet from "http";
	import movieslistpage from "./MoviesListPage";
	import * as localStorage from "nativescript-localstorage";

	export default {
		props: ["movie"],

		data() {
			return {
				myMovie: [],
				kevamisArray: [],
				kevanneArray: [],
				kevtypesArray: [],
				fullnameList: [],
				sharedList: [],
				myAnnee: null,
				fullMovieList: [],
				page: null,
				movieStatusArray: [],
				statusArray: [],
				storageList: []
			}
		},
		mounted() {

			/* Va chercher l'année avec la "Foreign Key" associée dans le film. */
			JeSurfSurLeNet.getJSON("https://pam-api.duckdns.org/kevannees/" + this.movie.anneesortie.toString()).then(
				result => {
					console.log("ANNEE " + JSON.stringify(result));
					this.myAnnee = result.annee.toString();
					this.myMovie.kevannee = result.annee.toString();

					/* Va chercher tous les "Statuts" afin de comparer avec le statut du film.
					* Si le film a le statut "Prêté" le bouton sera désactivé et le texte changera. */
					JeSurfSurLeNet.getJSON("https://pam-api.duckdns.org/kevstatuts").then(
						result => {
							this.statusArray = result;

							/* Va chercher les informations du film. */
							JeSurfSurLeNet.getJSON("https://pam-api.duckdns.org/kevfilms/" + this.movie.id.toString()).then(
								result => {
									this.myMovie = result;
									if (this.myMovie.kevstatut.id === this.statusArray[1].id) {
										this.enableButton();
									}

									this.kevamisArray = this.myMovie.kevamis;
									this.kevanneArray = this.myMovie.kevannee;
									console.log(JSON.stringify(this.movie.kevtypes));
									if (this.movie.kevtypes !== null) {
										this.kevtypesArray = this.movie.kevtypes;
									} else {
										this.kevtypesArray = null;
									}
								});
						}
					);
				}
			);
		},
		methods: {
			/**
			 * Pour éviter que l'on puisse prêter un film à plusieurs personnes à la fois
			 * il faut trouver une façon de ne pas le faire. BINGO!!! Juste a désactiver le
			 * bouton qui sert a prêter le film. Fallait quand même y penser! Voilàa ce que cette fonction fait.
			 * Elle désactive le bouton prêter et change le texte pour ne pas que l'utilisateur
			 * se demande pourquoi le bouton ne fonctionne pas!
			 */
			enableButton: function () {
				var buttonShared = this.page.getViewById("sharedButton");
				buttonShared.isEnabled = false;
				buttonShared.text = "Déjà prêté";
			},
			/**
			 * Retour à la page de liste de films.
			 */
			onBackPressed: function () {
				this.$navigateTo(movieslistpage);
			},

			/**
			 * Fonction qui va chercher tous les amis dans la BD et envoie le ID
			 * a une autre fonction.
			 */
			onButtonSharedTap: function () {

				JeSurfSurLeNet.getJSON("https://pam-api.duckdns.org/kevamis").then(
					result => {
						this.sharedList = result;
						console.log(JSON.stringify(this.sharedList.length));
						for (var x = 0; x < this.sharedList.length; x++) {
							this.fullnameList.push((this.sharedList[x].prenom).concat(" " + this.sharedList[x].nom));
						}
						console.log(JSON.stringify(this.fullnameList));

						/* Choix de l'ami à qui prêter le film. */
						const promptOptions = {
							message: "À qui le prêtez-vous?",
							cancelButtonText: "Cancel",
							actions: this.fullnameList
						};
						var fullname = "";
						action(promptOptions).then((r) => {
							console.log("Dialog result: " + r);
							fullname = r.toString();

							for (var x = 0; x < this.sharedList.length; x++) {

								/* Comparaison avec l'ami sélectionné avec la liste et appelle une fonction "Private" */
								if ((this.sharedList[x].prenom).concat(" " + this.sharedList[x].nom) === fullname) {
									console.log("ALLO JE SUIS DANS LA BOUCLE");
									this.sharedMovieToThisFriend(this.sharedList[x].id);
									console.log(this.sharedList[x].id.toString());
								}
							}
						});
					}
				);
			},

			/**
			 * Fonction qui assigne un film a un ami
			 *
			 * @param id ID de l'ami qui emprunte le film.
			 */
			sharedMovieToThisFriend: function (id) {
				console.log("je suis dans la fonction");
				var ami = [];
				var filmAmi = [];

				/* Va chercher l'ami avec le ID (param) */
				JeSurfSurLeNet.getJSON("https://pam-api.duckdns.org/kevamis/" + id.toString()).then(
					resultAmi => {
						ami = resultAmi;

						/* Va chercher le tableau d'amis et ajoute l'ami qui emprunte le film. */
						JeSurfSurLeNet.getJSON("https://pam-api.duckdns.org/kevfilms/" + this.myMovie.id.toString()).then(
							result => {
								filmAmi = result.kevamis;
								filmAmi.push(ami);

								/* Méthode PUT pour modifier les données en place dans la BD. */
								JeSurfSurLeNet.request({
									url: "https://pam-api.duckdns.org/kevfilms/" + this.movie.id.toString(),
									method: "PUT",
									headers: {"Content-Type": "application/json"},
									content: JSON.stringify({
										kevamis: filmAmi,
										kevstatut: this.statusArray[1].id
									})
								}).then((response) => {
									console.log("RESPONSE " + JSON.stringify(response));
								}, (e) => {
								});
							}
						);
						this.addToLocalStorage(this.myMovie);
					}
				);
				/* Cancel le bouton "Prêté" */
				this.enableButton();
			},
			/**
			 * Fonction qui supprime le film de la BD et va chercher tous les
			 * films pour la passer à la liste de films.
			 */
			onDeleteTap: function () {
				JeSurfSurLeNet.request({
					url: "https://pam-api.duckdns.org/kevfilms/" + this.movie.id.toString(),
					method: "DELETE"
				}).then((response) => {

					JeSurfSurLeNet.getJSON("https://pam-api.duckdns.org/kevfilms").then(
						result => {
							this.fullMovieList = result;
						}
					).then(
						response => {
							console.log(JSON.stringify(response));

							this.$navigateTo(movieslistpage, {
								props: {
									allMovies: this.fullMovieList
								}
							});
						}
					);
				});
			},
			/**
			 * Fonction qui comme son nom le dit update le film lorsque l'utilisateur
			 * appuie sur le bouton. Le fonctionnement va conmme suit! => va chercher
			 * ce qui se retrouve dans les TextField et le ship via une requête PUT au
			 * serveur (Pas l'employé d'un restaurant là!).
			 */
			onUpdateTap: function () {
				/* Va chercher les données dans les champs */
				var title = this.page.getViewById("modifTitle").text.toString();
				var napLength = this.page.getViewById("modifDuree").text;
				var shitStory = this.page.getViewById("boringStory").text.toString();

				/* Requête de modification avec les changements. */
				JeSurfSurLeNet.request({
					url: "https://pam-api.duckdns.org/kevfilms/" + this.movie.id.toString(),
					method: "PUT",
					headers: {"Content-Type": "application/json"},
					content: JSON.stringify({
						titre: title,
						duree: napLength,
						scenario: shitStory
					})
				}).then((response) => {
					console.log(JSON.stringify(response));
					this.$navigateTo(movieslistpage);
				});
			},

			onLoaded: function (args) {
				this.page = args.object;
			},

			/**
			 * Fonction qui SERVIRAIT a stocker dans le local storage mais
			 * ça ne fonctionne pas.
			 *
			 * @param myMovie film à mettre dans le local storage.
			 */
			addToLocalStorage: function (myMovie) {
				this.storageList.push(myMovie);
				localStorage.setItem("sharedMovies", JSON.stringify(this.storageList));
			}
		}
	}


</script>

<style scoped>

    .container {
        padding: 10px;
    }

    .image {
        height: auto;
        width: 80%;
        padding: 5vw;
        margin: 10px;
    }

    .title {
        padding-left: 5vw;
        font-size: 20px;
    }

    .typelv {
        height: 150px;
        width: 50%;
    }

    .movieLabel {
        padding-left: 5vw;
    }

    .text {
        font-size: 15px;
        padding-left: 5vw;
    }

    .button {
        padding: 5vw;
        width: 33%;
    }
</style>
