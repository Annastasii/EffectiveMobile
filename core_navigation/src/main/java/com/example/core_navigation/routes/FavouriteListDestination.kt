package com.example.core_navigation.routes

import com.example.core_navigation.NavigationDestination

object FavouriteListDestination : NavigationDestination {
    override fun route(): String = FAVOURITE_LIST_SCREEN_ROUTE
    private const val FAVOURITE_LIST_SCREEN_ROUTE = "favourite_list_screen"
}