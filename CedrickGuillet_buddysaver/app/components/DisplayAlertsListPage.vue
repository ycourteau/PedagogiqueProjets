<template>
    <page>
        <ActionBar title="Alertes en cours">
            <NavigationButton text="Go back" @tap="$navigateBack" android.systemIcon="ic_menu_back"/>
            <ActionItem
                ios.systemIcon="2"
                ios.position="right"
                android.systemIcon="ic_menu_info_details"
            />
        </ActionBar>
        <StackLayout>
            <Label class="message" :text="nom_page"/>
            <ListView for="alerte in alertesEnCours" class="list-group" @itemTap="onItemTap">
                <v-template if="alerte.answered">
                    <StackLayout class="list-group-item" background="#c9df8a">
                        <Label :text="alerte.id"/>
                        <Label :text="alerte.cedbuddy.prenom"/>
                        <Label :text="alerte.updated_at"/>
                    </StackLayout>
                </v-template>
                <v-template>
                    <StackLayout class="list-group-item" background="#ff7b7b">
                        <Label :text="alerte.id"/>
                        <Label :text="alerte.cedbuddy.prenom"/>
                        <Label :text="alerte.updated_at"/>
                    </StackLayout>
                </v-template>
            </ListView>
        </StackLayout>
    </page>
</template>

<script>

import * as http from "http";

export default {

    mounted() {
        http.getJSON("https://pam-api.duckdns.org/cedalerts").then(
            result => {
                this.alertesEnCours = result;
                console.log("**********Les results sont rentrés**********");
                this.getAlerts(this.alertesEnCours);
            },
        error => {
            console.log(error);
        });
    },

    data() {
        return {
            nom_page: "DisplayAlertsListPageVue",
            alertesEnCours: []
        };
    },
    
    methods: {
        getAlerts(args) {
            var alerte = JSON.stringify(args);
            this.alertesEnCours = args;
            this.hasResponse();
        },

        onItemTap({ index, e }) {
            var myAlert = this.alertesEnCours[index];
            console.log("https://pam-api.duckdns.org/cedalerts/" + myAlert.id);
            var dialogs = require("tns-core-modules/ui/dialogs");

            dialogs.action("Peux-tu répondre à l'alerte?", "Je fais semblant de pas l'avoir vu...", ["J'suis là pour toé ti-chum!", "Non man je suis un criss de lâche"]).then(function (result) {
                if(result == "J'suis là pour toé ti-chum!"){
                    console.log("Positif");
                    http.request({
                        url: "https://pam-api.duckdns.org/cedalerts/" + myAlert.id,
                        method: "PUT",
                        headers: { "Content-Type": "application/json" },
                        content: JSON.stringify({
                            cedbuddysaver: [4]
                        })
                    }).then((response) => {
                        const result = response.content.toJSON();
                    }, (e) => {
                        console.log("Fuck il s'est passé qqch icite...");
                    });
                }else if(result == "Non man je suis un lâche"){
                    console.log("Négatif");
                }
            });
        },

        hasResponse(){
            console.log("Le programme devrait faire " + this.alertesEnCours.length + " itérations ici...");
            for(var i = 0; i < this.alertesEnCours.length; i++){
                if(this.alertesEnCours[i].cedbuddysaver){
                    Object.assign(this.alertesEnCours[i], { answered: true });
                }
                /*dateToDelete = this.alertesEnCours[i].created_at;
                console.log(dateToDelete + " ->la date originale")
                dateToDelete.setDate(dateToDelete.getDate());
                console.log(dateToDelete + " ->la date +1");*/
            }
        }
    }
}
</script>

<style scoped>
  .message {
    vertical-align: center;
    text-align: center;
    font-size: 20;
    color: #333333;
    background-color: aquamarine;
  }
</style>
