<template>
  <Page>
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
      <Mapbox
        accessToken="pk.eyJ1IjoidW1icmVsbGFjb3JwYWdlbnQiLCJhIjoiY2p0aHEyMTRtMGN1bjN5cW1yYWR4OTh5dyJ9.u8OEu5pKKYsrFB_cbMlxAQ"
        mapStyle="traffic_day"
        latitude="46.5668"
        longitude="-72.7491"
        hideCompass="true"
        zoomLevel="12"
        showUserLocation="false"
        disableZoom="false"
        disableRotation="false"
        disableScroll="false"
        disableTilt="false"
        @mapReady="onMapReady($event)"
      ></Mapbox>
    </StackLayout>
  </Page>
</template>

<script>
import * as http from "http";
import * as utils from "utils/utils";

export default {
  data() {
    return {
      nom_page: "DisplayAlertsPageVue",
      alertesEnCours: [],
      markers: []
    };
  },

  methods: {
    getAlerts(args) {
      var alert = JSON.stringify(args);
      this.alertesEnCours = args;
      this.getMarkers(this.alertesEnCours);
    },
    getMarkers(alertList) {
      for (var i = 0; i < this.alertesEnCours.length; i++) {
        console.log("***********itération #[" + i + "]***********");
        var obj = {
          lng     :   this.alertesEnCours[i].longitude,
          lat     :   this.alertesEnCours[i].latitude,
          title   :   this.alertesEnCours[i].cedbuddy.prenom + " " + this.alertesEnCours[i].cedbuddy.nom
        };
        console.log("**********obj est créé**********");
        console.log("obj = " + JSON.stringify(obj) + "{{" + i + "}}");
        this.markers.push(obj);
        console.log("this.markers = " + JSON.stringify(this.markers[i]));
      }
    },
    onMapReady(args) {
      console.log("**********On est dans onMapReady**********");
      http.getJSON("https://pam-api.duckdns.org/cedalerts").then(
        result => {
          this.alertesEnCours = result;
          console.log("**********Les results sont rentrés**********");
          console.log(JSON.stringify(result));
          this.getAlerts(result);
          args.map.addMarkers(this.markers);
        },
        error => {
          console.log(error);
        }
      );
      console.log("onMapReady " + JSON.stringify(args));
    },
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