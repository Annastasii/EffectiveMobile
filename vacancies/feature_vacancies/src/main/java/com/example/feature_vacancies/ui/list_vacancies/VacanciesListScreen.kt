package com.example.feature_vacancies.ui.list_vacancies

import android.provider.SyncStateContract
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
import androidx.compose.ui.res.stringResource
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
    val vacancies = if (!isOpenAllVacancy.value) vacancyList.slice(1..3) else vacancyList
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(CustomColor.PrimaryBgColor)
            .padding(start = Padding._16, top = Padding._16, end = Padding._16)
    ) {
        item { TopTextField() }
        item { InfoColumn(isOpenAllVacancy.value, offers) }
        vacancies.forEach {
            item {
//                Vacancy(
//                    it,
//                    onClickColumn = { navController.navigate(VacancyInfoDestination.route()) })
//                Spacer(modifier = Modifier.height(Padding._12))
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
                        text = getButtonText(vacancies.count()),
//                        pluralStringResource(R.plurals.count_vacancy, vacancies.count()),
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

@Composable
fun getButtonText(count: Int): String =
    when (count) {
        1 -> stringResource(id = R.string.count_vacancy, count)
        2, 3, 4 -> stringResource(id = R.string.count_vacancies2_4, count)
        in 5..9 -> stringResource(id = R.string.count_vacancies2_4, count)
        else -> stringResource(id = R.string.count_vacancies, count)
    }

@Composable
fun getText(count: Int): String =
    when (count) {
        1 -> stringResource(id = R.string.vacancy, count)
        2, 3, 4 -> stringResource(id = R.string.vacancies2_4, count)
        else -> stringResource(id = R.string.vacancies, count)
    }