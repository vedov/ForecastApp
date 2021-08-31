package com.example.forecast.data.network.response

import android.os.Parcel
import android.os.Parcelable
import com.example.forecast.data.db.entity.*


data class CurrentWeatherResponse(
    val base: String,
    val clouds: Clouds,
    val cod: Int,
    val coord: Coord,
    val dt: Int,
    val id: Int,
    val main: Main,
    val name: String,
    val sys: Sys,
    val timezone: Int,
    val visibility: Int,
    val weather: List<Weather>,
    val wind: Wind,
    val currentWeather: CurrentWeather
)
