package com.example.davidsteam.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.davidsteam.domain.entity.Instrument
import com.example.davidsteam.domain.entity.Song
import com.example.davidsteam.domain.usecases.LoadSongListUseCase

import kotlinx.coroutines.launch
import javax.inject.Inject

class SongListViewModel @Inject constructor( loadSongListUseCase: LoadSongListUseCase) :  ViewModel(){

    var liveData: MutableLiveData<List<Song>> = MutableLiveData<List<Song>>()

    @Inject
    lateinit var loadSongListUseCase: LoadSongListUseCase
    fun loadSongList(instrument: Instrument) {


        viewModelScope.launch {
            liveData.value = loadSongListUseCase.loadSongListUseCase(instrument).value
        }

    }
}