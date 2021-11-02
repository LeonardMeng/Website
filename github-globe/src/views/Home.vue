<!--
  Created by Lingjun Meng on 9/1/21
-->
<template>
  <div class="player">
    <vue-flv-player
        :autoplay="true"
        :controls="true"
        :muted="true"
        type="mp4"
        ref="myPlayer"

        :source="src" />
  </div>
</template>

<script>
  export default {
    name: "Home",
    data() {
      return {
        src:'http://vjs.zencdn.net/v/oceans.mp4'
      };
    },
    mounted() {
      // const files = require.context('需要读取的文件路径', false, /.svg$/).keys();
      // console.log(files)
    }
  }
</script>

<style scoped>
.player{
  width:100%;
  height: 100%;
  position: absolute;
}
</style>
