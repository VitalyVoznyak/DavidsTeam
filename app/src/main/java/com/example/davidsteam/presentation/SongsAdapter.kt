package com.example.davidsteam.presentation

import android.app.DownloadManager
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.getSystemService
import androidx.recyclerview.widget.RecyclerView
import com.example.davidsteam.data.downloader.DownLoader
import com.example.davidsteam.data.repository.DownLoadSongUseCase
import com.example.davidsteam.databinding.ItemSongBinding
import com.example.davidsteam.domain.entity.Instrument
import com.example.davidsteam.domain.entity.Song
import com.squareup.picasso.Picasso
import javax.inject.Inject

class SongsAdapter @Inject constructor (val downLoadSongUseCase : DownLoadSongUseCase): RecyclerView.Adapter<SongsViewHolder>() {

    var songList = listOf<Song>()
        set(value){
            field = value
            notifyDataSetChanged()
        }


    lateinit var downloadManager: DownloadManager
    lateinit var currentInstrument: Instrument


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongsViewHolder {
        val binding = ItemSongBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return SongsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SongsViewHolder, position: Int) {
        val song = songList[position]

        with(holder.binding){
            songName.text = song.name
            //Picasso.get().load(song.imageUrl).into(it.songImage)
        }
        holder.itemView.setOnClickListener {
            downLoadSongUseCase.downloadSong(song.name, currentInstrument, downloadManager)
        }
    }

    override fun getItemCount() = songList.size
}
