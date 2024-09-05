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
import java.util.Locale

@Composable
fun MainInfo(item: VacancyModel) {
    Spacer(modifier = Modifier.height(Padding._16))
    Text(
        text = item.title,
        color = CustomColor.TextColor,
        style = FontStyle.Style_22
    )
    Spacer(modifier = Modifier.height(Padding._20))
    item.fullSalary?.let {
        Text(
            text = it,
            color = CustomColor.TextColor,
            style = FontStyle.Style_14
        )
        Spacer(modifier = Modifier.height(Padding._12))
    }
    Text(
        text = stringResource(id = R.string.exp, item.textExperience),
        color = CustomColor.TextColor,
        style = FontStyle.Style_14
    )
    Spacer(modifier = Modifier.height(Padding._8))
    Text(
        text = firstUpperCase(item.schedules.joinToString()),
        color = CustomColor.TextColor,
        style = FontStyle.Style_14
    )
    Spacer(modifier = Modifier.height(Padding._16))
}

fun firstUpperCase(word: String): String {
    return word.substring(0, 1)
        .uppercase(Locale.getDefault()) + word.substring(1) //или return word;
}