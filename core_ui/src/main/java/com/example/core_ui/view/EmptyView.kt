package com.example.core_ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.core_ui.CustomColor
import com.example.core_ui.view.bottom_app_bar.BottomAppBar

@Composable
fun EmptyView(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize().background(CustomColor.PrimaryBgColor)) {
    }
    Box(contentAlignment = Alignment.BottomCenter, modifier = Modifier.fillMaxSize()) {
        BottomAppBar(navController)
    }
}