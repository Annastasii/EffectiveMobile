package com.example.feature_vacancies.ui.vacancy_info

import android.view.RoundedCorner
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.core_ui.CustomColor
import com.example.core_ui.FontStyle
import com.example.core_ui.Padding
import com.example.feature_vacancies.R
import com.example.feature_vacancies.ui.list_vacancies.state.VacancyModel
import com.example.feature_vacancies.ui.vacancy_info.view.StatisticRow

@Composable
fun VacancyInfoScreen() {
    val item = VacancyModel(
        name = "UI/UX Designer",
        looking = "7",
        cost = "Уровень дохода не указан",
        location = "Минск",
        company = "Мобирикс",
        experience = "Опыт от 1 года до 3 лет",
        publicationDate = "26 августа"
    )
    LazyColumn(
        Modifier
            .background(CustomColor.PrimaryBgColor)
            .padding(Padding._12)
    ) {
        item {
            Text(
                text = item.name,
                color = CustomColor.TextColor,
                style = FontStyle.Style_16
            )
            Spacer(modifier = Modifier.height(Padding._12))
            Text(
                text = item.cost,
                color = CustomColor.TextColor,
                style = FontStyle.Style_14
            )
            Spacer(modifier = Modifier.height(Padding._12))
            Text(
                text = item.experience,
                color = CustomColor.TextColor,
                style = FontStyle.Style_14
            )
            Spacer(modifier = Modifier.height(Padding._12))
            Text(
                text = "Полная занятость, полный день",
                color = CustomColor.TextColor,
                style = FontStyle.Style_14
            )
            Spacer(modifier = Modifier.height(Padding._12))
        }
        item {
            StatisticRow()
        }
        item {
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
        }
        item {
            Text(
                text = "MOBYRIX - динамично развивающаяся продуктовая IT-компания, специализирующаяся на разработке мобильных приложений для iOS и Android. Наша команда работает над собственными продуктами в разнообразных сферах: от утилит до развлечений и бизнес-приложений.\u2028Мы ценим талант и стремление к инновациям и в данный момент в поиске талантливого UX/UI Designer, готового присоединиться к нашей команде и внести значимый вклад в развитие наших проектов.",
                color = CustomColor.TextColor,
                style = FontStyle.Style_14
            )
        }
    }
}