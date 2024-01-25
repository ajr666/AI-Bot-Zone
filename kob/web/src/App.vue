<template>
  <div>
    <NavBar /> 
    <!-- 3.然后即可使用 -->
  </div>
  <RouterView></RouterView>
</template>

<script>
import NavBar from './components/NavBar.vue'//想在App.vue页面使用NavBar模块，1.先导入
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap"
import $ from 'jquery'
export default {
  components:{
    NavBar, //2. 在components里加入NavBar模块。
  },
  setup(){
    $.ajax({
      url:"http://localhost:3000/user/account/token/",
      type:"post",
      //contentType: "application/json;charset=UTF-8",
            data: {
              username: 'ajrHandsome',
              password: 'ajr666'
            },
      success(resp){
        console.log(resp);
      },
      error(resp){
        console.log(resp);
      }
    });
    $.ajax({
      url:"http://localhost:3000/user/account/info/",
      type:"get",
      headers:{
        Authorization:"Bearer "+"eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIyZDJjNzg2OGMyOGQ0MjlkOGVlNTBhZWEwOGZhZGIwMiIsInN1YiI6IjEiLCJpc3MiOiJzZyIsImlhdCI6MTY5MDk5NTI1MiwiZXhwIjoxNjkyMjA0ODUyfQ.Rjr8DJwHQeNCNaoGJvWGBdHeSbLDvlYQ9srtVeNWdNA"
      },
      success(resp){
        console.log(resp);
      },
      error(resp){
        console.log(resp);
      }
    });
  }
}
</script>

<style>

</style>
