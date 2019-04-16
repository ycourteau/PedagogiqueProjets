<template>
    <Page>
        <ActionBar title="Manager" class="action-bar" />
        <StackLayout width="70%" height="100%">
            <Button text="Enfants" left="10" top="50" width="60%" height="10%"
                @tap="goEnfants" />
            <Button text="Inscription" left="10" top="170" width="60%" height="10%"
                @tap="goDemande" />
            <Button text="Évenements" left="10" top="290" width="60%" height="10%"
                @tap="goEvenements" />
            <Button text="ModiEnfant" left="10" top="170" width="60%" height="10%"
                @tap="goUpdate" />
            <Button text="DeleteEnfant" left="10" top="290" width="60%"
                height="10%" @tap="goSupp" />

        </StackLayout>
    </Page>
</template>

<script>
    import Enfants from "./enfants";
    import liste_inscrits from "./liste_inscrits";
    import evenements from "./evenements";
    import update from "./modifEnfant";
    import suppression from "./suppEnfant";

    export default {
        data() {
            return {};
        },
        methods: {
            goEnfants() {
                this.$navigateTo(Enfants);
            },
            goDemande() {
                this.$navigateTo(liste_inscrits);
            },
            goEvenements() {
                this.$navigateTo(evenements);
            },
            goUpdate() {
                this.$navigateTo(update);
            },
            goSupp() {
                this.$navigateTo(suppression);
            }
        }
    };
</script>

<style scoped>
    Button {
        margin: 10 20;
        background-color: rgb(177, 163, 163)
    }

    Page {
        background-image: url('~/images/garderie_back.jpg');
    }
</style>