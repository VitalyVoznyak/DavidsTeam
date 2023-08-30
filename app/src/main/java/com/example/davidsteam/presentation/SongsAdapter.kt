package com.example.davidsteam.presentation

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.davidsteam.databinding.ItemSongBinding
import com.example.davidsteam.domain.entity.Song
import com.squareup.picasso.Picasso

class SongsAdapter (private val context: Context): RecyclerView.Adapter<SongsViewHolder>() {

    var songList: List<Song> = listOf()
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
        //Picasso.get().load(song.imageUrl).into(holder.binding.songImage)
        holder.binding.songName.text = song.name
    }

    override fun getItemCount(): Int {
        return songList.size
    }
}
