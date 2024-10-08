package com.example.feature_vacancies.ui.list_vacancies.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.pluralStringResource
import androidx.compose.ui.res.stringResource
import com.example.core_ui.CustomColor
import com.example.core_ui.FontStyle
import com.example.core_ui.Padding
import com.example.feature_vacancies.R
import com.example.feature_vacancies.domain.models.OfferModel

@Composable
fun InfoColumn(isOpenAllVacancy: Boolean, offers: List<OfferModel>, count: Int) {
    if (!isOpenAllVacancy) {
        if (offers.isNotEmpty()) {
            LazyRow(
                Modifier.padding(top = Padding._12)
            ) {
                offers.forEach {
                    item {
                        Offer(it)
                        Spacer(modifier = Modifier.width(Padding._12))
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(Padding._18))
        Text(
            text = stringResource(id = R.string.for_you),
            color = CustomColor.TextColor,
            style = FontStyle.Style_16
        )
    } else {
        Spacer(modifier = Modifier.height(Padding._12))
        Row(Modifier.fillMaxWidth()) {
            Text(
                text = pluralStringResource(R.plurals.vacancy, count, count),
                color = CustomColor.TextColor,
                style = FontStyle.Style_14
            )
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopEnd) {
                Row {
                    Text(
                        text = stringResource(id = R.string.sot),
                        color = CustomColor.LinkColor,
                        style = FontStyle.Style_14
                    )
                    Spacer(modifier = Modifier.width(Padding._8))
                    Icon(
                        painter = painterResource(id = R.drawable.ic_sort),
                        contentDescription = null,
                        tint = CustomColor.LinkColor
                    )
                }
            }
        }
    }
    Spacer(modifier = Modifier.height(Padding._16))
}
