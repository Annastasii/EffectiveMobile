package com.example.effectivemobile.ui.view.welcome

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.example.core_navigation.routes.rest.CreateRestaurantDestination
import com.example.core_ui.Padding
import com.example.effectivemobile.R
import com.example.effectivemobile.ui.view.common.BottomBar
import com.example.effectivemobile.ui.view.common.Wrapper
import com.example.effectivemobile.ui.view.common.CustomTextFiled

@Composable
fun WelcomeScreen(navController: NavController) {
    Wrapper(
        title = stringResource(id = R.string.welcome),
        text = stringResource(R.string.enter_data)
    ) {
        Spacer(modifier = Modifier.height(Padding._24))
        CustomTextFiled(
            value = "",
            placeholder = stringResource(R.string.name),
            onEnterValue = {})
        Spacer(modifier = Modifier.height(Padding._16))
        CustomTextFiled(
            value = "",
            placeholder = stringResource(R.string.phone_or_email),
            onEnterValue = {})
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        BottomBar(
            enabled = true,
            onClick = { navController.navigate(CreateRestaurantDestination.route()) },
            iconBack = false
        )
    }
}