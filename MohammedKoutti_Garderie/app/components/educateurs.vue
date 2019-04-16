<template>
    <Page @loaded="pageLoaded" class="page">
        <ActionBar title="Educateur(trice)" class="action-bar">
            <NavigationButton text="Go Back" android.systemIcon="ic_menu_back"
                tap="onNavBtnTap" />
        </ActionBar>

        <ScrollView>
            <StackLayout class="form home-panel">

                <Button text="Fiche Enfant"></Button>
                <!--Add your page content here-->
                <TextField id="id_presence" hint=" présence" @returnPress="focusDescription()"
                    class="m-t-5 input input-border" />
                <TextField id="id_alimentation" hint=" Alimentation"
                    @returnPress="focusDescription()" class="m-t-5 input input-border" />
                <TextField id="id_activites" hint=" Activités" @returnPress="focusDescription()"
                    class="m-t-5 input input-border" />
                <TextField id="id_sieste" hint=" Durée de la sieste"
                    keyboardType="number" @returnPress="focusDescription()"
                    class="m-t-5 input input-border" />
                <TextField id="id_humeur" hint="Humeur" @returnPress="focusDescription()"
                    class="m-t-5 input input-border" />
                <TextField id="id_photo" hint=" Url_photo" @returnPress="focusDescription()"
                    class="m-t-5 input input-border" />
                <TextField id="id_note" hint=" Notes" ref="txtDesc" class="m-t-5 input input-border" />
                <Button text="Enregister" @tap="Enregister"></Button>
                <Button text="Prendre une photo" @tap="goCamera"></Button>

            </StackLayout>
        </ScrollView>
    </Page>
</template>
<script>
    import * as http from "http";
    import camera from "./camera";
    export default {
        data() {
            return {
                page: "",
                txt_presence: "",
                txt_alimentation: "",
                txt_activites: "",
                txt_sieste: "",
                txt_humeur: "",
                txt_photo: ""
            };
        },
        methods: {
            focusDescription: function() {
                this.$refs.txtDesc.nativeView.focus();
            },
            goCamera: function() {
                this.$navigateTo(camera);
            },
            pageLoaded: function(args) {
                this.page = args.object;
                this.txt_presence = this.page.getViewById("id_presence");
                this.txt_activites = this.page.getViewById("id_activites");
                this.txt_alimentation = this.page.getViewById(
                    "id_alimentation");
                this.txt_sieste = this.page.getViewById("id_sieste");
                this.txt_humeur = this.page.getViewById("id_humeur");
                this.txt_note = this.page.getViewById("id_note");
            },
            Enregister: function() {
                var view = require("ui/core/view");

                console.log("page = " + this.page);
                console.log("view = " + view);
                var pres = view
                    .getViewById(this.page, "id_presence")
                    .text.toString();
                //console.log("presence = " + presence);
                var alim = view
                    .getViewById(this.page, "id_alimentation")
                    .text.toString();
                //console.log("alimentation = " + alimentation);
                var act = view
                    .getViewById(this.page, "id_activites")
                    .text.toString();
                //console.log("activites = " + activites);
                var sies = view.getViewById(this.page, "id_sieste").text;
                //console.log("sieste = " + sieste);
                var hum = view.getViewById(this.page, "id_humeur").text;
                console.log("humeur = " + hum);
                var not = view.getViewById(this.page, "id_note").text;
                //console.log("note = " + note);

                http.request({
                    url: "https://pam-api.duckdns.org/mrapports",
                    method: "POST",
                    headers: {
                        "Content-Type": "application/json"
                    },
                    content: JSON.stringify({
                        presence: pres,
                        alimentation: alim,
                        sieste: sies,
                        note: not,
                        humeur: hum,
                        activites: act
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