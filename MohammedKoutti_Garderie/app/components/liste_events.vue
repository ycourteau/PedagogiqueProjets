<template>
    <Page class="page" @loaded="pageloaded">
        <ActionBar title="Liste des événements" class="action-bar" />
        <ScrollView>
            <ListView for="e in events" class="list-group" @itemTap="onItemTap">
                <v-template>
                    <StackLayout class="list-group-item">
                        <Label :text="e.date" />
                        <Label :text="e.adresse" />
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
                events: []
            };
        },

        mounted() {
            http.getJSON("https://pam-api.duckdns.org/mevents").then(
                result => {
                    this.events = result;
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