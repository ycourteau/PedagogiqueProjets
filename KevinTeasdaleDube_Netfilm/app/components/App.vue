<template>
    <Page @loaded="pageLoaded">
        <ActionBar>
            <label class="actionbarTitle" text="Netfilm"/>
            <ActionItem text="Settings" android.position="popup" android.systemIcon="ic_menu_more" @tap="onSettingTap"/>
            <ActionItem text="Extra" android.position="popup" android.systemIcon="ic_menu_more" @tap="onExtraTap"/>
        </ActionBar>
<<<<<<< HEAD
        <StackLayout>
          <Label class="message" text="Je suis la page d'accueil"/>
          <button text="Liste de hkjhfkjshfkjhsdkjfhsdkjhfaskjdhfkjshfFilms" @tap="onButtonListTap" class="button"/>
          <button text="Liste des films prêtés" @tap="onSharedListTap" class="button"/>
          <button text="Liste de amis" @tap="onFriendListTap" class="button"/>
=======
        <StackLayout verticalAlignment="center">
            <button text="Liste de Films" @tap="onButtonListTap" class="button"/>
            <button text="Liste des films prêtés" @tap="onSharedListTap" class="button"/>
            <button text="Liste d'amis" @tap="onFriendListTap" class="button"/>
>>>>>>> d66ca2662700541b2d4b8b6ff186deeeff0ebf49
        </StackLayout>

    </Page>
</template>

<script>
	import movieslistpage from "./MoviesListPage";
	import friendlist from "./FriendList";
	import sharedmovies from "./SharedMovies";
	import extra from "./Extra";
	import settings from "./setting";
	import * as app from 'tns-core-modules/application'
	import * as platform from 'tns-core-modules/platform'
	import * as color from 'tns-core-modules/color'

	export default {
		data() {
			return {
				fullMovieList: []
			}
		},
		methods: {

            /**
             * Lorsque le bouton est appuyé, nous sommes basculé
             * vers la liste de films.
             */
			onButtonListTap: function () {
				this.$navigateTo(movieslistpage)
			},
            /**
             * Nous donne accès à la liste d'amis/es.
             */
			onFriendListTap: function () {
				this.$navigateTo(friendlist);
			},
            /**
             * Bascule vers la page qui contient tous les films prêtés.
             */
			onSharedListTap: function () {
				this.$navigateTo(sharedmovies)
			},

            /**
             * Petit extra qui je l'espère sera apprécié.
             */
			onExtraTap: function () {
				this.$navigateTo(extra)
			},
            /**
             * Nous envoies vers la section Settings de l'application.
             */
			onSettingTap: function () {
				this.$navigateTo(settings);
			},

			/**
			 * Lorsque la page se charge, la couleur de la StatusBar est changée
			 * si la version du téléphone (Android) est plus grande ou égale a 21.
			 */
			pageLoaded() {
				if (app.android && platform.device.sdkVersion >= "21") {
					const window = app.android.foregroundActivity.getWindow();
					window.setStatusBarColor(new color.Color("#000000").android);
				}
			},
		}
	}


</script>

<style scoped>

    /* Pour voir les styles génériques, voir fichier app.scss */

    .button {
        width: 80%;
        horiz-align: center;
    }

</style>
