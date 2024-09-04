package com.example.feature_vacancies.ui.vacancy_info.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.core_ui.CustomColor
import com.example.core_ui.FontStyle
import com.example.core_ui.Padding
import com.example.feature_vacancies.R

@Composable
fun StatisticRow() {
    Row(horizontalArrangement = Arrangement.Center) {
        CustomBox {
            Text(
                text = stringResource(R.string.resp, "122"),
                color = CustomColor.TextColor,
                style = FontStyle.Style_14
            )
        }
        Spacer(modifier = Modifier.width(Padding._12))
        CustomBox {
            Text(
                text = stringResource(R.string.looking, "2"),
                color = CustomColor.TextColor,
                style = FontStyle.Style_14
            )
        }
    }
    Spacer(modifier = Modifier.height(Padding._12))
}

@Composable
private fun CustomBox(content: @Composable () -> Unit) {
    Box(
        modifier = Modifier
            .background(CustomColor.DarkGreen, RoundedCornerShape(10.dp))
            .height(Padding._53)
            .width(Padding._175)
            .padding(Padding._12),
    ) {
        content()
    }
}