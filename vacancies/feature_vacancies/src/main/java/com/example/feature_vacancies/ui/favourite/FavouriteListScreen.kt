package com.example.feature_vacancies.ui.favourite

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.pluralStringResource
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.core_navigation.routes.VacancyInfoDestination
import com.example.core_ui.CustomColor
import com.example.core_ui.FontStyle
import com.example.core_ui.Padding
import com.example.core_ui.view.bottom_app_bar.BottomAppBar
import com.example.feature_vacancies.R
import com.example.feature_vacancies.ui.list_vacancies.view.Vacancy

@Composable
fun FavouriteListScreen(
    navController: NavController,
    viewModel: FavouriteListViewModel = hiltViewModel(),
) {
    val vacancies = viewModel.vacancyList.collectAsState().value
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(CustomColor.PrimaryBgColor)
            .padding(Padding._16)
    ) {
        item {
            Text(
                text = stringResource(id = R.string.favourite),
                color = CustomColor.TextColor,
                style = FontStyle.Style_20
            )
        }
        item {
            Spacer(modifier = Modifier.height(Padding._20))
            Text(
                text = pluralStringResource(R.plurals.vacancy, vacancies.count(), vacancies.count()),
                color = CustomColor.TextColor,
                style = FontStyle.Style_14
            )
            Spacer(modifier = Modifier.height(Padding._16))
        }
        vacancies.forEach {
            item {
                Vacancy(
                    it,
                    onClickColumn = { navController.navigate(VacancyInfoDestination.route()) },
                    updateFav = viewModel::changeFavourite)
                Spacer(modifier = Modifier.height(Padding._12))
            }
        }
    }
    Box(contentAlignment = Alignment.BottomCenter, modifier = Modifier.fillMaxSize()) {
        BottomAppBar(navController)
    }
}