package com.example.davidsteam.domain.usecases

import androidx.lifecycle.LiveData
import com.example.davidsteam.di.Component
import com.example.davidsteam.domain.entity.Instrument
import com.example.davidsteam.domain.entity.Song
import com.example.davidsteam.domain.repository.Repository
import javax.inject.Inject

class LoadSongListUseCase @Inject constructor(instrument: Instrument) {

    @Inject
    lateinit var repository: Repository

    operator fun invoke(instrument: Instrument): LiveData<List<Song>> {

        return repository.loadSongList(instrument)
    }
}