<template>
  <Page @navigatedTo="onNavigatedTo">
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
      <Label :text="theBud.prenom"/>
      <Label :text="theBud.nom"/>
    </StackLayout>
  </Page>
</template>

<script>
export default {
  props: ["bud"],

  data() {
    return {
      nom_page: "DisplayBuddyDetails.vue",
      theBud: []
    };
  },
  methods: {
    onNavigatedTo(args) {
      console.log("Navigated to -> DisplayBuddyDetails");
      this.theBud = this.bud;
      //console.log(this.theBud.prenom + " " + this.theBud.nom);
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
