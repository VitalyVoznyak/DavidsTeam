package com.example.davidsteam.data.repository

import androidx.lifecycle.LiveData
import com.example.davidsteam.domain.entity.Instrument
import com.example.davidsteam.domain.entity.Song
import com.example.davidsteam.domain.repository.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor() : Repository{
    override fun loadSongList(instrument: Instrument): LiveData<List<Song>> {
        TODO("Not yet implemented")
    }
}