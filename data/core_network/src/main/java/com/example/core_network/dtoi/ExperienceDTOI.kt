package com.example.core_network.dtoi

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ExperienceDTOI(
    val previewText: String,
    val text: String
)