package com.example.feature_vacancies.ui.vacancy_info.view

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.core_ui.CustomColor
import com.example.core_ui.FontStyle
import com.example.core_ui.Padding
import com.example.feature_vacancies.ui.list_vacancies.state.VacancyModel

@Composable
fun MainInfo(item: VacancyModel) {
    Spacer(modifier = Modifier.height(Padding._16))
    Text(
        text = item.name,
        color = CustomColor.TextColor,
        style = FontStyle.Style_22
    )
    Spacer(modifier = Modifier.height(Padding._20))
    Text(
        text = item.cost,
        color = CustomColor.TextColor,
        style = FontStyle.Style_14
    )
    Spacer(modifier = Modifier.height(Padding._12))
    Text(
        text = item.experience,
        color = CustomColor.TextColor,
        style = FontStyle.Style_14
    )
    Spacer(modifier = Modifier.height(Padding._8))
    Text(
        text = "Полная занятость, полный день",
        color = CustomColor.TextColor,
        style = FontStyle.Style_14
    )
    Spacer(modifier = Modifier.height(Padding._16))
}