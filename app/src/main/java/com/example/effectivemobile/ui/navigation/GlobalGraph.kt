package com.example.effectivemobile.ui.navigation

import android.content.Context
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.example.core_navigation.composable
import com.example.core_navigation.routes.ResponseDestination
import com.example.core_navigation.routes.FavouriteListDestination
import com.example.core_navigation.routes.FirstDestination
import com.example.core_navigation.routes.MessageDestination
import com.example.core_navigation.routes.PinCodeDestination
import com.example.core_navigation.routes.ProfileDestination
import com.example.core_navigation.routes.VacanciesListDestination
import com.example.core_navigation.routes.VacancyInfoDestination
import com.example.core_navigation.routes.rest.CreateRestaurantDestination
import com.example.core_navigation.routes.rest.WelcomeDestination
import com.example.core_ui.view.EmptyView
import com.example.effectivemobile.ui.view.create_restoraunt.CreateRestaurant
import com.example.effectivemobile.ui.view.welcome.WelcomeScreen
import com.example.feature_vacancies.ui.favourite.FavouriteListScreen
import com.example.feature_vacancies.ui.list_vacancies.VacanciesListScreen
import com.example.feature_vacancies.ui.vacancy_info.VacancyInfoScreen
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

    composable(
        destination = VacancyInfoDestination
    ) { VacancyInfoScreen(navController) }

    composable(
        destination = FavouriteListDestination
    ) { FavouriteListScreen(navController) }

    composable(
        destination = ResponseDestination
    ) { EmptyView(navController) }

    composable(
        destination = MessageDestination
    ) { EmptyView(navController) }

    composable(
        destination = ProfileDestination
    ) { EmptyView(navController) }



    composable(
        destination = WelcomeDestination
    ) { WelcomeScreen(navController) }

    composable(
        destination = CreateRestaurantDestination
    ) { CreateRestaurant(navController) }
}
