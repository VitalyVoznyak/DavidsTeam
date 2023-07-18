package com.example.davidsteam.domain.usecases

import com.example.davidsteam.domain.entity.Instrument
import com.example.davidsteam.domain.repository.Repository

class LoadSongListUseCase(
    private val repository: Repository
) {
    operator fun invoke(instrument: Instrument) {
        return repository.loadSongListUseCase(instrument)
    }
}