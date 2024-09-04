package com.example.core_network.dto.dtoi

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DataDTOI(
    @Json(name = "offers")
    val offers: OffersDTOI,
    @Json(name = "vacancies")
    val vacancies: VacanciesDTOI,
    )