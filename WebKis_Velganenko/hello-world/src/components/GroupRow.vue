<template>
  <TR>
    <TD>{{groupData.groupName}}</TD>
    <TD>{{groupData.groupValue}}</TD>
  </TR>
</template>

<script>
export default {
  name: "GroupRow",
  props: {
    groupData: Object
  }
}
</script>

<style scoped>
TR{
  background: #c0dcc0;
  font-size: 20px;
  font-weight: bold;
  text-align: center;
}
TR:hover{
  background-color: #32483e;
}
TD{
  border-radius: 10px;
  padding-left: 5px;
  width: 50%;
}

</style>