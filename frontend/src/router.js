
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/OrderManager"

import MovieInfo from "./components/movieInfo"
import PayManager from "./components/PayManager"

import SeatsManager from "./components/SeatsManager"

import TicketingManager from "./components/TicketingManager"


import Mypage from "./components/mypage"
export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/Order',
                name: 'OrderManager',
                component: OrderManager
            },

            {
                path: '/movieInfo',
                name: 'movieInfo',
                component: movieInfo
            },
            {
                path: '/Pay',
                name: 'PayManager',
                component: PayManager
            },

            {
                path: '/Seats',
                name: 'SeatsManager',
                component: SeatsManager
            },

            {
                path: '/Ticketing',
                name: 'TicketingManager',
                component: TicketingManager
            },


            {
                path: '/mypage',
                name: 'mypage',
                component: mypage
            },


    ]
})
