<template>
    <page>

        <ActionBar title="Navigation Page">
            <NavigationButton text="Go back" @tap="$navigateBack" android.systemIcon="ic_menu_back"/>
            <ActionItem
            ios.systemIcon="2"
            ios.position="right"
            android.systemIcon="ic_menu_info_details"/>
        </ActionBar>

        <StackLayout>
            <Label class="message" :text="nom_page"/>
            <TextField text="Nom"/>
            <TextField text="Numéro"/>
            <Button text="+Yep Buddy!" />
        </StackLayout>

    </page>
</template>

<script>
export default {
    data() {
    return {
      nom_page: "AddBuddy.vue",
    };
  },

}
</script>

<style>
  .message {
    vertical-align: center;
    text-align: center;
    font-size: 20;
    color: #333333;
    background-color: aquamarine;
  }
</style>
