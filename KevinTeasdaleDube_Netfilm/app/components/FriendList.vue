<template>
    <Page>
        <ActionBar>
            <label class="actionbarTitle" text="AMIS"></label>
            <NavigationButton text="Go Back" android.systemIcon="ic_menu_back" @tap="onBackPressed"></NavigationButton>
            <ActionItem android.position="actionBar" android.systemIcon="ic_menu_add" @tap="onAddFriendTap"></ActionItem>
        </ActionBar>
        <StackLayout orientation="vertical">
            <!-- Header -->
            <Label class="header" text="Liste d'amis/es"></Label>
            <!-- ListView de tous les amis/es. -->
            <ListView class="listview" for="item in friendlist" @itemTap="friendTap">
                <v-template>
                    <StackLayout orientation="horizontal" class="listviewcell" vertictalAlignment="center">
                        <Label :text="item.prenom + ' ' + item.nom" class="listViewLabel" textWrap="true"></Label>
                    </StackLayout>
                </v-template>
            </ListView>
        </StackLayout>
    </Page>
</template>

<script>
	import home from "./App";
	import dialogFragment from "./AddFriend";
	import friendDetail from "./FriendDetail"
	import * as http from "http";

	export default {
		props: ["allMyFriendAreHere"],

		mounted() {

			this.friendlist = this.allMyFriendAreHere;
			// Va chercher tous les amis dans la base de données.
			http.getJSON("https://pam-api.duckdns.org/kevamis").then(
				result => {
					this.friendlist = result;
				}, error => {
				}
			);
		},
		data() {
			return {
				friendlist: [],
			}
		},
		methods: {
			/**
             * Retour à la case départ. Home Sweet Home! Retour à la page principale.
             */
			onBackPressed: function () {
				this.$navigateTo(home);
			},

			/**
			 * Fonction qui lance une autre page pour ajouter un ami.
			 * Bouton se retrouve dans l'ActionBar du coté droit.
			 */
			onAddFriendTap: function () {
				this.$navigateTo(dialogFragment)

			},
			/**
			 * Fonction qui nous propulse vers la page FriendDetail avec l'ami qui
			 * se trouve à la position que l'utilisateur a sélectionné.
			 *
			 * @param index position dans la ListView de l'ami.
			 * @param e
			 */
			friendTap: function ({index, e}) {
				console.log(JSON.stringify(this.friendlist[index]));
				this.$navigateTo(friendDetail, {
					props: {
						friend: this.friendlist[index]
					}
				})
			}

		}
	}


</script>

<style scoped>

    .listview {
        height: 100%;
    }
</style>
