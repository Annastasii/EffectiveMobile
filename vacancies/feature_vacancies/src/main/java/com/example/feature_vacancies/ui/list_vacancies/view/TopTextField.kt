package com.example.feature_vacancies.ui.list_vacancies.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.core_ui.CustomColor
import com.example.core_ui.Padding
import com.example.feature_vacancies.R

@Composable
fun TopTextField() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        TextField(
            value = "", onValueChange = {},
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .height(Padding._48),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = CustomColor.InputTextColor,
                unfocusedContainerColor = CustomColor.InputTextColor,
                focusedTextColor = CustomColor.TextColor,
                unfocusedTextColor = CustomColor.TextColor
            )
        )
        Spacer(modifier = Modifier.width(Padding._12))
        Box(
            modifier = Modifier
                .background(CustomColor.SecondaryBgColor, RoundedCornerShape(10.dp)),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_setting),
                contentDescription = null,
                modifier = Modifier.padding(Padding._12),
                tint = CustomColor.TextColor
            )
        }
    }
}