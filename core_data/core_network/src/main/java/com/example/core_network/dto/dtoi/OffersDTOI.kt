package com.example.core_network.dto.dtoi

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OffersDTOI(
    val id: String?,
    val title: String,
    val link: String,
    val button: ButtonDTOI? = null
)
