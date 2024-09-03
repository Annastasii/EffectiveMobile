package com.example.core_navigation.routes

import com.example.core_navigation.NavigationDestination

object PinCodeDestination  : NavigationDestination {
    override fun route(): String = PIN_CODE_SCREEN_ROUTE
    private const val PIN_CODE_SCREEN_ROUTE = "pin_code_screen"
}