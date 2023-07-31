package com.example.davidsteam.data

import com.example.davidsteam.data.network.model.SongListDto
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {
    @GET("top/totalvolfull")
    fun getAllSongs(): SongListDto


//    @GET("pricemultifull")
//    fun getFillPriceList(
//        @Query(QUERY_PARAM_API_KEY) apiKey: String = "ae7f6710b791ff46f5d08de19eb07cf412aa6105d10a3baab92987410ad04e76",
//        @Query(QUERY_PARAM_FROM_SYMBOLS) fSyms: String,
//        @Query(QUERY_PARAM_TO_SYMBOLS) tSyms: String = CURRENCY,
//    )//: Single<CoinPriceInfoRawData>

    companion object {
        private const val QUERY_PARAM_API_KEY = "api_key"
        private const val QUERY_PARAM_LIMIT = "limit"
        private const val QUERY_PARAM_TO_SYMBOL = "tsym"

        private const val QUERY_PARAM_TO_SYMBOLS = "tsyms"
        private const val QUERY_PARAM_FROM_SYMBOLS = "fsyms"
        private const val CURRENCY = "USD"
    }
}
