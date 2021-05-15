<template>

<v-data-table
    :headers="headers"
    :items="movieInfo"
    :items-per-page="5"
    class="elevation-1"
  ></v-data-table>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'MovieInfo',
    props: {
      value: Object,
      editMode: Boolean,
      isNew: Boolean
    },
    data: () => ({
        headers: [
            { text: "id", value: "id" },
        ],
        movieInfo : [],
    }),
    async created() {
      var temp = await axios.get(axios.backend + '/movieinfos')

      this.movieInfo = temp.data._embedded.movieinfos;

    },
    methods: {
    }
  }
</script>

