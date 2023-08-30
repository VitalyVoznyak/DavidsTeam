package com.example.davidsteam.data

import com.example.davidsteam.data.network.pojo.SongListDto
import retrofit2.http.GET


interface ApiService {
    @GET("Songs.json")
    suspend fun getAllSongs(): SongListDto



//    @GET("pricemultifull")
//    fun getFillPriceList(
//        @Query(QUERY_PARAM_API_KEY) apiKey: String = "ae7f6710b791ff46f5d08de19eb07cf412aa6105d10a3baab92987410ad04e76",
//        @Query(QUERY_PARAM_FROM_SYMBOLS) fSyms: String,
//        @Query(QUERY_PARAM_TO_SYMBOLS) tSyms: String = CURRENCY,
//    )//: Single<CoinPriceInfoRawData>


}
