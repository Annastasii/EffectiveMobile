package com.example.core_database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "offer")
data class OfferEntity(
    @PrimaryKey(autoGenerate = true)
    val externalId: Int = 5,
    val id: String?,
    val title: String,
    val link: String,
    val textButton: String?
)