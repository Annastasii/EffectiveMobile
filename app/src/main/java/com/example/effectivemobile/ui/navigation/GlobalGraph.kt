package com.example.effectivemobile.ui.navigation

import android.content.Context
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.example.core_navigation.composable
import com.example.core_navigation.routes.FirstDestination
import com.example.feauture_auth.view.first_auth.AuthScreen

/** Глобальный навигационный граф */
fun NavGraphBuilder.globalGraph(
    context: Context,
    navController: NavController,
) {

    composable(
        destination = FirstDestination
    ) { AuthScreen() }

}
