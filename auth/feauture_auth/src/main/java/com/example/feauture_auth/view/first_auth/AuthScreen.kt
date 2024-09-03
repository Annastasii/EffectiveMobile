package com.example.feauture_auth.view.first_auth

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
import com.example.feauture_auth.R

@Composable
fun AuthScreen() {
    Box(
        modifier = Modifier
            .background(com.example.core_ui.CustomColor.PrimaryBgColor)
            .padding(
                horizontal = com.example.core_ui.Padding._12,
                vertical = com.example.core_ui.Padding._16
            )
            .fillMaxSize()
    ) {
        Text(
            text = stringResource(id = R.string.eneter_in_acc),
            color = com.example.core_ui.CustomColor.TextColor,
            style = com.example.core_ui.FontStyle.Style_20
        )
        Box(contentAlignment = Alignment.Center) {
            Column(
                modifier = Modifier
                    .background(com.example.core_ui.CustomColor.SecondaryBgColor)
                    .clip(RoundedCornerShape(5.dp))
                    .padding(
                        vertical = com.example.core_ui.Padding._18,
                        horizontal = com.example.core_ui.Padding._12
                    ),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(id = R.string.finder_work),
                    color = com.example.core_ui.CustomColor.TextColor,
                    style = com.example.core_ui.FontStyle.Style_16
                )
                Spacer(modifier = Modifier.height(com.example.core_ui.Padding._16))
                Row {
                    Button(
                        onClick = { },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp)
                            .weight(1f),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = com.example.core_ui.CustomColor.ActiveButtonColor,
                            disabledContainerColor = com.example.core_ui.CustomColor.NotActiveButtonColor,
                            contentColor = com.example.core_ui.CustomColor.TextColor,
                            disabledContentColor = com.example.core_ui.CustomColor.NotActiveTextColor
                        )
                    ) {
                        Text(
                            text = stringResource(R.string.continu),
                            fontSize = 14.sp
                        )
                    }
                    Spacer(modifier = Modifier.width(com.example.core_ui.Padding._16))
                    Text(
                        text = stringResource(id = R.string.enter_with_pas),
                        modifier = Modifier.clickable { },
                        color = com.example.core_ui.CustomColor.LinkColor,
                        style = com.example.core_ui.FontStyle.Style_14
                    )
                }
            }
        }
    }
}