<template>
    <Page class="page" @loaded="pageloaded">
        <ActionBar title="Liste d'enfants Inscrits" class="action-bar" />
        <ScrollView>
            <ListView for="i in Inscrits" class="list-group" @itemTap="onItemTap">
                <v-template>
                    <StackLayout class="list-group-item">
                        <Label :text="i.nom" />
                        <Label :text="i.prenom" />
                        <Label :text="i.adresse" />
                    </StackLayout>
                </v-template>
            </ListView>
        </ScrollView>

    </Page>
</template>

<script>
    import * as http from "http";
    export default {
        methods: {
            pageloaded: function(args) {
                this.page = args.object;
            }
        },

        data() {
            return {
                page: "",
                Inscrits: []
            };
        },

        mounted() {
            http.getJSON("https://pam-api.duckdns.org/menfants").then(
                result => {
                    this.Inscrits = result;
                },
                error => {
                    console.log(error);
                }
            );
        }
    };
</script>
<style>
    Page {
        background-image: url('~/images/garderie_back.jpg');
    }
</style>