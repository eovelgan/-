<template>
  <div style="text-align: center">
    <button class="btn1" v-on:click="appendRow">Добавить</button>
    <button class="btn2" v-on:click="appendRow">Удалить</button>
    <button class="btn3" v-on:click="appendRow">Изменить</button>
    <TABLE>
      <TR>
        <TH>Название</TH>
        <TH>Идентификатор группы</TH>
      </TR>
      <group-row v-for="group in groupList" v-bind:key="group.groupId" :group-data="group">
      </group-row>
    </TABLE>
  </div>
</template>

<script>
import GroupRow from "./GroupRow.vue";

export default {

  name: "GroupList",
  components: {
    GroupRow
 },
  computed:{
    groupList(){
      return this.$store.getters.getGroupList
    },
  },
  methods: {
    appendRow(){
      alert('Сообщение')
    }
  }
}
</script>

<style scoped>

TABLE{
  background: #283a32;
  width: 50%;
  margin-left: auto;
  margin-right: auto;
  border-radius: 7px;
}
TH{
  color: #dff1e8;
}
TR{
  color: #15663f;
}
TR:hover{
  color: #dff1e8;
}
TH{
  font-size: 22px;
}

.btn1{
  display: inline-block;
  box-sizing: border-box;
  margin: 0 25px 0 0;
  height: 46px;
  width: 100px;
  border: none;
  border-radius: 5px;
  font-size: 14px;
  font-weight: bold;
  background-color: #458899;
  color: #cee3e9;
}
.btn1:hover{
  transition: all 0.2s;
  background-color: #b2d7e1;
  color: #f8fbfc;
}
.btn1:active{
  background-color: #2c3e50;
}
.btn2{
  display: inline-block;
  box-sizing: border-box;
  margin: 0 25px 25px 0;
  height: 46px;
  width: 100px;
  border: none;
  border-radius: 5px;
  font-size: 14px;
  font-weight: bold;
  background-color: #458899;
  color: #cee3e9;
}
.btn2:hover{
  transition: all 0.2s;
  background-color: #b2d7e1;
  color: #f8fbfc;
}
.btn2:active{
  background-color: #2c3e50;
}
.btn3{
  display: inline-block;
  box-sizing: border-box;
  margin: 0 0 25px 0;
  height: 46px;
  width: 100px;
  border: none;
  border-radius: 5px;
  font-size: 14px;
  font-weight: bold;
  background-color: #458899;
  color: #cee3e9;
}
.btn3:hover{
  transition: all 0.2s;
  background-color: #b2d7e1;
  color: #f8fbfc;
}
.btn3:active{
  background-color: #2c3e50;
}
</style>