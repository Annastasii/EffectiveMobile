package com.example.core_navigation.routes

import com.example.core_navigation.NavigationDestination

object VacancyInfoDestination : NavigationDestination {
    override fun route(): String = VACANCY_INFO_SCREEN_ROUTE
    private const val VACANCY_INFO_SCREEN_ROUTE = "vacancy_info_screen"
}