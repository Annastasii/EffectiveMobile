package com.example.effectivemobile.ui.view.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.core_ui.AppColor
import com.example.core_ui.Padding
import com.example.effectivemobile.R

@Composable
fun TopBar(navController: NavController) {
    Column(modifier = Modifier.padding(Padding._12)) {
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = null)
        Spacer(modifier = Modifier.height(Padding._12))
        Row {
            BottomNavigation(){
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination
                BottomNavigationItem(
                    selected = false,
                    icon = {

                    },
                    onClick = {}
                )
            }
        }
    }
}

@Composable
fun navItem(isActive: Boolean) {
    Icon(
        painter = painterResource(id = R.drawable.ic_segment),
        contentDescription = null,
        tint = if (isActive) AppColor.ActiveColor else AppColor.NotActiveColor
    )
}