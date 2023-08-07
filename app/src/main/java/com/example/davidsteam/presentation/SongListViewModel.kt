package com.example.davidsteam.presentation

import androidx.lifecycle.ViewModel
import com.example.davidsteam.domain.entity.Instrument
import com.example.davidsteam.domain.usecases.LoadSongListUseCase

class SongListViewModel : ViewModel() {

    fun loadSongList(instrument: Instrument){
        LoadSongListUseCase(instrument)
    }
}