package com.example.feature_vacancies.ui.vacancy_info.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.core_ui.CustomColor
import com.example.core_ui.FontStyle
import com.example.core_ui.Padding
import com.example.feature_vacancies.R
import com.example.feature_vacancies.ui.list_vacancies.state.VacancyModel

@Composable
fun CompanyInfo(item: VacancyModel) {
    Box(
        modifier = Modifier
            .background(
                CustomColor.SecondaryBgColor,
                RoundedCornerShape(10.dp)
            )
            .fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(Padding._16)) {
            Row {
                Text(
                    text = item.company,
                    color = CustomColor.TextColor,
                    style = FontStyle.Style_16
                )
                Spacer(modifier = Modifier.width(Padding._8))
                Icon(
                    painter = painterResource(id = R.drawable.ic_done),
                    contentDescription = null,
                    tint = CustomColor.Grey
                )
            }
            Spacer(modifier = Modifier.height(Padding._8))
            Image(
                painter = painterResource(id = R.drawable.map),
                contentDescription = null,
                Modifier.fillMaxWidth().size(Padding._73),
            )
            Spacer(modifier = Modifier.height(Padding._8))
            Text(
                text = item.location,
                color = CustomColor.TextColor,
                style = FontStyle.Style_14
            )
            Spacer(modifier = Modifier.height(Padding._8))
        }
    }
}