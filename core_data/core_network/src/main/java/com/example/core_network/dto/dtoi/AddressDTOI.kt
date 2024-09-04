package com.example.core_network.dto.dtoi

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AddressDTOI(
    val town: String,
    val street: String,
    val house: String
)
