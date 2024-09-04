package com.example.feature_vacancies.ui.vacancy_info.view

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.core_ui.CustomColor
import com.example.core_ui.FontStyle
import com.example.core_ui.Padding
import com.example.feature_vacancies.R

@Composable
fun Description() {
    Spacer(modifier = Modifier.height(Padding._12))
    Text(
        text = "MOBYRIX - динамично развивающаяся продуктовая IT-компания, специализирующаяся на разработке мобильных приложений для iOS и Android. Наша команда работает над собственными продуктами в разнообразных сферах: от утилит до развлечений и бизнес-приложений.\u2028Мы ценим талант и стремление к инновациям и в данный момент в поиске талантливого UX/UI Designer, готового присоединиться к нашей команде и внести значимый вклад в развитие наших проектов.",
        color = CustomColor.TextColor,
        style = FontStyle.Style_14
    )
    Spacer(modifier = Modifier.height(Padding._16))
    Text(
        text = stringResource(id = R.string.your_task),
        color = CustomColor.TextColor,
        style = FontStyle.Style_20
    )
    Spacer(modifier = Modifier.height(Padding._12))
    Text(
        text = "MOBYRIX - динамично развивающаяся продуктовая IT-компания, специализирующаяся на разработке мобильных приложений для iOS и Android. Наша команда работает над собственными продуктами в разнообразных сферах: от утилит до развлечений и бизнес-приложений.\u2028Мы ценим талант и стремление к инновациям и в данный момент в поиске талантливого UX/UI Designer, готового присоединиться к нашей команде и внести значимый вклад в развитие наших проектов.",
        color = CustomColor.TextColor,
        style = FontStyle.Style_14
    )
    Spacer(modifier = Modifier.height(Padding._20))
}