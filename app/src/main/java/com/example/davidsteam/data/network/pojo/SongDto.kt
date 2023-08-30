package com.example.davidsteam.data.network.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
data class SongDto(
    @SerializedName("Song")
    @Expose
    var name:String,
    var haveAG:Boolean,
    var haveBASS:Boolean,
    var haveEG:Boolean,
    var havePIANO:Boolean,
    var haveDRUMS:Boolean
) {
    override fun toString(): String {
        return super.toString()
    }
}

