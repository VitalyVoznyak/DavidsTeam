package com.example.davidsteam.domain.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
data class Song(

    var name:String,
    var haveAG:Boolean,
    var haveBASS:Boolean,
    var haveEG:Boolean,
    var havePIANO:Boolean,
    var haveDRUMS:Boolean
) {
    override fun toString(): String {
        return "Song(name='$name', haveAG=$haveAG, haveBASS=$haveBASS, haveEG=$haveEG, havePIANO=$havePIANO, haveDRUMS=$haveDRUMS)"
    }
}

