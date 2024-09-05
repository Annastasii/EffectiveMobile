package com.example.data.di

import com.example.core_vacancies_api.repository.VacancyRepository
import com.example.data.repository.VacancyRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
@Suppress("TooManyFunctions")
interface RepoModule {
    @Binds
    @Singleton
    fun bindProfileRepository(impl: VacancyRepositoryImpl): VacancyRepository
}