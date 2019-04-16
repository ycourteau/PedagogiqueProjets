<template>
    <Page @loaded="pageLoaded" class="page">
        <ActionBar title="Inscription" class="action-bar">
            <NavigationButton text="Go Back" android.systemIcon="ic_menu_back"
                tap="onNavBtnTap" />
        </ActionBar>

        <ScrollView>
            <StackLayout class="form home-panel">

                <Button text="Demande d'inscription"></Button>
                <!--Add your page content here-->
                <TextField id="id_nom" hint=" nom de l'enfant" @returnPress="focusDescription()"
                    class="m-t-5 input input-border" />
                <TextField id="id_prenom" hint=" prénom de l'enfant"
                    @returnPress="focusDescription()" class="m-t-5 input input-border" />
                <TextField id="id_adresse" hint=" adresse de l'enfant"
                    @returnPress="focusDescription()" class="m-t-5 input input-border" />

                <Button text="Enregister" @tap="Enregister"></Button>

            </StackLayout>
        </ScrollView>
    </Page>
</template>
<script>
    import * as http from "http";
    export default {
        data() {
            return {
                page: "",
                txt_nom: "",
                txt_prenom: "",
                txt_adresses: ""
            };
        },
        methods: {
            focusDescription: function() {
                this.$refs.txtDesc.nativeView.focus();
            },

            pageLoaded: function(args) {
                this.page = args.object;
                this.txt_nom = this.page.getViewById("id_nom");
                this.txt_prenom = this.page.getViewById("id_prenom");
                this.txt_adresses = this.page.getViewById("id_adresse");
            },
            Enregister: function() {
                var view = require("ui/core/view");

                console.log("page = " + this.page);
                console.log("view = " + view);
                var nom_enfant = view
                    .getViewById(this.page, "id_nom")
                    .text.toString();

                var prenom_enfant = view
                    .getViewById(this.page, "id_prenom")
                    .text.toString();

                var adresse_enfant = view
                    .getViewById(this.page, "id_adresse")
                    .text.toString();

                http.request({
                    url: "https://pam-api.duckdns.org/menfants",
                    method: "POST",
                    headers: {
                        "Content-Type": "application/json"
                    },
                    content: JSON.stringify({
                        nom: nom_enfant,
                        prenom: prenom_enfant,
                        adresse: adresse_enfant
                    })
                }).then(
                    response => {
                        const result = response.content.toJSON();
                        console.log(result);
                    },
                    e => {
                        console.log("erreur: " + e.message);
                    }
                );
            }
        }
    };
</script>

<style scoped>
    Button {
        margin-bottom: 10;
        color: black;
        width: 200;
        height: 60;
        background: #e6eff0;
    }

    .home-panel {

        font-size: 20;
        margin: 30;
        margin-top: 0;
    }

    .s1 {
        width: 50;
        height: 30;
    }

    StackLayout {
        height: 650;

        color: black;
        background: #FFFFFF;
        margin-top: 0;
    }

    Page {
        background-image: url('~/images/garderie_back.jpg');
    }

    .description-label {
        margin-bottom: 15;
    }
</style>