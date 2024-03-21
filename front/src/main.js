import Vue from 'vue'
import App from './App.vue'
import { Button } from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'


Vue.config.productionTip = false
Vue.use(Button)

new Vue({
  render: h => h(App),
}).$mount('#app')
