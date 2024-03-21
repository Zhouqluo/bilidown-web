<template>

  <div>
      <el-button>{{text}}</el-button>
  </div>

</template>

<script>
import axios from "axios"
axios.defaults.baseURL = "http://127.0.0.1:8989"
export default {
  data() {
    return {
      text: ''
    }
  },
  mounted() {
    axios.get('/').then(resp => {
      this.text = resp.data;
    })
  }
}
</script>


