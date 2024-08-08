<template>
  <main>
    <AppToolbar/>
    <v-divider></v-divider>
    <v-divider></v-divider>
    <v-divider></v-divider>
    <AnimalView/>
    <v-divider></v-divider>
    <v-divider></v-divider>
    <v-divider></v-divider>
    <HomeView/>

  </main>

</template>

<script setup lang="ts">
import HomeView from "./views/HomeView.vue";
import AppToolbar from "./shared/AppToolbar.vue";
import AnimalView from "./views/animal/AnimalView.vue";
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  /* text-align: center; */
  color: #ffffff;
  /* margin-top: 10px; */
}
</style>
