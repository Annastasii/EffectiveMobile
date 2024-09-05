package com.example.core_database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "vacancy")
data class VacancyEntity(
    @PrimaryKey
    val id: String,
    val lookingNumber: Int?,
    val title: String,
    val town: String,
    val street: String,
    val house: String,
    val company: String,
    val previewTextExperience: String,
    val textExperience: String,
    val publishedDate: String,
    val isFavorite: Boolean,
    val fullSalary: String?,
    val shortSalary: String?,
    val schedules: List<String>,
    val appliedNumber: Int?,
    val description: String?,
    val responsibilities: String,
    val questions: List<String>
)
