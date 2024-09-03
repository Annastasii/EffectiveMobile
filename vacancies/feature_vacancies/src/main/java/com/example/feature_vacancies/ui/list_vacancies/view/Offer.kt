package com.example.feature_vacancies.ui.list_vacancies.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import com.example.feature_vacancies.ui.list_vacancies.state.OfferModel

@Composable
internal fun Offer(offer: OfferModel) {
    Column(
        modifier = Modifier
            .background(CustomColor.SecondaryBgColor, RoundedCornerShape(10.dp))
            .padding(Padding._12)
    ) {
        Icon(painter = painterResource(id = R.drawable.ic_c), contentDescription = null)
        Spacer(modifier = Modifier.height(Padding._16))
        Text(
            text = offer.text,
            color = CustomColor.TextColor,
            style = FontStyle.Style_14
        )
        Spacer(modifier = Modifier.height(Padding._8))
        Text(
            text = offer.text,
            color = CustomColor.Green,
            style = FontStyle.Style_14
        )
    }
}