package com.example.core_network.dto.dtoi

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SalaryDTOI(
    @Json(name = "short")
    val short: String?,
    @Json(name = "full")
    val full: String,

)