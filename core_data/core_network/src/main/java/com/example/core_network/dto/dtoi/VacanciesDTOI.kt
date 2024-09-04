package com.example.core_network.dto.dtoi

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VacanciesDTOI(
    @Json(name = "id")
    val id: String,
    @Json(name = "lookingNumber")
    val lookingNumber: Int?,
    @Json(name = "title")
    val title: String,
    @Json(name = "address")
    val address: AddessDTOI,
    @Json(name = "company")
    val company: String,
    @Json(name = "experience")
    val experience: ExperienceDTOI,
    @Json(name = "publishedDate")
    val publishedDate: String,
    @Json(name = "isFavourite")
    val isFavourite: Boolean,
    @Json(name = "schedules")
    val schedules: Array<String>,
    @Json(name = "appliedNumber")
    val appliedNumber: Int?,
    @Json(name = "description")
    val description: String?,
    @Json(name = "responsibilities")
    val responsibilities: String,
    @Json(name = "description")
    val question: Array<String>,
)
