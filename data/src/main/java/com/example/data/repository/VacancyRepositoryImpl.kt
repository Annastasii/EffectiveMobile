package com.example.data.repository

import android.util.Log
import com.example.core_database.dao.VacancyDao
import com.example.core_network.api.GoogleApi
import com.example.core_vacancies_api.models.VacancyModel
import com.example.core_vacancies_api.repository.VacancyRepository
import com.example.data.mapper.Mapper.mapToEntity
import javax.inject.Inject

class VacancyRepositoryImpl @Inject constructor(
    private val googleApi: GoogleApi,
    private val dao: VacancyDao,
) : VacancyRepository {

    override suspend fun insertVacancy(model: VacancyModel) {
        try {
            val response = googleApi.getJsonData()
            if (response.isSuccessful) {
                response.body()?.let {
                    it.vacancies.forEach { item ->
                        dao.insert(item.mapToEntity())
                    }
                }
            } else {
                Log.d("GoogleApiError", "Error: ${response.message()}")
            }
        } catch (e: Exception) {
            Log.d("GoogleApiError", "Failed to fetch data: ${e.message}")

        }
    }
}