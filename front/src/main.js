import Vue from 'vue'
import App from './App.vue'
import { Button, Progress, Collapse, CollapseItem, Notification } from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'


Vue.config.productionTip = false
Vue.use(Button).use(Progress).use(Collapse).use(CollapseItem)
Vue.prototype.$notify = Notification;

new Vue({
  render: h => h(App),
}).$mount('#app')
