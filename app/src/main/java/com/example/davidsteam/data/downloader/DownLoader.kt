package com.example.davidsteam.data.downloader

import android.app.AlarmManager
import android.app.Application
import android.app.DownloadManager
import android.content.Context
import android.content.Context.DOWNLOAD_SERVICE
import android.net.Uri
import android.os.Environment
import android.webkit.CookieManager
import android.webkit.URLUtil
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getSystemService
import com.example.davidsteam.domain.entity.Instrument
import com.example.davidsteam.presentation.MainActivity
import javax.inject.Inject

class DownLoader @Inject constructor() {
    fun loadData(songName : String, instrument: Instrument,downloadManager:DownloadManager){
        val loadingInstrument : String = when(instrument){
            Instrument.ACOUSTIC -> "AG"
            Instrument.BASS -> "BASS"
            Instrument.ELECTRO -> "EG"
            Instrument.DRUMS -> "DRUMS"
            Instrument.PIANO -> "PIANO"

            //ACOUSTIC,ELECTRO,BASS,PIANO,DRUMS
        }
        Thread{
            val basicUrl = "https://filedn.eu/lUA9AOP8yvHS2F3A2sYvdKj/ReadyFolders/"
            val url = "$basicUrl$songName/$loadingInstrument.mp3"
            val request = DownloadManager.Request(Uri.parse(url))
            val title = URLUtil.guessFileName(url, null, null)
            request.setTitle(title)
            request.setDescription("Download File please wait....")
            val cookie = CookieManager.getInstance().getCookie(url)
            request.addRequestHeader("cookie", cookie)
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, title)


            downloadManager.enqueue(request)
        }.start()
    }
}

//val downloadManager: DownloadManager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
//        DownLoader().loadData("Battle_Belongs",Instrument.DRUMS,downloadManager)