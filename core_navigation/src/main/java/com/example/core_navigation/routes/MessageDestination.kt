package com.example.core_navigation.routes

import com.example.core_navigation.NavigationDestination

object MessageDestination : NavigationDestination {
    override fun route(): String = MESSAGE_SCREEN_ROUTE
    private const val MESSAGE_SCREEN_ROUTE = "message_screen"
}