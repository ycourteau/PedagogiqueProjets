<template>
    <Page @loaded="pageLoaded" class="page">
        <ActionBar title="Suppression" class="action-bar">
            <NavigationButton text="Go Back" android.systemIcon="ic_menu_back"
                tap="onNavBtnTap" />
        </ActionBar>

        <ScrollView>
            <StackLayout class="form home-panel">

                <Button text="Demande d'annulation"></Button>
                <!--Add your page content here-->
                <TextField id="id_enfant" hint=" l'ID de l'enfant"
                    @returnPress="focusDescription()" class="m-t-5 input input-border" />


                <Button text="DELETE" @tap="Supprimer"></Button>

            </StackLayout>
        </ScrollView>
    </Page>
</template>
<script>
    import * as http from "http";
    export default {
        data() {
            return {};
        },
        methods: {
            focusDescription: function() {
                this.$refs.txtDesc.nativeView.focus();
            },

            pageLoaded: function(args) {
                this.page = args.object;
                this.txt_id = this.page.getViewById("id_enfant");
            },
            Supprimer: function() {
                var view = require("ui/core/view");

                console.log("page = " + this.page);
                console.log("view = " + view);
                var text_id = view.getViewById(this.page, "id_enfant").text;

                http.request({
                    url: "https://pam-api.duckdns.org/menfants/" + text_id, //url: ajout de /menfants/
                    method: "DELETE",
                    headers: {
                        "Content-Type": "application/json"
                    },
                    content: JSON.stringify({
                        id: text_id // enlever le .toString car on veut une valeur numerique
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