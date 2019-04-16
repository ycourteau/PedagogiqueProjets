<template>
    <Page class="page">
        <ActionBar title="Parent" class="action-bar" />

        <StackLayout>

            <Button class="btn" text="Inscription" @tap="goInscription"></Button>
            <Button class="btn" text="Rapport" @tap="goRapport"></Button>
            <Button class="btn" text="Events" @tap="goEvent"></Button>

        </StackLayout>

        </StackLayout>

    </Page>
</template>

<script>
    
    import Inscription from "./inscription";
    import Rapport from "./rapports";
    import ListeEvent from "./liste_events";

    export default {
        data() {
            return {};
        },
        methods: {
            goInscription() {
                this.$navigateTo(Inscription);
            },
            goRapport() {
                this.$navigateTo(Rapport);
            },
            goEvent() {
                this.$navigateTo(ListeEvent);
            }
        }
    };
</script>

<style scoped>
    .btn {
        font-size: 30;
        color: white;
        margin-top: 50;
        width: 250;
        height: 60;
        background: rgb(233, 150, 122);
    }

    Page {
        background-image: url('~/images/garderie_back.jpg');
    }
</style>