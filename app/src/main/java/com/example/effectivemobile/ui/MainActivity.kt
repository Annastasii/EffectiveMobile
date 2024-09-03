package com.example.effectivemobile.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.core_navigation.routes.FirstDestination
import com.example.effectivemobile.ui.navigation.globalGraph

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
fun MainContent(navController: NavHostController) {
    val context = LocalContext.current
    NavHost(
        navController = navController,
        startDestination = FirstDestination.route()
    ) { globalGraph(context, navController) }
}
