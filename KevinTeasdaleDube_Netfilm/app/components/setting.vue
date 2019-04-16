<template>
    <Page>
        <ActionBar>
            <label class="actionbarTitle" text="SETTINGS"/>
            <NavigationButton @tap="onBackPressed" android.systemIcon="ic_menu_back" text="Go Back"/>
        </ActionBar>
        <StackLayout>
            <Button @tap="AddSomething(false)" class="button" text="Ajouter type"/>
            <Button @tap="AddSomething(true)" class="button" text="Ajouter année"/>
        </StackLayout>

    </Page>
</template>

<script>
	import home from "./App"
	import * as jeSurfSurLeWeb from "http";

	export default {
		data() {
			return {
			}
		},
		methods: {
			onBackPressed: function () {
				this.$navigateTo(home);
			},

            /**
             * Dans un soucis de paresse (Eh bien oui ça m'arrive! Plus souvent qu'il ne le devrait d'ailleur!) cette
             * fonction ,que certaines personnes qualifirait de l'équivalent à l'algorithme de Facebook, vérifie quel
             * bouton a été enfoncé et certaine valeurs de la boite de dialog change selon le bouton. Toujours
             * selon le boutons écrasé, il appelle la méthode relié a ce que l'utilisateur voulait faire, soit ajouter
             * un type ou une année.
             *
             * @param isYear boolean qui détermine quel bouton a été déviarger!
             */
            AddSomething: function(isYear){
				const dialogs = require('tns-core-modules/ui/dialogs');
				var inputType;
				var message = "";
				let OK = "OK";
				let Cancel = "Cancel";

				if (isYear){
					message = "Entrez l'année.";
					inputType = dialogs.inputType.number;
                }else {
					inputType = dialogs.inputType.text;
					message = "Entrez le type.";
                }

				prompt({
					title: message,
					okButtonText: OK,
					cancelButtonText: Cancel,
					inputType: inputType
				}).then(result => {

					if (result.text !== "") {
						var theShitToPost = result.text;
						console.log(theShitToPost);
						if (isYear){
							this.AddYear(theShitToPost);
                        } else{
							this.AddType(theShitToPost);
                        }
					}

				});
            },

            /**
             * Fonction qui se met en danger en allant sur les interweb pour ajouter une année (Encore une autre année
             * a endurer le maudit CSS à MARDE!) pour associer un autre film plate interprété par des acteurs
             * plus pourris les uns que les autres.
             *
             * @param theShitToPost l'année a ajouter à la base de données.
             */
			AddYear: function (theShitToPost) {

				jeSurfSurLeWeb.request({
					url: "https://pam-api.duckdns.org/kevannees",
					method: "POST",
					headers: {"Content-Type": "application/json"},
					content: JSON.stringify({
						annee: theShitToPost
					})
				}).then((response) => {
					console.log(response.toString());
				}, (e) => {
					// trapper les erreurs ici.
				});

			},

			/**
             * Fonction qui se connecte à l'entité maléfique qu'est internet pour aller ajouter dans
             * une genre de patente qui stocke des données. À ce qu'il parrait ça s'appelerait une base de données.
             * Encore une affaire non pertinente j'imagine.
             *
			 * @param theShitToPost la description du type de film.
			 */
			AddType: function (theShitToPost) {

				jeSurfSurLeWeb.request({
					url: "https://pam-api.duckdns.org/kevtypes",
					method: "POST",
					headers: {"Content-Type": "application/json"},
					content: JSON.stringify({
						description: theShitToPost.toString()
					})
				}).then((response) => {
					console.log(response.toString());
				}, (e) => {
					// trapper les erreurs ici.
				});


			}
		}

	}
</script>

<style scoped>

    /* Pour voir les styles générique, voir fichier app.scss */

    .button{
        width: 80%;
        horiz-align: center;
    }

</style>