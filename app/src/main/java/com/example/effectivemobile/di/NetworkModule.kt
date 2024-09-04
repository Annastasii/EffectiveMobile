package com.example.effectivemobile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//@Module
//@InstallIn(SingletonComponent::class)
//object NetworkModule {
//
//    @Provides
//    @Singleton
//    fun provideRetrofit(
//        factory: MoshiConverterFactory
//    ): Retrofit {
//        return Retrofit.Builder()
//            .baseUrl("https://drive.usercontent.google.com/u/0/uc?id=1z4TbeDkbfXkvgpoJprXbN85uCcD7f00r&export=download")
//            .addConverterFactory(factory)
//            .build()
//    }
//
//}