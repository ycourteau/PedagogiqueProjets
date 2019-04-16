<template>
  <Page>
    <ActionBar title="BuddySaver"/>
    <StackLayout>
      <Label class="message" :text="nom_page"/>
      <Label class="message" :text="msg" col="0" row="0"/>
      <Button class="panic" :text="panic" @tap="onPanicButtonTap"></Button>
      <Button :text="buddysavers" @tap="onBuddySaversButtonTap"></Button>
      <Button :text="addbuddysaver" @tap="onAddBuddyButtonTap"></Button>
      <Button :text="displayalerts" @tap="onDisplayAlertsTap"></Button>
      <Button :text="displayalertslist" @tap="onDisplayAlertsListTap"></Button>
      <StackLayout class="imgAccueil"></StackLayout>
    </StackLayout>
  </Page>
</template>

<script >
import displaybuddysavers from "./DisplayBuddySavers";
import addbuddy from "./AddBuddy";
import displayalertspage from "./DisplayAlertsPage";
import displayalertslistpage from "./DisplayAlertsListPage";
import * as geolocation from "nativescript-geolocation";
import DisplayAlertsPageVue from '@/components/DisplayAlertsPage.vue';
import { Image } from "tns-core-modules/ui/image";

const httpModule = require("http");

export default {
  data() {
    return {
      nom_page: "App.vue",
      msg: "T'es dans chnoute ti-chum?",
      buddysavers: "BuddySavers",
      addbuddysaver: "Ajouter un Saver",
      displayalerts: "Alertes en cours",
      panic: "!!!À L'AIDE!!!",
      displayalertslist: "Liste des alertes"
    };
  },

  methods: {
    onBuddySaversButtonTap: function(event) {
      console.log("Button tapped");
      this.$navigateTo(displaybuddysavers);
    },

    onAddBuddyButtonTap: function(event) {
      console.log("AddBuddyButton tapped");
      this.$navigateTo(addbuddy);
    },

    onDisplayAlertsTap: function(event){
      console.log("DisplayAlertButton tapped");
      this.$navigateTo(displayalertspage);
    },

    onPanicButtonTap: function() {
      console.log("PanicButton tapped");
      alert({
        title: "Appel lancé",
        message: "L'appel a été envoyé aux BuddySavers",
        okButtonText: "OK"
      }).then(() => {
        console.log("Alert dialog closed");
      });

      var geolocation = require("nativescript-geolocation");
      var location = geolocation.getCurrentLocation({
                                  desiredAccuracy: 3,
                                  updateDistance: 10,
                                  maximumAge: 20000,
                                  timeout: 20000
                                }).then(function(loc) {
                                      console.log("Location found");
                                          if (loc) {
                                            console.log("Current location is: Lat -> {" + loc.latitude + "} Lng -> {" + loc.longitude + "}");
                                            var newAlert = {
                                              buddyId: 4,
                                              lat: loc.latitude,
                                              lng: loc.longitude
                                            }
                                            console.log(newAlert.buddyId + ">> " + newAlert.lat + " " + newAlert.lng);
                                            httpModule.request({
                                                        url: "http://pam-api.duckdns.org:1337/cedalerts",
                                                        method: "POST",
                                                        headers: { "Content-Type": "application/json" },
                                                        content: JSON.stringify({
                                                          longitude: newAlert.lng,
                                                          latitude: newAlert.lat,
                                                          cedbuddy: [newAlert.buddyId],
                                                          cedbuddysaver: [null]
                                                        })
                                                      }).then((response) => {
                                                      const result = response.content.toJSON();
                                                  }, (e) => {
                                                    console.log("Fuck il s'est passé qqch icite...");
                                                  });
                                          }
                                        },
        function(e) {
          console.log("Error: " + e.message);
        }
      );
    },

    onDisplayAlertsListTap(){
      console.log("DisplayAlertList Button tapped");
      this.$navigateTo(displayalertslistpage);
    },

    onLoaded() {
      console.log("ONLOADED SensorPage");
    },

  }
};
</script>

<style scoped>
  ActionBar {
    background-color: #53ba82;
    color: #ffffff;
  }

  .message {
    vertical-align: center;
    text-align: center;
    font-size: 20;
    color: #333333;
    background-color: aquamarine;
  }

  .panic {
    background-color: red;
  }

  .imgAccueil{
    background-image: url("~/assets/images/javascript-fuck-you.jpg");
    background-repeat: no-repeat;
    height: 240;
    margin: 150;
  }
</style>
