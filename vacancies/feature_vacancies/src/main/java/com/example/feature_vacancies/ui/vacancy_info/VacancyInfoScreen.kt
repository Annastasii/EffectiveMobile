package com.example.feature_vacancies.ui.vacancy_info

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.core_ui.CustomColor
import com.example.core_ui.FontStyle
import com.example.core_ui.Padding
import com.example.feature_vacancies.R
import com.example.feature_vacancies.ui.dialogs.respond.RespondDialog
import com.example.feature_vacancies.ui.list_vacancies.state.VacancyModel
import com.example.feature_vacancies.ui.vacancy_info.view.CompanyInfo
import com.example.feature_vacancies.ui.vacancy_info.view.Description
import com.example.feature_vacancies.ui.vacancy_info.view.MainInfo
import com.example.feature_vacancies.ui.vacancy_info.view.Question
import com.example.feature_vacancies.ui.vacancy_info.view.StatisticRow
import com.example.feature_vacancies.ui.vacancy_info.view.TopBar

@Composable
fun VacancyInfoScreen() {
    val item = VacancyModel(
        name = "UI/UX Designer",
        looking = "7",
        cost = "Уровень дохода не указан",
        location = "Минск",
        company = "Мобирикс",
        experience = "Опыт от 1 года до 3 лет",
        publicationDate = "26 августа"
    )
    val openDialog = remember { mutableStateOf(false) }
    if (openDialog.value) {
        RespondDialog(onDismiss = { openDialog.value = false })
    }
    LazyColumn(
        Modifier
            .background(CustomColor.PrimaryBgColor)
            .padding(Padding._12)
            .fillMaxSize()
    ) {
        item { TopBar() }
        item { MainInfo(item = item) }
        item { StatisticRow() }
        item { CompanyInfo(item = item) }
        item { Description() }
        item { Question() }
        item {
            Button(
                onClick = { openDialog.value = true },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = CustomColor.Green,
                    disabledContainerColor = CustomColor.Green,
                    contentColor = CustomColor.Green,
                    disabledContentColor = CustomColor.Green
                )
            ) {
                Text(
                    text = stringResource(id = R.string.respond),
                    style = FontStyle.Style_16,
                    color = CustomColor.TextColor
                )
            }
        }
    }
}