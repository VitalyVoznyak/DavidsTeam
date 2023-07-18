package com.example.davidsteam.domain.repository

import androidx.lifecycle.LiveData
import com.example.davidsteam.domain.entity.Instrument
import com.example.davidsteam.domain.entity.Song

interface Repository {
    fun loadSongListUseCase(instrument: Instrument): LiveData<List<Song>>
}