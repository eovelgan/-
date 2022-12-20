import Vue from 'vue'
import Vuex from 'vuex'
import axios from "axios"

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    msg: 'Список групп',
    groupList: [
        {"groupName":"УИС-111",
          "groupValue":"1"},
      {
        "groupName":"УВА-411",
        "groupValue":"2"},
      {
        "groupName":"УИС-411",
        "groupValue":"3"},
      {
        "groupName":"УВА-111",
        "groupValue":"4"},
      {
        "groupName":"УИС-112",
        "groupValue":"5"},
      {
        "groupName":"УИС-113",
        "groupValue":"6"},
      {
        "groupName":"УИС-311",
        "groupValue":"7"},
      {
        "groupName":"УИС-211",
        "groupValue":"8"}
    ]

  },
  getters: {
    getMsg (state){
      return state.msg
    },
    getGroupList(state)
    {
      return state.groupList
    }
  },
  mutations: {
    setGroupList(state, groupList){
      state.groupList = groupList
    }
  },
  actions: {
    async loadGroupList(context){
      try{
        const url = '/kis/groups'
        const response = await axios.get(url)
        const results = response.data
        context.commit('setGroupList', results)
      } catch(err){
        if (err.response){
          console.log("Server Error:", err)
        } else if (err.request){
          console.log("Network Error", err)
        } else {
          console.log("Client Error",err)
        }
      }
    }
  },
  modules: {
  }
})
