<template>
  <div id="app">
    <hello-world>
    </hello-world>
    <group-list>
    </group-list>
  </div>
</template>

<script>
import HelloWorld from "@/components/HelloWorld";
import GroupList from "@/components/GroupList.vue";

export default {
  components:{
    HelloWorld,
    GroupList
  },
  async mounted(){
    await this.$store.dispatch('loadGroupList')

  }
}
</script>

<style lang="less">
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

nav {
  padding: 30px;

  a {
    font-weight: bold;
    color: #2c3e50;
    background: #FCAA67;
    &.router-link-exact-active {
      color: #42b983;
    }
  }
}
</style>
