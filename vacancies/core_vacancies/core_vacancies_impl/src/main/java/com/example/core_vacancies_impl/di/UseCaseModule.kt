package com.example.core_vacancies_impl.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface UseCaseModule {

//    @Binds
//    @Singleton
//    fun bindGetActiveEmployee(impl: GetActiveEmployeeImpl): EmployeeUseCases.GetActiveEmployee
}