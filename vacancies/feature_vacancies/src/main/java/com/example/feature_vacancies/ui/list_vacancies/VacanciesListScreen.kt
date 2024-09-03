package com.example.feature_vacancies.ui.list_vacancies

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.core_ui.CustomColor
import com.example.core_ui.FontStyle
import com.example.core_ui.Padding
import com.example.feature_vacancies.R
import com.example.feature_vacancies.domain.Constants
import com.example.feature_vacancies.ui.list_vacancies.view.InfoColumn
import com.example.feature_vacancies.ui.list_vacancies.view.Offer
import com.example.feature_vacancies.ui.list_vacancies.view.Vacancy

@Composable
fun VacanciesListScreen(navController: NavController) {
    val isOpenAllVacancy = remember { mutableStateOf(false) }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(CustomColor.PrimaryBgColor)
            .padding(start = Padding._16, top = Padding._16, end = Padding._16)
    ) {
        item {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                TextField(
                    value = "EE", onValueChange = {},
                    modifier = Modifier
                        .background(CustomColor.SecondaryBgColor)
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
                        .background(CustomColor.SecondaryBgColor),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_setting),
                        contentDescription = null,
                        modifier = Modifier.padding(Padding._12)
                    )
                }
            }
        }
        item {
            InfoColumn(isOpenAllVacancy.value)
        }
        item {
            Spacer(modifier = Modifier.height(Padding._16))
        }
        if (!isOpenAllVacancy.value) {
            Constants.vacancy.slice(1..3).forEach {
                item {
                    Vacancy(it)
                    Spacer(modifier = Modifier.height(Padding._12))
                }
            }
        } else {
            Constants.vacancy.forEach {
                item {
                    Vacancy(it)
                    Spacer(modifier = Modifier.height(Padding._12))
                }
            }
        }

        if (!isOpenAllVacancy.value) {
            item {
                Button(
                    onClick = { isOpenAllVacancy.value = true },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = CustomColor.ActiveButtonColor,
                        disabledContainerColor = CustomColor.NotActiveButtonColor,
                        contentColor = CustomColor.TextColor,
                        disabledContentColor = CustomColor.NotActiveTextColor
                    )
                ) {
                    Text(
                        text = getButtonText(Constants.vacancy.count()),
                        fontSize = 14.sp
                    )
                }
            }
        }
    }
}

@Composable
fun getButtonText(count: Int): String =
    when (count) {
        1 -> stringResource(id = R.string.count_vacancy, count)
        2, 3, 4 -> stringResource(id = R.string.count_vacancies2_4, count)
        else -> stringResource(id = R.string.count_vacancies, count)
    }

@Composable
fun getText(count: Int): String =
    when (count) {
        1 -> stringResource(id = R.string.vacancy, count)
        2, 3, 4 -> stringResource(id = R.string.vacancies2_4, count)
        else -> stringResource(id = R.string.vacancies, count)
    }