import { createApp } from 'vue';
import App from './App.vue';

// Import Vuetify and its styles
import { createVuetify } from 'vuetify';
import 'vuetify/styles';
import * as components from 'vuetify/components';
import * as directives from 'vuetify/directives';
import '@mdi/font/css/materialdesignicons.css';

// Create Vuetify instance
const vuetify = createVuetify({
  components,
  directives,
  icons: {
    defaultSet: 'mdi',
  },
});
// Create and mount the Vue app
createApp(App).use(vuetify).mount('#app');
