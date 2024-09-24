package com.example.core_navigation.routes.rest

import com.example.core_navigation.NavigationDestination

object WelcomeDestination : NavigationDestination {
    override fun route(): String = WELCOME_SCREEN_ROUTE
    private const val WELCOME_SCREEN_ROUTE = "welcome_screen"
}