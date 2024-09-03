package com.example.core_navigation.routes

import com.example.core_navigation.NavigationDestination

object VacanciesListDestination : NavigationDestination {
    override fun route(): String = VACANCIES_LIST_SCREEN_ROUTE
    private const val VACANCIES_LIST_SCREEN_ROUTE = "vacancies_list_screen"
}