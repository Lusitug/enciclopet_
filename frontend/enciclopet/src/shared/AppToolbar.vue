  <script setup>
  import { ref } from 'vue'
  import Logopet from '@/assets/logopet(1).png'

  const menu = ref(false)
  const fav = ref(true)
  const message = ref(false)
  const hints = ref(true)

  const items = [
    {
      title: 'Home',
      disabled: false,
      href: '/',
    },
    {
      title: 'Page 1',
      disabled: false,
      href: 'Page1',
    },
    {
      title: 'Page 2',
      disabled: true,
      href: 'Page2',
    },
  ]


  </script>
<template>
    <v-card
      class="toolbar-card"
      height="100px"
      rounded="1"
      flat
    >
    
      <v-toolbar density="compact" class="toolbar" elevation="3">

            <v-btn class="titulo" text href="/">
                <v-avatar class="mr-2" rounded="1" size="40">
                  <v-img :src="Logopet" />
                </v-avatar>

                <v-toolbar-title>EncycloPet</v-toolbar-title>
            </v-btn>
  
            <v-spacer></v-spacer>
            
            <!-- ALTERAR -->

        <v-menu
          v-model="menu"
          :close-on-content-click="false"
          location="end"
        >
          <template v-slot:activator="{ props }">
            <v-btn
              icon
              v-bind="props"
              class="toolbar-icon"
            >
              <v-icon color="black">mdi-dots-vertical</v-icon>
            </v-btn>
          </template>
  
          <v-card min-width="300">
            <v-list>
              <v-list-item
                prepend-avatar="https://cdn.vuetifyjs.com/images/john.jpg"
                subtitle="Founder of Vuetify"
                title="John Leider"
              >
                <template v-slot:append>
                  <v-btn
                    :class="fav ? 'text-red' : ''"
                    icon="mdi-heart"
                    variant="text"
                    @click="fav = !fav"
                  ></v-btn>
                </template>
              </v-list-item>
            </v-list>
  
            <v-divider></v-divider>
  
            <v-list>
              <v-list-item>
                <v-switch
                  v-model="message"
                  color="purple"
                  label="Enable messages"
                  hide-details
                ></v-switch>
              </v-list-item>
  
              <v-list-item>
                <v-switch
                  v-model="hints"
                  color="purple"
                  label="Enable hints"
                  hide-details
                ></v-switch>
              </v-list-item>
            </v-list>
  
            <v-card-actions>
              <v-spacer></v-spacer>
  
              <v-btn
                variant="text"
                @click="menu = false"
              >
                Cancel
              </v-btn>
              <v-btn
                color="primary"
                variant="text"
                @click="menu = false"
              >
                Save
              </v-btn>
            </v-card-actions>
          </v-card>
        </v-menu>

        <!-- ALTERAR -->



      </v-toolbar>
      
     
        <div>
          <v-breadcrumbs
            :items="items"
            divider=">"
          ></v-breadcrumbs>
        </div>
         
    </v-card>
  </template>
  
  <style scoped>
  .toolbar-card {
    background-color: #e0e0e0;
  }
  
  .toolbar {
    background-color: #ffffff;
    box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
    border-bottom: 1px solid #212121;
  }
  
  .titulo {
    font-size: 24px;
    color: #4a4a4a;
    display: flex;
    align-items: center;
    padding: 0 16px;
  }
  
  .titulo:hover {
    color: #f39121;
  }
  
  .toolbar-icon {
    margin: 0 8px;
  }
  
  .toolbar-icon:hover .v-icon {
    color: #2196f3;
  }
  .logo {
  margin-right: 8px; /* Espaçamento entre a logo e o título */
}
  </style>
  