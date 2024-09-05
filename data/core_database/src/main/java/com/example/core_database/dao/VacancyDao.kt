package com.example.core_database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.core_database.entity.OfferEntity
import com.example.core_database.entity.VacancyEntity

@Dao
interface VacancyDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun insert(vacancy: VacancyEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun insertOffer(vacancy: OfferEntity)
}