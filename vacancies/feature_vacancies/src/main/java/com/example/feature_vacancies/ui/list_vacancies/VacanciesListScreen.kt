package com.example.feature_vacancies.ui.list_vacancies

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
import androidx.compose.ui.res.pluralStringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.core_navigation.routes.VacancyInfoDestination
import com.example.core_ui.CustomColor
import com.example.core_ui.Padding
import com.example.core_ui.view.bottom_app_bar.BottomAppBar
import com.example.feature_vacancies.R
import com.example.feature_vacancies.ui.list_vacancies.view.InfoColumn
import com.example.feature_vacancies.ui.list_vacancies.view.TopTextField
import com.example.feature_vacancies.ui.list_vacancies.view.Vacancy

@Composable
fun VacanciesListScreen(
    navController: NavController,
    viewModel: VacanciesListViewModel = hiltViewModel(),
) {
    val offers = viewModel.offerList.collectAsState().value
    val isOpenAllVacancy = remember { mutableStateOf(false) }
    val vacancyList = viewModel.vacancyList.collectAsState().value
    val vacancies =
        if (!(isOpenAllVacancy.value) && vacancyList.count() > 2) vacancyList.slice(1..3) else vacancyList
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(CustomColor.PrimaryBgColor)
            .padding(
                start = Padding._16,
                top = Padding._16,
                end = Padding._16,
                bottom = Padding._53
            )
    ) {
        item { TopTextField() }
        item { InfoColumn(isOpenAllVacancy.value, offers, vacancyList.count()) }
        vacancies.forEach {
            item {
                Vacancy(
                    it,
                    onClickColumn = { navController.navigate(VacancyInfoDestination.createRoute(it.id)) },
                    updateFav = viewModel::changeFavourite
                )
                Spacer(modifier = Modifier.height(Padding._12))
            }
        }
        if (!(isOpenAllVacancy.value)) {
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
                        text = pluralStringResource(
                            R.plurals.count_vacancy,
                            vacancyList.count(),
                            vacancyList.count()
                        ),
                        fontSize = 14.sp
                    )
                }
            }
        }
    }
    Box(contentAlignment = Alignment.BottomCenter, modifier = Modifier.fillMaxSize()) {
        BottomAppBar(navController)
    }
}
