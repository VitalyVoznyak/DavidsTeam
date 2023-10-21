package com.example.davidsteam.data.repository

import android.app.DownloadManager
import androidx.lifecycle.LiveData
import com.example.davidsteam.data.network.ApiFactory
import com.example.davidsteam.data.Mapper.SongsMapper
import com.example.davidsteam.data.downloader.DownLoader
import com.example.davidsteam.domain.entity.Instrument
import com.example.davidsteam.domain.entity.Song
import com.example.davidsteam.domain.repository.Repository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import javax.inject.Inject

class RepositoryImpl @Inject constructor(val songsMapper: SongsMapper,val downloader : DownLoader) : Repository {



    override suspend fun loadSongList(instrument: Instrument): LiveData<List<Song>> {
        val songList = CoroutineScope(Dispatchers.Default).async {

            val songList = ApiFactory.apiService.getAllSongs()
            songList
        }

        songsMapper.instrument = instrument
        return songsMapper.mapSongListDtoToLiveDataListSongs(songList.await())


    }

    override fun downloadSong(
        songName: String,
        currentInstrument: Instrument,
        downloadManager: DownloadManager
    ) {
        downloader.loadData(songName,currentInstrument,downloadManager)
    }
}