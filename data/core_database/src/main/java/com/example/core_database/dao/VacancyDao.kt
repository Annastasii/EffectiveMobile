package com.example.core_database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.core_database.entity.VacancyEntity

@Dao
interface VacancyDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vacancy: VacancyEntity)

    @Query("SELECT * FROM vacancy")
    fun getVacancyList(): List<VacancyEntity>

    @Query("SELECT * FROM vacancy WHERE id = :id")
    fun getVacancy(id: String): VacancyEntity

    @Query("UPDATE vacancy SET isFavorite = :isFavourite WHERE id = :id")
    fun updateFavourite(id: String, isFavourite: Boolean)

}