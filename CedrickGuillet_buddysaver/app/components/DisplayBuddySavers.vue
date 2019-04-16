<template>
  <Page>
    <ActionBar title="BuddySavers">
      <NavigationButton text="Go back" @tap="$navigateBack" android.systemIcon="ic_menu_back"/>
      <ActionItem
        ios.systemIcon="2"
        ios.position="right"
        android.systemIcon="ic_menu_info_details"
      />
    </ActionBar>
    <StackLayout>
      <Label class="message" :text="nom_page"/>
      <SearchBar @textChange="onTextChanged"/>
      <ListView for="buddies in buddy.cedbuddyfriends" class="list-group" @itemTap="onItemTap">
        <v-template>
          <StackLayout class="list-group-item">
            <Label :text="buddies.id"/>
            <Label :text="buddies.prenom"/>
            <Label :text="buddies.nom"/>
          </StackLayout>
        </v-template>
      </ListView>
    </StackLayout>
  </Page>
</template>

<script>
import * as http from "http";
import displaybud from "./DisplayBuddyDetails";
import { stringify } from "querystring";

export default {
  props: ["id", "nom", "prenom"],

  mounted() {
    http.getJSON("http://pam-api.duckdns.org:1337/cedbuddies/4").then(
      result => {
        this.buddy = result;
        console.log(" result.results = " + JSON.stringify(result));
      },
      error => {
        console.log(error);
      }
    );
  },

  data() {
    return {
      nom_page: "DisplayBuddyDetails.vue",
      msg: "ListPage",
      searchedText: "",
      buddy: [],
      buddysavers: []
    };
  },

  methods: {
    onItemTap({ item }) {
      this.buddysavers = item;
      console.log("Item [" + JSON.stringify(item) + "] tapped");
      this.$navigateTo(displaybud, {
        props: {
          bud: this.buddysavers
        }
      });
    },
    onTextChanged({item}){
      /*console.log(args.value);
      this.searchedText = args.value;*/
    }
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
</style>