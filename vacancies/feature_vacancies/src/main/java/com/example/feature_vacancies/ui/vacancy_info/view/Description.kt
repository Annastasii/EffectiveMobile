package com.example.feature_vacancies.ui.vacancy_info.view

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.core_ui.CustomColor
import com.example.core_ui.FontStyle
import com.example.core_ui.Padding
import com.example.feature_vacancies.R
import com.example.feature_vacancies.domain.models.VacancyModel

@Composable
fun Description(item: VacancyModel) {
    Spacer(modifier = Modifier.height(Padding._12))
    item.description?.let{
        Text(
            text = it,
            color = CustomColor.TextColor,
            style = FontStyle.Style_14
        )
    }
    Spacer(modifier = Modifier.height(Padding._16))
    Text(
        text = stringResource(id = R.string.your_task),
        color = CustomColor.TextColor,
        style = FontStyle.Style_20
    )
    Spacer(modifier = Modifier.height(Padding._12))
    Text(
        text = item.responsibilities,
        color = CustomColor.TextColor,
        style = FontStyle.Style_14
    )
    Spacer(modifier = Modifier.height(Padding._20))
}