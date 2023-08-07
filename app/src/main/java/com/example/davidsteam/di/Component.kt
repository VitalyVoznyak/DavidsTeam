package com.example.davidsteam.di

import android.app.Activity
import com.example.davidsteam.presentation.MainActivity
import dagger.Component
import dagger.Module

@Component(modules = [RepositoryModule::class])
interface Component {
    fun inject(activity: MainActivity)
}