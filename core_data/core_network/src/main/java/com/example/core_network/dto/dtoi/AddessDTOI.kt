package com.example.core_network.dto.dtoi

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AddessDTOI(
    @Json(name = "town")
    val town: String,
    @Json(name = "street")
    val street: String,
    @Json(name = "house")
    val house: String
)
