package com.example.davidsteam.di

import com.example.davidsteam.data.repository.RepositoryImpl
import com.example.davidsteam.domain.repository.Repository
import dagger.Binds
import dagger.Module

@Module
interface RepositoryModule {
    @Binds
    fun bindsRepositoryImpl(impl: RepositoryImpl): Repository
    fun bindsRepositoryImp(impl: RepositoryImpl): Repository
}