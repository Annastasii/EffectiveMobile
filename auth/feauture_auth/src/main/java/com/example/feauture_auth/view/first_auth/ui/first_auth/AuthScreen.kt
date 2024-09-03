package com.example.feauture_auth.view.first_auth.ui.first_auth

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.core_navigation.routes.PinCodeDestination
import com.example.core_ui.Padding
import com.example.feauture_auth.R
import com.example.feauture_auth.view.first_auth.ui.first_auth.view.FindEmployeeColumn
import com.example.feauture_auth.view.first_auth.ui.first_auth.view.FindWorkColumn

@Composable
fun AuthScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .background(com.example.core_ui.CustomColor.PrimaryBgColor)
            .padding(
                horizontal = Padding._20,
                vertical = Padding._16
            )
            .fillMaxSize()
    ) {
        Text(
            text = stringResource(id = R.string.eneter_in_acc),
            color = com.example.core_ui.CustomColor.TextColor,
            style = com.example.core_ui.FontStyle.Style_20
        )
        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
            Column {
                FindWorkColumn(onButtonClick = { navController.navigate(PinCodeDestination.route()) })
                Spacer(modifier = Modifier.height(Padding._16))
                FindEmployeeColumn()
            }
        }
    }
}