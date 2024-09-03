package com.example.feature_vacancies.domain

import com.example.feature_vacancies.ui.list_vacancies.state.OfferModel
import com.example.feature_vacancies.ui.list_vacancies.state.VacancyModel

object Constants {

    //TODO
    val offers: List<OfferModel> = listOf(
        OfferModel(text = "Вакансии рядом с вами", "Поднять"),
        OfferModel(text = "Вакансии рядом с вами", "Поднять"),
        OfferModel(text = "Вакансии рядом с вами", "Поднять")
    )

    val vacancy = listOf(
        VacancyModel(
            name = "UI/UX Designer",
            looking = "7",
            location = "Минск",
            company = "Мобирикс",
            experience = "Опыт от 1 года до 3 лет",
            publicationDate = "26 августа"
        ),
        VacancyModel(
            name = "UI/UX Designer",
            looking = "7",
            location = "Минск",
            company = "Мобирикс",
            experience = "Опыт от 1 года до 3 лет",
            publicationDate = "26 августа",
            isFavourite = true
        ),
        VacancyModel(
            name = "UI/UX Designer",
            looking = "7",
            location = "Минск",
            company = "Мобирикс",
            experience = "Опыт от 1 года до 3 лет",
            publicationDate = "26 августа"
        ),
        VacancyModel(
            name = "UI/UX Designer",
            looking = "7",
            location = "Минск",
            company = "Мобирикс",
            experience = "Опыт от 1 года до 3 лет",
            publicationDate = "26 августа"
        )
    )
}