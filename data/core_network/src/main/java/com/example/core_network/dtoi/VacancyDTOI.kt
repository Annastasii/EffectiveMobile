package com.example.core_network.dtoi

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VacancyDTOI(
    val id: String,
    val lookingNumber: Int?,
    val title: String,
    val address: AddressDTOI,
    val company: String,
    val experience: ExperienceDTOI,
    val publishedDate: String,
    val isFavorite: Boolean,
    val salary: SalaryDTOI,
    val schedules: List<String>,
    val appliedNumber: Int?,
    val description: String?,
    val responsibilities: String,
    val questions: List<String>
)
