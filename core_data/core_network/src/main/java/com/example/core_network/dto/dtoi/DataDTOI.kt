package com.example.core_network.dto.dtoi

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DataDTOI(
    val offers: List<OffersDTOI>,
    val vacancies: List<VacancyDTOI>,
)