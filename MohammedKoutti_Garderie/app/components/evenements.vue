<template>
    <Page @loaded="pageLoaded" class="page">
        <ActionBar title="Evenement" class="action-bar">
            <NavigationButton text="Go Back" android.systemIcon="ic_menu_back"
                tap="onNavBtnTap" />
        </ActionBar>

        <ScrollView>
            <StackLayout class="form home-panel">

                <Button text="Fiche Evenement"></Button>
                <!--Add your page content here-->
                <TextField id="id_date_event" hint=" date de l'evenement "
                    @returnPress="focusDescription()" class="m-t-5 input input-border" />
                <TextField id="id_adresse_event" hint=" Adresse de l'évenement"
                    @returnPress="focusDescription()" class="m-t-5 input input-border" />
                <Button text="Enregister" @tap="EnregisterEvent"></Button>


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
                txt_dateEvent: "",
                txt_adresseEvent: ""
            };
        },
        methods: {
            focusDescription: function() {
                this.$refs.txtDesc.nativeView.focus();
            },
            pageLoaded: function(args) {
                this.page = args.object;
                this.txt_dateEvent = this.page.getViewById(
                    "id_date_event");
                this.txt_adresseEvent = this.page.getViewById(
                    "id_adresse_event");
            },
            EnregisterEvent: function() {
                var view = require("ui/core/view");
                console.log("page = " + this.page);
                console.log("view = " + view);

                var date_Event = view
                    .getViewById(this.page, "id_date_event")
                    .text.toString();

                var adresse_Event = view
                    .getViewById(this.page, "id_adresse_event")
                    .text.toString();

                http.request({
                    url: "https://pam-api.duckdns.org/mevents/",
                    method: "POST",
                    headers: {
                        "Content-Type": "application/json"
                    },
                    content: JSON.stringify({
                        date: date_Event,
                        adresse: adresse_Event
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