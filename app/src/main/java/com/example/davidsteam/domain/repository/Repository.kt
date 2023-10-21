package com.example.davidsteam.domain.repository

import android.app.DownloadManager
import androidx.lifecycle.LiveData
import com.example.davidsteam.domain.entity.Instrument
import com.example.davidsteam.domain.entity.Song

interface Repository {
    suspend fun loadSongList(instrument: Instrument): LiveData<List<Song>>
    fun downloadSong(songName:String, currentInstrument: Instrument, downloadManager : DownloadManager)
}