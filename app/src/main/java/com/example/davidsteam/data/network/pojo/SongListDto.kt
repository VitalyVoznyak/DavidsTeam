package com.example.davidsteam.data.network.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class SongListDto(
    @SerializedName("Songs")
    @Expose
    val data: List<SongDto>
)
