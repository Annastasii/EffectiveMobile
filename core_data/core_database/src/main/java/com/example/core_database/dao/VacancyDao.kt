package com.example.core_database.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.core_database.entity.VacancyEntity

@Dao
interface VacancyDao {
    @Insert
    suspend fun insert(vacancy: VacancyEntity)
}