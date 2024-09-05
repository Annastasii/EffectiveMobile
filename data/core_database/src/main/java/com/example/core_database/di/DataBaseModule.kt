package com.example.core_database.di

import android.content.Context
import androidx.room.Room
import com.example.core_database.dao.VacancyDao
import com.example.core_database.database.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import jakarta.inject.Singleton

@Suppress("TooManyFunctions")
@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {

    @Provides
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "app_data"
        ).build()
    }

    @Provides
    fun provideVacancyDao(database: AppDatabase): VacancyDao {
        return database.vacancyDao()
    }
}