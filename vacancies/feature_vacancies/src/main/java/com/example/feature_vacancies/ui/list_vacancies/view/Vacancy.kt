package com.example.feature_vacancies.ui.list_vacancies.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.core_ui.CustomColor
import com.example.core_ui.FontStyle
import com.example.core_ui.Padding
import com.example.feature_vacancies.R
import com.example.feature_vacancies.ui.common.IconFavourite
import com.example.feature_vacancies.ui.list_vacancies.state.VacancyModel

@Composable
internal fun Vacancy(item: VacancyModel, onClickColumn: () -> Unit) {
    Column(
        modifier = Modifier
            .background(CustomColor.SecondaryBgColor, RoundedCornerShape(10.dp))
            .padding(Padding._12)
            .clickable { onClickColumn() }
    ) {
        Row(Modifier.fillMaxWidth()) {
            Text(
                text = stringResource(id = R.string.now_looking, item.looking),
                color = CustomColor.Green,
                style = FontStyle.Style_14
            )
            Box(contentAlignment = Alignment.TopEnd, modifier = Modifier.fillMaxWidth()) {
                IconFavourite(isFavourite = item.isFavourite, onClick = {})
            }
        }
        Spacer(modifier = Modifier.height(Padding._12))
        Text(
            text = item.name,
            color = CustomColor.TextColor,
            style = FontStyle.Style_16
        )
        Spacer(modifier = Modifier.height(Padding._12))
        Text(
            text = item.location,
            color = CustomColor.TextColor,
            style = FontStyle.Style_14
        )
        Spacer(modifier = Modifier.height(Padding._12))
        Row {
            Text(
                text = item.company,
                color = CustomColor.TextColor,
                style = FontStyle.Style_14
            )
            Spacer(modifier = Modifier.width(Padding._8))
            Icon(
                painter = painterResource(id = R.drawable.ic_done),
                contentDescription = null,
                tint = CustomColor.TextColor
            )
        }
        Spacer(modifier = Modifier.height(Padding._12))
        Row {
            Icon(
                painter = painterResource(id = R.drawable.ic_work),
                contentDescription = null,
                tint = CustomColor.TextColor
            )
            Spacer(modifier = Modifier.width(Padding._8))
            Text(
                text = item.name,
                color = CustomColor.TextColor,
                style = FontStyle.Style_16
            )
        }
        Spacer(modifier = Modifier.height(Padding._12))
        Text(
            text = stringResource(R.string.publish, item.publicationDate),
            color = CustomColor.TextColor,
            style = FontStyle.Style_14
        )
        Spacer(modifier = Modifier.height(Padding._12))
        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp),
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = CustomColor.Green,
                disabledContainerColor = CustomColor.Green,
                contentColor = CustomColor.TextColor,
                disabledContentColor = CustomColor.NotActiveTextColor
            )
        ) {
            Text(
                text = stringResource(R.string.respond),
                style = FontStyle.Style_14,
            )
        }
    }
}

