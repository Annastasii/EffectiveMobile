package com.example.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
@Suppress("TooManyFunctions")
interface RepoModule {
//    @Binds
//    @Singleton
//    fun bindProfileRepository(impl: ProfileRepositoryImpl): ProfileRepository
}