package com.example.core_navigation.routes

import com.example.core_navigation.NavigationDestination

/**
 * Путь к стартовомоу экрану приложения
 */
object FirstDestination : NavigationDestination {
    override fun route(): String = FIRST_SCREEN_ROUTE
    private const val FIRST_SCREEN_ROUTE = "first_screen"
}