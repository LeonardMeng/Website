// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import VueParticles from 'vue-particles'
import ElementUI from 'element-ui'
import locale from 'element-ui/lib/locale/lang/en'
import vueFlvPlayer from 'vue-flv-player'
import * as echarts from 'echarts';


Vue.use(ElementUI, { locale })

Vue.use(VueParticles)
Vue.config.productionTip = false
// main.js


Vue.use(vueFlvPlayer)
/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
