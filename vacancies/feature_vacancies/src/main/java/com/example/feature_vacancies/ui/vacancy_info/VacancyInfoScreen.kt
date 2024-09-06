package com.example.feature_vacancies.ui.vacancy_info

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.core_ui.CustomColor
import com.example.core_ui.FontStyle
import com.example.core_ui.Padding
import com.example.core_ui.view.bottom_app_bar.BottomAppBar
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
fun VacancyInfoScreen(
    navController: NavController,
    viewModel: VacancyInfoViewModel = hiltViewModel(),
) {
    val vacancy = viewModel.vacancy.collectAsState().value
    val openDialog = remember { mutableStateOf(false) }
    if (openDialog.value) {
        RespondDialog(onDismiss = { openDialog.value = false })
    }
    vacancy?.let {
        LazyColumn(
            Modifier
                .background(CustomColor.PrimaryBgColor)
                .padding(Padding._12)
                .fillMaxSize()
        ) {
            item {
                TopBar(
                    onClickBack = { navController.navigateUp() },
                    isFavourite = vacancy.isFavorite,
                    onClickFav = { viewModel.changeFavourite(vacancy.id, it) }
                )
            }
            item { MainInfo(item = vacancy) }
            item { StatisticRow(vacancy) }
            item { CompanyInfo(item = vacancy) }
            item { Description(vacancy) }
            item { Question(vacancy) }
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
                Spacer(modifier = Modifier.height(Padding._73))
            }
        }
    }
    Box(contentAlignment = Alignment.BottomCenter, modifier = Modifier.fillMaxSize()) {
        BottomAppBar(navController)
    }
}