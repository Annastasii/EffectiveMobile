package com.example.feature_vacancies.ui.list_vacancies.state

data class VacancyModel(
    val name: String,
    val company: String,
    val location: String,
    val experience: String,
    val publicationDate: String,
    val looking: String,
    val isFavourite: Boolean = false
)