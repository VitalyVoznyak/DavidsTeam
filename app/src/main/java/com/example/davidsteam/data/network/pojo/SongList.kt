package com.example.davidsteam.data.network.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class SongList(
    @SerializedName("Songs")
    @Expose
    val data: List<Song>? = null


)
