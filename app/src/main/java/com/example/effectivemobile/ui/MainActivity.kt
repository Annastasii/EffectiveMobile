package com.example.effectivemobile.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.core_navigation.routes.rest.WelcomeDestination
import com.example.effectivemobile.ui.navigation.globalGraph
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController: NavHostController = rememberNavController()
            MainContent(navController = navController)
        }
    }
}

@Composable
fun MainContent(navController: NavHostController,  viewModel: MainViewModel = hiltViewModel()) {
    val context = LocalContext.current
    NavHost(
        navController = navController,
        startDestination = WelcomeDestination.route()
    ) { globalGraph(context, navController) }
}
