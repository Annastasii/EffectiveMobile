package com.example.core_database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.core_database.entity.OfferEntity

@Dao
interface OfferDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertOffer(vacancy: OfferEntity)

    @Query("SELECT * FROM offer")
    fun getOffers(): List<OfferEntity>
}