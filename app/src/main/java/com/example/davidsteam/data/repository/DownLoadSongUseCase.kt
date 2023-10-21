package com.example.davidsteam.data.repository

import android.app.DownloadManager
import com.example.davidsteam.domain.entity.Instrument
import com.example.davidsteam.domain.repository.Repository
import javax.inject.Inject

class DownLoadSongUseCase @Inject constructor(private val repository: Repository) {
    fun downloadSong(songName:String, currentInstrument: Instrument, downloadManager : DownloadManager){
        repository.downloadSong(songName, currentInstrument, downloadManager)
    }
}