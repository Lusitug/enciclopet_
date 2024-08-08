<template>
  <v-sheet
    class="pa-0"
    elevation="8"
    width="100vw"
  >
    <v-slide-group
      v-model="model"
      class="pa-4 full-width-slide-group"
      center-active
      show-arrows
    >
      <v-slide-group-item
        v-for="n in 15"
        :key="n"
        v-slot="{ isSelected, toggle }"
      >
        <v-card
          :color="isSelected ? 'primary' : 'grey-lighten-1'"
          class="ma-4"
          height="300"
          width="200"
          @click="toggle"
        >
          <div class="d-flex fill-height align-center justify-center">
            <v-scale-transition>
              <v-icon
                v-if="isSelected"
                color="white"
                icon="mdi-close-circle-outline"
                size="48"
              ></v-icon>
            </v-scale-transition>
          </div>
        </v-card>
      </v-slide-group-item>
    </v-slide-group>
  </v-sheet>
</template>
  
<script setup lang="ts">
import { ref } from 'vue';
const model = ref(null)
</script>
  
<style scoped>
.full-width-slide-group {
  width: 100vw;
  overflow-x: auto;
}
</style>