package com.example.effectivemobile.ui.navigation

import android.content.Context
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.example.core_navigation.composable
import com.example.core_navigation.routes.FirstDestination
import com.example.core_navigation.routes.PinCodeDestination
import com.example.core_navigation.routes.VacanciesListDestination
import com.example.feature_vacancies.ui.list_vacancies.VacanciesListScreen
import com.example.feauture_auth.view.first_auth.ui.first_auth.AuthScreen
import com.example.feauture_auth.view.first_auth.ui.pin_code.PinCodeScreen

/** Глобальный навигационный граф */
fun NavGraphBuilder.globalGraph(
    context: Context,
    navController: NavController,
) {

    composable(
        destination = FirstDestination
    ) { AuthScreen(navController) }

    composable(
        destination = PinCodeDestination
    ) { PinCodeScreen(navController) }

    composable(
        destination = VacanciesListDestination
    ) { VacanciesListScreen(navController) }
}
