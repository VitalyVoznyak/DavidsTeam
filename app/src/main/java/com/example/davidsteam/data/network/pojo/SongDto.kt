package com.example.davidsteam.data.network.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SongDto {
    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("haveAG")
    @Expose
    var haveAG: Boolean? = null

    @SerializedName("haveBASS")
    @Expose
    var haveBASS: Boolean? = null

    @SerializedName("haveEG")
    @Expose
    var haveEG: Boolean? = null

    @SerializedName("havePIANO")
    @Expose
    var havePIANO: Boolean? = null

    @SerializedName("haveDRUMS")
    @Expose
    var haveDRUMS: Boolean? = null
}


