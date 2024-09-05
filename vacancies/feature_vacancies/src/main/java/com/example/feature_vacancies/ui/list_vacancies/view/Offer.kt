package com.example.feature_vacancies.ui.list_vacancies.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.core_ui.CustomColor
import com.example.core_ui.FontStyle
import com.example.core_ui.Padding
import com.example.feature_vacancies.R
import com.example.feature_vacancies.domain.models.OfferModel

@Composable
internal fun Offer(offer: OfferModel) {
    val uriHandler = LocalUriHandler.current
    Column(
        modifier = Modifier
            .background(CustomColor.SecondaryBgColor, RoundedCornerShape(10.dp))
            .padding(Padding._12)
            .width(Padding._132)
            .height(Padding._120)
    ) {
        if (offer.id != null) {
            Icon(painter = painterResource(GetIcon(id = offer.id)), contentDescription = null, tint = GetIconColor(offer.id))
        }
        Spacer(modifier = Modifier.height(Padding._16))
        Text(
            text = offer.title,
            color = CustomColor.TextColor,
            style = FontStyle.Style_14
        )
        offer.textButton?.let {
            Spacer(modifier = Modifier.height(Padding._1))
            Text(
                text = it,
                color = CustomColor.Green,
                style = FontStyle.Style_14,
                modifier = Modifier.clickable {
                    uriHandler.openUri(offer.link)
                }
            )
        }
    }
}

@Composable
private fun GetIcon(id: String): Int =
    when (id) {
        "near_vacancies" -> R.drawable.ic_c
        "level_up_resume" -> R.drawable.ic_star
        "temporary_job" -> R.drawable.ic_letter
        else -> R.drawable.ic_c
    }

@Composable
private fun GetIconColor(id: String): Color =
    when (id) {
        "near_vacancies" -> CustomColor.NotActiveButtonColor
        "level_up_resume", "temporary_job" -> CustomColor.DarkGreen
        else -> CustomColor.DarkGreen
    }