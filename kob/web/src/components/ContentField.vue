<!-- 内容区 -->
<template>
    <div class="card content-field">
        <div class="card">
            <div class="card-body">
                <!-- 填充内容放在slot里 -->
                <slot></slot>
            </div>
        </div>
    </div>
</template>


<script>

</script>


<style scoped>
div.content-field{
    margin-top: 20px;
}
</style>