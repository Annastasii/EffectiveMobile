package com.example.core_database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "offer")
data class OfferEntity(
    @PrimaryKey
    val id: String?,
    val title: String,
    val link: String,
    val textButton: String?
)