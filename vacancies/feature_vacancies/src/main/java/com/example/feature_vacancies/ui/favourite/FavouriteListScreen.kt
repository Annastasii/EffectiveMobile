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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.example.core_navigation.routes.VacancyInfoDestination
import com.example.core_ui.CustomColor
import com.example.core_ui.FontStyle
import com.example.core_ui.Padding
import com.example.core_ui.view.bottom_app_bar.BottomAppBar
import com.example.feature_vacancies.R
import com.example.feature_vacancies.domain.Constants
import com.example.feature_vacancies.ui.list_vacancies.getText
import com.example.feature_vacancies.ui.list_vacancies.view.Vacancy

@Composable
fun FavouriteListScreen(navController: NavController) {
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
                text = getText(count = Constants.vacancy.count()),
                color = CustomColor.TextColor,
                style = FontStyle.Style_14
            )
            Spacer(modifier = Modifier.height(Padding._16))
        }
        Constants.vacancy.forEach {
            item {
                Vacancy(
                    it,
                    onClickColumn = { navController.navigate(VacancyInfoDestination.route()) })
                Spacer(modifier = Modifier.height(Padding._12))
            }
        }
    }
    Box(contentAlignment = Alignment.BottomCenter, modifier = Modifier.fillMaxSize()) {
        BottomAppBar(navController)
    }
}