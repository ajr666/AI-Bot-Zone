<!-- 导航栏 -->
<template>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <router-link class="navbar-brand" :to="{name:'home'}">BattleBot!</router-link>
    <!-- router-link可以实现点击跳转不刷新 -->
    <div class="collapse navbar-collapse" id="navbarText">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <router-link :class="route_name=='pk_index' ? 'nav-link active' : 'nav-link' " aria-current="page" :to="{name:'pk_index'}">对战</router-link>
        </li>
        <li class="nav-item">
          <router-link :class="route_name=='record_index' ? 'nav-link active' : 'nav-link' " :to="{name:'record_index'}">对局列表</router-link>
        </li>
        <li class="nav-item">
          <router-link :class="route_name=='ranklist_index' ? 'nav-link active' : 'nav-link' " :to="{name:'ranklist_index'}">排行榜</router-link>
        </li>
      </ul>

      <ul class="navbar-nav">
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            AjrHandsome
          </a>
          <ul class="dropdown-menu">
            <li><router-link class="dropdown-item" :to="{name:'user_bot_index'}">我的Bot</router-link></li>
            <li><hr class="dropdown-divider"></li>
            <li><router-link class="dropdown-item" :to="{name:''}">退出</router-link></li>
          </ul>
        </li>

      </ul>
      
    </div>
  </div>
</nav>
</template>



<script>
import { useRoute } from 'vue-router'
import { computed } from 'vue' //实时计算
export default{
    name:'NavBar',
    setup(){
      const route = useRoute();//取出当前路径
      let route_name = computed(()=>route.name)//使当前路径名可以实时计算
      return{
        route_name
      }
    }
}
</script>


<style scoped></style>