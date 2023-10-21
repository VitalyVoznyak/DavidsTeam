package com.example.davidsteam.presentation

import android.app.DownloadManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.davidsteam.R
import com.example.davidsteam.databinding.ActivityMainBinding
import com.example.davidsteam.domain.entity.Instrument


class MainActivity : AppCompatActivity(), MainFragmentCommunicator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_menu_container, MenuFragment.newInstance())
            .commit()
    }

    override fun passDataToSongListFragment(currentInstrument: Instrument) {

        val bundle = Bundle()
        bundle.putSerializable(EXTRA_INSTRUMENT, currentInstrument)

        val songListFragment = SongListFragment.newInstance()

        songListFragment.arguments = bundle

        val downloadManager: DownloadManager = getSystemService(DOWNLOAD_SERVICE) as DownloadManager
        songListFragment.downloadManager = downloadManager

        supportFragmentManager.beginTransaction()

            .replace(R.id.fragment_song_list_container, songListFragment)
            .commit()
    }

    companion object {
        const val EXTRA_INSTRUMENT = "INSTRUMENT"
    }
}