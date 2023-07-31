package com.example.davidsteam.data.network.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Song(
    @SerializedName("Song")
    @Expose
    val name:String? = null

)
