package com.example.effectivemobile.ui.view.create_restoraunt

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.example.core_navigation.routes.rest.CreateRestaurantDestination
import com.example.core_ui.Padding
import com.example.effectivemobile.R
import com.example.effectivemobile.ui.view.common.BottomBar
import com.example.effectivemobile.ui.view.common.CustomTextFiled
import com.example.effectivemobile.ui.view.common.Wrapper
import com.example.effectivemobile.ui.view.create_restoraunt.view.CheckBox

@Composable
fun CreateRestaurant(navController: NavController) {
    val checked = remember { mutableStateOf(false) }
    Wrapper(
        title = stringResource(id = R.string.create_title),
        text = stringResource(id = R.string.create_text)
    ) {
        CustomTextFiled(
            placeholder = stringResource(id = R.string.name_restaurant),
            value = "",
            onEnterValue = {},
            underText = stringResource(id = R.string.add_after),
            needUnderText = true
        )
        Spacer(modifier = Modifier.padding(Padding._16))
        CustomTextFiled(
            placeholder = stringResource(id = R.string.place),
            value = "",
            onEnterValue = {},
            underText = stringResource(id = R.string.place_text),
            needUnderText = true
        )
        Spacer(modifier = Modifier.padding(Padding._16))
        CustomTextFiled(
            placeholder = stringResource(id = R.string.address),
            value = "",
            onEnterValue = {}
        )
        Spacer(modifier = Modifier.height(Padding._16))
        CheckBox(checked = checked.value, onCheckedChange = { checked.value != checked.value })
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