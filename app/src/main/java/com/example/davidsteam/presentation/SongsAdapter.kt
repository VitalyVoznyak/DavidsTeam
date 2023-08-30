package com.example.davidsteam.presentation

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.davidsteam.databinding.ItemSongBinding
import com.example.davidsteam.domain.entity.Song
import com.squareup.picasso.Picasso
import javax.inject.Inject

class SongsAdapter @Inject constructor (): RecyclerView.Adapter<SongsViewHolder>() {

    var songList = listOf<Song>()
        set(value){
            field = value
            notifyDataSetChanged()
        }

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
    }

    override fun getItemCount() = songList.size
}
