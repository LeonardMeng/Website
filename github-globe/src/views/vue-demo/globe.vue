<!--
  Created by Lingjun Meng on 11/2/21
-->
<template>
  <div id="myChart" :style="{marginleft: '200px', width: '800px', height: '800px'}"></div>
</template>

<script>
  import * as echarts from 'echarts';
  import 'echarts-gl'

  import flights from '@/static/dataset/flights'
  export default {
    name: "Globe",
    data () {
      return {
        msg: 'Welcome to Your Vue.js App'
      }
    },
    methods: {
      drawChart() {
        //Initialize the echarts instance based on the prepared dom
        let myChart = echarts.init(document.getElementById("myChart"));
        //Specify configuration items and data for the chart'
        let ROOT_PATH = 'http://localhost:8081/'
        let option = {
          backgroundColor: '#000',
          globe: {
            baseTexture: ROOT_PATH  + '/static/img/earth.jpg',
            heightTexture: ROOT_PATH + '/static/img/bathymetry_bw_composite_4k.jpg',
            displacementScale: 0.1,
            shading: 'lambert',
            environment: ROOT_PATH + '/static/img/starfield.jpg',
            light: {
              ambient: {
                intensity: 0.1
              },
              main: {
                intensity: 1.5
              }
            },
            layers: [
              {
                type: 'blend',
                blendTo: 'emission',
                texture: ROOT_PATH + '/static/img/night.jpg'
              },
              {
                type: 'overlay',
                texture: ROOT_PATH + '/static/img/clouds.png',
                shading: 'lambert',
                distance: 10
              }
            ]
          },
          series: []
        };
        console.log(option)
        //Use the configuration items and data just specified to display the chart.
        myChart.setOption(option);
      }
    },
    mounted() {
      this.drawChart();
    }
  }
</script>

<style scoped>

</style>
