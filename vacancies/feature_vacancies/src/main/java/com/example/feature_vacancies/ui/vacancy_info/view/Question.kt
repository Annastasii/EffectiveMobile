package com.example.feature_vacancies.ui.vacancy_info.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
fun Question() {
    val question = listOf("Где распологается место работы?", "Какой график работы?")
    Text(
        text = stringResource(id = R.string.question),
        color = CustomColor.TextColor,
        style = FontStyle.Style_14
    )
    Spacer(modifier = Modifier.height(Padding._8))
    Text(
        text = stringResource(id = R.string.question_text),
        color = CustomColor.Grey,
        style = FontStyle.Style_14
    )
    Spacer(modifier = Modifier.height(Padding._12))
    Column {
        question.forEach {
            Box(
                modifier = Modifier.background(
                    CustomColor.SecondaryBgColor,
                    RoundedCornerShape(20.dp)
                )
                    .padding(Padding._12)
            ) {
                Text(
                    text = it,
                    color = CustomColor.TextColor,
                    style = FontStyle.Style_14
                )
            }
            Spacer(modifier = Modifier.height(Padding._16))
        }
    }
}