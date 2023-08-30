package com.example.davidsteam.di

import android.app.Activity
import com.example.davidsteam.presentation.MainActivity
import dagger.Component

@Component(modules = [RepositoryModule::class])
interface ApplicationComponent {
    fun inject(activity: Activity)


}