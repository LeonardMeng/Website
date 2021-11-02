import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/views/Home'
import Globe from '@/views/vue-demo/globe'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    {
      path: '/Globe',
      name: 'Globe',
      component: Globe
    }

  ]
})
