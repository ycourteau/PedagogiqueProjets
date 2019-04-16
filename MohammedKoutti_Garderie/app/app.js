import Vue from 'nativescript-vue';

import home from'./components/home';

// Uncommment the following to see NativeScript-Vue output logs
 Vue.config.silent = false;

new Vue({

    render: h => h('frame', [h(home)])

}).$start();
