package com.example.data.di

import com.example.core_vacancies_api.repository.VacancyRepository
import com.example.data.repository.VacancyRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
interface RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindVacancyRepository(impl: VacancyRepositoryImpl): VacancyRepository
}