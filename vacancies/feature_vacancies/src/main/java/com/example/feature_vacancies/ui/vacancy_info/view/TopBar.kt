package com.example.feature_vacancies.ui.vacancy_info.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.core_ui.CustomColor
import com.example.core_ui.Padding
import com.example.feature_vacancies.R
import com.example.feature_vacancies.ui.common.IconFavourite

@Composable
fun TopBar(isFavourite: Boolean, onClickBack: () -> Unit, onClickFav: (Boolean) -> Unit) {
    val fav = remember { mutableStateOf(isFavourite) }
    Row(
        modifier = Modifier
            .padding(Padding._12)
            .fillMaxWidth()
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_back),
            contentDescription = null,
            tint = CustomColor.TextColor,
            modifier = Modifier.clickable { onClickBack() }
        )
        Box(contentAlignment = Alignment.TopEnd, modifier = Modifier.fillMaxWidth()) {
            Row(horizontalArrangement = Arrangement.End) {
                Icon(
                    painter = painterResource(R.drawable.ic_eyes),
                    contentDescription = null,
                    tint = CustomColor.TextColor
                )
                Spacer(modifier = Modifier.width(Padding._12))
                Icon(
                    painter = painterResource(R.drawable.ic_share),
                    contentDescription = null,
                    tint = CustomColor.TextColor
                )
                Spacer(modifier = Modifier.width(Padding._12))
                IconFavourite(isFavourite = fav.value) { onClickFav(!isFavourite) }
            }
        }
    }
}