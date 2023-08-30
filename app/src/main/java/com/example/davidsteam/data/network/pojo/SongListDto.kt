package com.example.davidsteam.data.network.pojo

import com.example.davidsteam.domain.entity.Song
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class SongListDto {
    @SerializedName("songs")
    @Expose
    var songs: List<Song>? = null
}

