import { createRouter, createWebHistory } from 'vue-router'
import PkIndexView from '@/views/pk/PkIndexView' 
import RecordIndexView from '@/views/record/RecordIndexView'
import RanklistIndexView from '@/views/ranklist/RanklistIndexView'
import NotFoundView from '@/views/error/NotFoundView'
import UserBotIndexView from '@/views/user/bots/UserBotIndexView'

const routes = [
  {
    path:"/",//根目录重定向
    name:"home",
    redirect:"/pk/"
  },
  {
    path:"/pk/",//写域名后面的路径
    name:"pk_index",
    component:PkIndexView
  },
  {
    path:"/error/",//写域名后面的路径
    name:"404_index",
    component:NotFoundView
  },
  {
    path:"/ranklist/",//写域名后面的路径
    name:"ranklist_index",
    component:RanklistIndexView
  },
  {
    path:"/record/",//写域名后面的路径
    name:"record_index",
    component:RecordIndexView
  },
  {
    path:"/user/bots/",//写域名后面的路径
    name:"user_bot_index",
    component:UserBotIndexView
  },
  {
    path:"/./catchAll(.*)",
    name:"404_index",
    redirect:"/error/"
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
