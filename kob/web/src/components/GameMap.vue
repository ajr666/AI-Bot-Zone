<!-- 板子 -->
<!-- ref 是一个特殊的属性，用于获取对 DOM 元素或组件实例的引用。 -->
<!-- 通过 ref 属性，可以在 Vue 组件中访问和操作底层的 DOM 元素或组件实例。 -->
<template>
    <div ref="parent" class="gamemap">
        <canvas ref="canvas" tabindex="0"></canvas>
        <!-- tabindex=0可以输入用户操作 -->
    </div>
</template>


<script>
import { GameMap } from '@/assets/scripts/GameMap';
import { ref, onMounted } from 'vue';

export default{
    setup(){
        let parent = ref(null);
        let canvas = ref(null);

        onMounted(()=>{//组件在挂载完后执行创建游戏对象
            new GameMap(canvas.value.getContext('2d'),parent.value)
        });

        return{
            parent,
            canvas
        }
    }
}
</script>



<style scoped>
    div.gamemap{
        width:100%;
        height:100%;
        /* 和父元素等长 */

        display: flex;
        justify-content: center;
        align-items: center;
    }
</style>