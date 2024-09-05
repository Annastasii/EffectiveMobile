package com.example.core_database.database

import android.content.Context
import androidx.room.Room
import com.example.core_database.dao.VacancyDao
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
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "app_data"
        ).build()
    }

    @Provides
    fun provideUserDao(database: AppDatabase): VacancyDao {
        return database.vacancyDao()
    }
}