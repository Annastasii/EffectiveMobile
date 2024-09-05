package com.example.core_database.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.core_database.dao.VacancyDao
import com.example.core_database.entity.OfferEntity
import com.example.core_database.entity.VacancyEntity

@Database(entities = [VacancyEntity::class, OfferEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun vacancyDao(): VacancyDao
}