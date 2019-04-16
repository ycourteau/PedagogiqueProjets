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
          <StackLayout class="list-group-item" color="red">
            <Label :text="alerte.id"/>
            <Label :text="alerte.cedbuddy.prenom"/>
            <Label :text="alerte.updated_at"/>
          </StackLayout>
        </v-template>
        <v-template>
          <StackLayout class="list-group-item">
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
        this.getAlerts(this.alertesEnCours);
        console.log("**********Les results sont rentrés**********");
        this.hasResponse();
      },
      error => {
        console.log(error);
      }
    );
  },

  data() {
    return {
      nom_page: "DisplayAlertsListPageVue",
      alertesEnCours: []
    };
  },

  methods: {
    getAlerts(args) {
      var alerte = JSON.stringify(args); // soit tu utilises la variable locale alerte (pas de this.alerte, ce nE<st pas une variable d<instance!),
      // soit tu utilise la variable d<instance this.alertesEnCours
      // mais pas les 2!!!
      this.alertesEnCours = args; // pour assigner args a this.alertesEncours tu dois .stringify
      console.log(
        "########################################### les alertes" +
          this.alertesEnCours
        //this.alertesEnCours
      );
      console.log(
        "******************************** nbr alertes: " +
          this.alertesEnCours.length
      );
      for (var i = 0; i < this.alertesEnCours.length; i++) {
        console.log(JSON.stringify(this.alertesEnCours[i])); // ajout du .stingify
      }
    },

    onItemTap({ index, e }) {
      console.log("**********Alerte no." + index + " a été cliquée**********");
      var myAlert = this.alertesEnCours[index];
      console.log("https://pam-api.duckdns.org/cedalerts/" + myAlert.id);
      var dialogs = require("tns-core-modules/ui/dialogs");

      dialogs
        .action([
          "Peux-tu répondre à l'alerte?",
          "Je fais semblant de pas l'avoir vu...",
          "J'suis là pour toé ti-chum!",
          "Non man je suis un criss de lâche"
        ])
        .then(function(result) {
          //console.log("Dialog result: " + result);
          if (result == "J'suis là pour toé ti-chum!") {
            console.log("Positif");
            http
              .request({
                url: "https://pam-api.duckdns.org/cedalerts/" + myAlert.id,
                method: "PUT",
                headers: { "Content-Type": "application/json" },
                content: JSON.stringify({
                  cedbuddysaver: [4]
                })
              })
              .then(
                response => {
                  const result = response.content.toJSON();
                },
                e => {
                  console.log("Fuck il s'est passé qqch icite...");
                }
              );
          } else if (result == "Non man je suis un lâche") {
            console.log("Négatif");
          }
        });
    },

    hasResponse() {
      console.log(
        "Le programme devrait faire " +
          this.alertesEnCours.length +
          " itérations ici..."
      );
      // pas de () a length
      for (var i = 0; i < this.alertesEnCours.length; i++) {
        console.log("On check si la caliss dalerte a une caliss de réponse : ");
        //console.log(JSON.stringify(this.alertesEnCours[i].cedbuddysaver));

        // Note 1: l'utilisation des try-catch est tres pratique pour connaitre la source des erreurs
        // et empecher l'app de planter au premier pepin
        // Note 2: !== null : ne pas verifier si un objet est nul: en JS il peut etre undefined, nul, vide, etc. verifier seulement s'il existe
        // Note 3: this.alertesEnCours.buddysaver ce champ n<Existe pas dans la bd: cedbuddysaver
        try {
          if (this.alertesEnCours[i].cedbuddysaver) {
            Object.assign(this.alertesEnCours[i], { answered: true });
            console.log(JSON.stringify(this.alertesEnCours[i].cedbuddysaver));
          }
        } catch (error) {
          console.log("error = " + error);
        }
      }
    }
  }
};
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


