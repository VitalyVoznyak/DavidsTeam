package com.example.davidsteam.presentation

import android.app.DownloadManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.webkit.CookieManager
import android.webkit.URLUtil
import com.example.davidsteam.R
import com.example.davidsteam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_menu_container, MenuFragment.newInstance("", ""))
            .commit()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_song_list_container, SongListFragment.newInstance())
            .commit()

        //val url = "https://africau.edu/images/default/sample.pdf"

        Thread{
            val url = "https://filedn.eu/lUA9AOP8yvHS2F3A2sYvdKj/BASS.mp3"
            val request = DownloadManager.Request(Uri.parse(url))
            val title = URLUtil.guessFileName(url, null, null)
            request.setTitle(title)
            request.setDescription("Download File please wait....")
            val cookie = CookieManager.getInstance().getCookie(url)
            request.addRequestHeader("cookie", cookie)
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, title)

            val downloadManager: DownloadManager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
            downloadManager.enqueue(request)
        }.start()



    }
}