<template>
    <Page @loaded="pageLoaded">
        <ActionBar>
            <label class="actionbarTitle" text="AJOUTER AMI"/>
            <NavigationButton text="Go Back" android.systemIcon="ic_menu_back" @tap="onBackPressed"/>
        </ActionBar>
        <FlexboxLayout class="stack" flexDirection="column">
            <Label text="Entrez le prénom:" textWrap="true" width="100%"/>
            <TextField hint="Prénom" id="firstname" class="editText" width="100%"/>
            <Label text="Entrez le nom:" textWrap="true" width="100%"/>
            <TextField hint="Nom" class="editText" width="100%" id="lastname"/>
            <Button text="Confirmer" @tap="closeModal" class="button"/>

        </FlexboxLayout>
    </Page>
</template>

<script>
    import listFirends from "./FriendList";
    import * as http from "http";

    export default {
        data(){
            return {
                page: null,
            }
        },
        methods: {

            pageLoaded: function (args) {
                this.page = args.object;
                console.log("TEST pageLoaded " + this.page.toString());
            },
            onBackPressed: function(){
                this.$navigateTo(listFirends);
            },

            /**
             * Méthode qui ferme la page et qui fait un POST à la base de
             * données pour inséré un nouvel ami.
             *
             */
            closeModal: function () {
                console.log("closeModal Function");
                var view = require("ui/core/view");
                // Assigner le texte qui se retrouve dans le TEXTFIELD avec le ID "firstname".
                var textprenom = view.getViewById(this.page, "firstname").text.toString();
                // Assigner le texte qui se retrouve dans le TEXTFIELD avec le ID "lastname".
                var textnom = view.getViewById(this.page, "lastname").text.toString();

                console.log("TEST " + textprenom + " " + textnom);

                // Appel à la base de donnée et insère un ami (POST)
                http.request({
                    url: "https://pam-api.duckdns.org/kevamis",
                    method: "POST",
                    headers: { "Content-Type": "application/json" },
                    content: JSON.stringify({
                        prenom: textprenom,
                        nom: textnom
                    })
                }).then((response) => {
					this.$navigateTo(listFirends);
                }, (e) => {
                });



            }

        }


    }
</script>

<style scoped>
.stack{
    width: 100%;
}

</style>