package com.example.feature_vacancies.ui.favourite

import androidx.compose.foundation.clickable
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.core_ui.CustomColor
import com.example.feature_vacancies.R

@Composable
internal fun IconFavourite(isFavourite: Boolean, onClick: () -> Unit) {
    Icon(
        painter = if (isFavourite) painterResource(id = R.drawable.ic_favourite_full) else painterResource(
            id = R.drawable.ic_favourite
        ),
        contentDescription = null,
        tint = if (isFavourite) CustomColor.ActiveButtonColor else CustomColor.ButtonTextColor,
        modifier = Modifier.clickable { onClick() }
    )
}