package com.sou.myairbnb

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {
    @GET("/v3/0a46a6ba-89da-44b8-a002-b480c7f1dd9e")
    fun getHouseList(): Call<HouseDto
}