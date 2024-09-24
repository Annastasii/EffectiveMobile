package com.example.core_navigation.routes.rest

import com.example.core_navigation.NavigationDestination

object CreateRestaurantDestination : NavigationDestination {
    override fun route(): String = CREATE_RESTAURANT_SCREEN_ROUTE
    private const val CREATE_RESTAURANT_SCREEN_ROUTE = "create_restaurant_screen"
}