package com.example.feature_vacancies.ui.dialogs.respond.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.core_ui.CustomColor
import com.example.core_ui.FontStyle
import com.example.core_ui.Padding
import com.example.feature_vacancies.R

@Composable
fun ResumeRow() {
    Row {
        Image(
            painter = painterResource(id = R.drawable.avatar),
            contentDescription = null,
            Modifier.clip(RoundedCornerShape(20.dp)).size(Padding._48)
        )
        Spacer(modifier = Modifier.width(Padding._12))
        Column {
            Text(
                text = stringResource(R.string.resume),
                color = CustomColor.Grey,
                style = FontStyle.Style_14
            )
            Spacer(modifier = Modifier.height(Padding._8))
            Text(
                text = "UI/UX дизайнер",
                color = CustomColor.TextColor,
                style = FontStyle.Style_16
            )
        }
    }
}