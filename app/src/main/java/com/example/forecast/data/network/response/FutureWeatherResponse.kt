package com.example.forecast.data.network.response


import com.example.forecast.data.db.entity.*
import com.google.gson.annotations.SerializedName

data class FutureWeatherResponse(
    val cod: Int,
    val cnt: Int,
    val message: Int,
    val list: List<FutureWeatherList>

)