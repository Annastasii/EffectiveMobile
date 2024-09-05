package com.example.core_navigation.routes

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.example.core_navigation.NavigationDestination

object PinCodeDestination : NavigationDestination {
    override fun route(): String = "$PIN_CODE_SCREEN_ROUTE/{$EMAIL}"

    override val arguments: List<NamedNavArgument>
        get() = listOf(
            navArgument(EMAIL) { type = NavType.StringType }
        )

    const val EMAIL = "email"
    private const val PIN_CODE_SCREEN_ROUTE = "defect_details_screen"

    fun createRoute(email: String) =
        "$PIN_CODE_SCREEN_ROUTE/$email"
}