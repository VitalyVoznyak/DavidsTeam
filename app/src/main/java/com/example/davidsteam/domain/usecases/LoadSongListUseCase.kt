package com.example.davidsteam.domain.usecases

import androidx.lifecycle.LiveData
import com.example.davidsteam.domain.entity.Instrument
import com.example.davidsteam.domain.entity.Song
import com.example.davidsteam.domain.repository.Repository

class LoadSongListUseCase(
    private val repository: Repository
) {
    operator fun invoke(instrument: Instrument) : LiveData<List<Song>> {
        return repository.loadSongListUseCase(instrument)
    }
}