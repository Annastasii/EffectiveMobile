package com.example.core_navigation.routes

import com.example.core_navigation.NavigationDestination

object ResponseDestination : NavigationDestination {
    override fun route(): String = RESPONSE_SCREEN_ROUTE
    private const val RESPONSE_SCREEN_ROUTE = "response_screen"
}