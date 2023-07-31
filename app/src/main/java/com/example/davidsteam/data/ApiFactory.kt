package com.example.davidsteam.data

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object ApiFactory {
    private const val baseUrl: String = "https://filedn.eu/lUA9AOP8yvHS2F3A2sYvdKj/ReadyFolders/"

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .baseUrl(baseUrl)
        .build()

    val apiService = retrofit.create(ApiService::class.java)
}