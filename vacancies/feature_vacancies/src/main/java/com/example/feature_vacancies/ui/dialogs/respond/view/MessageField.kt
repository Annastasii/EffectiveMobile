package com.example.feature_vacancies.ui.dialogs.respond.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.core_ui.CustomColor
import com.example.core_ui.FontStyle
import com.example.core_ui.Padding
import com.example.feature_vacancies.R

@Composable
fun MessageField() {
    val inputVersion = remember { mutableStateOf(false) }
    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxWidth()) {
        if (inputVersion.value) {
            TextField(
                value = "", onValueChange = {},
                modifier = Modifier
                    .background(CustomColor.PrimaryBgColor)
                    .clip(RoundedCornerShape(10.dp))
                    .height(Padding._48)
                    .fillMaxWidth(),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = CustomColor.PrimaryBgColor,
                    unfocusedContainerColor = CustomColor.PrimaryBgColor,
                    focusedTextColor = CustomColor.TextColor,
                    unfocusedTextColor = CustomColor.TextColor
                ),
                placeholder = {
                    Text(
                        text = stringResource(R.string.your_message),
                        color = CustomColor.Grey,
                        style = FontStyle.Style_14
                    )
                }
            )
        } else {
            Spacer(modifier = Modifier.height(Padding._16))
            Text(
                text = stringResource(R.string.add_message),
                color = CustomColor.Green,
                style = FontStyle.Style_16,
                modifier = Modifier.clickable { inputVersion.value = true }
            )
        }
    }
    Spacer(modifier = Modifier.height(Padding._16))
}