<template>
    <Page @loaded="pageLoaded">
        <ActionBar>
            <label class="actionbarTitle" text="AJOUTER UN FILM"></label>
            <NavigationButton text="Go Back" android.systemIcon="ic_menu_back" @tap="onBackPressed"></NavigationButton>
        </ActionBar>
        <!-- Contenant de toute la page -->
        <StackLayout orientation="vertical">
            <Label class="header" text="Formulaire"/>
            <!-- StackLayout HORIZONTAL pour disposer la photo et quelques info côte à côte -->
            <StackLayout orientation="horizontal">
                <!-- Affiche la PHOTO et le bouton pour prendre la photo. -->
                <StackLayout orientation="vertical">
                    <Image :src="img" width="150" height="150"></Image>
                    <Button text="Take a picture" @tap="takePhoto" class="button"></Button>
                </StackLayout>
                <!-- Affiche les TEXTFIELD pour remplir le champs TITRE ET DURÉE -->
                <StackLayout orientation="vertical">
                    <TextField hint="Titre" id="title"></TextField>
                    <TextField hint="Durée en minutes" keyboardType="number" id="duree"></TextField>
                </StackLayout>
            </StackLayout>
            <TextField hint="Scénario" id="scenario"></TextField>
            <StackLayout orientation="horizontal">
                <StackLayout orientation="vertical" width="50%">
                    <Button text="Type" @tap="addMovieType" class="button"></Button>
                    <!-- ListView des types du film -->
                    <ListView for="item in allMovietypes" height="20%">
                        <v-template>
                            <StackLayout orientation="vertical">
                                <Label :text="item.description" class="movieLabel" textWrap="true"></Label>
                            </StackLayout>
                        </v-template>
                    </ListView>
                </StackLayout>
                <ListPicker :items="anneeAsNumber" id="listpicker" width="100%"></ListPicker>
            </StackLayout>
            <Button text="Sauvegarder" @tap="saveToDB" class="button"></Button>
        </StackLayout>

    </Page>
</template>

<script>
	import {Image} from "tns-core-modules/ui/image";
	import * as camera from "nativescript-camera";
	import movieslistpage from "./MoviesListPage";
	import * as http from "http";

	export default {
		props: ["annees", "myAnneeArray"],

		mounted() {
			console.log("MOUNTED " + this.annees);
			this.anneeAsNumber = this.annees.sort();

			/* Va chercher tous les types dans la DB et créer 2 listes. Une qui servira à afficher la description
             * en STRING dans une ListView et l'autre servira à garder tout l'objet en mémoire. */
			http.getJSON("https://pam-api.duckdns.org/kevtypes").then(
				result => {
					// Array des OBJECTS Type
					this.allTypes = result;
					for (var x = 0; x < this.allTypes.length; x++) {
						// Array de STRING pour afficher dans le ActionDialog
						this.allTypesString.push(this.allTypes[x].description);

						console.log("types " + this.allTypesString[x]);
					}

					http.getJSON("https://pam-api.duckdns.org/kevstatuts").then(
						result => {
							this.statusArray = result;
							//console.log("Statuts!   " + JSON.stringify(result));
						}
					);
				}
			);



		},

		data() {
			return {
				// la souce de l'image
				img: "",
				anneeArray: this.myAnneeArray,
				anneeAsNumber: this.annees,
				// Array qui sert à afficher
				types: [],
				// Array qui sert à afficher dans le ActionDialog.
				allTypesString: [],
				// Array des types associés au film.
				allMovietypes: [],
				fullMovieList: [],
				statusArray: []
			}

		},
		methods: {

			/**
			 * Fonction qui demande la permission pour utiliser la caméra et lorsqu'elle est autorisée
			 * procède à l'invocation de la caméra et comme par magie(pas tellement, le code lui indique de le faire)
			 * nous pouvons prendre une photo et la récupérer poyr ensuite l'afficher dans une balise <Image/>
			 */
			takePhoto() {
				camera.requestPermissions().then(() => {
					camera.takePicture({width: 300, height: 300, keepAspectRatio: true, saveToGallery: true})
						.then((imageAsset) => {
							var image = new Image();
							image.src = imageAsset;
							this.img = imageAsset;
						})
						.catch(e => {
							console.log('error:', e);
						});
				})
					.catch(e => {
						console.log('Error requesting permission');
					});

			},
			/**
			 * Fonction qui creer un objet PAGE pour permettre d'aller chercher les valeurs dans les différents
			 * composantes de la page/screen.
			 *
			 * @param args quelque chose qui contient du contenu qui permet d'atteidre d'autres contenus!
			 */
			pageLoaded: function (args) {
				console.log("PAGE LOADED");
				this.page = args.object;
				console.log("TEST pageLoaded " + this.page.toString());
			},

			/**
			 * Fonction qui retourne à la page de liste de films.
			 *  ---- NavigationButton dans l'ActionBar ----
			 */
			onBackPressed: function () {
				this.$navigateTo(movieslistpage);
			},

			/**
			 * Fonction qui prend toutes les valeurs qui sont dans les TEXTFIELD, LISTVIEW et LISTPICKER
			 * et qui sauvegarde sur la base de données via une requête POST.
			 */
			saveToDB: function () {
				var view = require("ui/core/view");

				var year = view.getViewById(this.page, "listpicker");
				var title = view.getViewById(this.page, "title").text.toString();
				var belleHistoire = view.getViewById(this.page, "scenario").text.toString();
				var suppliceAEndurer = view.getViewById(this.page, "duree").text;
				var pictureURL = "https://i.imgur.com/x3QWpLs.jpg";
				console.log("YEAR : " + this.anneeArray[year.selectedIndex].id);


					http.request({
					url: "https://pam-api.duckdns.org/kevfilms",
					method: "POST",
					headers: {"Content-Type": "application/json"},
					content: JSON.stringify({
						titre: title,
						duree: suppliceAEndurer,
						anneesortie: this.anneeArray[year.selectedIndex].id,
						scenario: belleHistoire,
						poster: pictureURL,
						kevtypes: this.allMovietypes,
						kevamis: [],
						kevstatut: this.statusArray[0].id,
						kevannee: this.anneeArray[year.selectedIndex]

					})
				}).then((response) => {
					console.log(response.toString());

						// Après l'insertion, on retourne à la page de listes de films, mais
						// avant de le faire nous devons aller chercher tous les films, puisque
						// la page n'est pas rafraichit correctement après une insertion.
						http.getJSON("https://pam-api.duckdns.org/kevfilms").then(
							result => {
								this.fullMovieList = result;
							}
						).then(
							response => {
								console.log(JSON.stringify(response));
							}
						);
						// Passe la liste complète en propriété puisque la page
                        // ne se rafraichit pas assez vite.
						this.$navigateTo(movieslistpage, {
							props: {
								allMovies: this.fullMovieList
							}
						});
				}, (e) => {
					// trapper les erreurs ici.
				});


			},

			/**
			 * fonction qui retire d'un tableau une valeur contenu dans le tableau.
			 *
			 * @param array tableau dont on doit retirer une valeur.
			 * @param value valeur a retirer du tableau.
             * @return le tableau avec la valeur retirée.
			 */
			remove: function (array, value) {
				for (var x = 0; x < array.length; x++) {
					if (array[x] === value) {
						array.splice(x, 1);
					}
				}
				return array;
			},

			/**
			 * Fonction qui ajoute un ou plusieurs types a un film via un ACTIONDIALOG.
			 * Elle vérifie ensuite si le résultat est équivalent au bouton CANCEL et si non
			 * le type est ajouté a un tableau qui sera stocké dans la base de données.
			 */
			addMovieType: function () {
				this.allTypesString = this.allTypesString.sort();
				var cancel = "Cancel";
				if (this.allTypesString.length !== 0) {
					action("Choisissez un type", cancel, this.allTypesString)
						.then(result => {
							console.log(result);
							// Vérifie si le résultat est égale au bouton "CANCEL".
							if (result !== cancel) {
								// Retire le "type" de la liste qui est affiché dans le ActionDialog
								this.allTypesString = this.remove(this.allTypesString, result);
								for (var x = 0; x < this.allTypes.length; x++) {
									// Vérifie à partir de la liste initiale (Résultat de la query http) le type choisis
									// et l'ajoute au tableau des types du film.
									if (this.allTypes[x].description === result) {
										this.allMovietypes.push(this.allTypes[x]);
										console.log(JSON.stringify(this.allTypes[x]));
									}
								}
							}
						});
				} else {
					// Averti l'utilisateur lorsque la liste de types est vide.
					alert("Plus aucun types n'est disponible.")
						.then(() => {
							console.log("Alert dialog closed.");
						});
				}
			}
		}


	}

</script>

<style scoped>

    /* Voir fichier app.scss */

</style>