package com.example.core_network.dtoi

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SalaryDTOI(
    val full: String?,
    val short: String? = null
)