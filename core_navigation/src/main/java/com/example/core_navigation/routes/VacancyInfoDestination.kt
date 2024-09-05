package com.example.core_navigation.routes

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.example.core_navigation.NavigationDestination

object VacancyInfoDestination : NavigationDestination {
    override fun route(): String = "$VACANCY_INFO_SCREEN_ROUTE/{${ID}}"


    override val arguments: List<NamedNavArgument>
        get() = listOf(
            navArgument(ID) { type = NavType.StringType }
        )

    const val ID = "id"
    private const val VACANCY_INFO_SCREEN_ROUTE = "vacancy_info_screen"

    fun createRoute(id: String) =
        "$VACANCY_INFO_SCREEN_ROUTE/$id"
}