package com.example.davidsteam.data.repository

import androidx.lifecycle.LiveData
import com.example.davidsteam.data.ApiFactory
import com.example.davidsteam.data.Mapper.SongsMapper
import com.example.davidsteam.domain.entity.Instrument
import com.example.davidsteam.domain.entity.Song
import com.example.davidsteam.domain.repository.Repository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import javax.inject.Inject

class RepositoryImpl @Inject constructor(val songsMapper: SongsMapper) : Repository {



    override suspend fun loadSongList(instrument: Instrument): LiveData<List<Song>> {
        val songList = CoroutineScope(Dispatchers.Default).async {

            val songList = ApiFactory.apiService.getAllSongs()
            songList
        }

        return songsMapper.mapSongListDtoToLiveDataListSongs(songList.await())

    }
}