package com.example.core_vacancies_api.repository

import com.example.core_vacancies_api.models.VacancyModel

interface VacancyRepository {

    suspend fun insertVacancy(model: VacancyModel)
}