package com.example.core_network.dto.dtoi

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ExperienceDTOI(
    @Json(name = "previewText")
    val previewText: String,
    @Json(name = "text")
    val text: String,
)