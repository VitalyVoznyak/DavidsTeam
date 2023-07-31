package com.example.davidsteam.data.network.model

    data class SongDto(
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
