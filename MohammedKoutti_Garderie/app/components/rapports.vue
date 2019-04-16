<template>
    <Page class="page" @loaded="pageloaded">
        <ActionBar title="Rapport" class="action-bar" />
        <ScrollView>
            <ListView for="r in rapport" class="list-group" @itemTap="onItemTap">
                <v-template>
                    <StackLayout class="list-group-item">
                        <Label :text="r.presence" />
                        <Label :text="r.activite" />
                        <Label :text="r.sieste" />
                        <Label :text="r.humeur" />
                       
                    </StackLayout>
                </v-template>
            </ListView>
        </ScrollView>

    </Page>
</template>

<script>
    import * as http from "http";
    export default {
     methods:{
            pageloaded: function(args){
                this.page = args.object;
            }

     },
     
        data() {
            return {
                page: "",
                rapport: []
            };
        },


        mounted() {
            http.getJSON("https://pam-api.duckdns.org/mrapports").then(
                result => {
                    this.rapport = result;
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