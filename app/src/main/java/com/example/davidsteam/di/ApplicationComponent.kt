package com.example.davidsteam.di

import android.app.Activity
import androidx.fragment.app.Fragment
import com.example.davidsteam.databinding.FragmentSongListBinding
import com.example.davidsteam.presentation.MainActivity
import com.example.davidsteam.presentation.SongListFragment
import dagger.Component

@Component(modules = [RepositoryModule::class])
interface ApplicationComponent {
    fun inject(activity: Activity)
    fun inject(songListFragment: SongListFragment)

}