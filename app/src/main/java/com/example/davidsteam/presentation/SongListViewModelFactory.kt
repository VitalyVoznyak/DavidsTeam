package com.example.davidsteam.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.davidsteam.domain.usecases.LoadSongListUseCase
import javax.inject.Inject

class SongListViewModelFactory @Inject constructor(
    private val loadSongListUseCase: LoadSongListUseCase) :
    ViewModelProvider.Factory {


    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass == SongListViewModel::class.java) {
            return SongListViewModel(loadSongListUseCase) as T
        }else{
            throw RuntimeException("Unknown VM $modelClass")
        }
    }
}