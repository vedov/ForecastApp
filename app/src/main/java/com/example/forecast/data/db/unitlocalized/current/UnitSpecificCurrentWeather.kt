package com.example.forecast.data.db.unitlocalized.current

import com.google.gson.annotations.SerializedName

interface UnitSpecificCurrentWeather {
    val base: String
    val all: Int
    val cod: Int
    val lat: Double
    val lon: Double
    val dt: Int
    val feelsLike: Double
    val humidity: Int
    val temp: Double
    val pressure: Int
    val tempMax: Double
    val tempMin: Double
    val name: String
    val country: String
    val idSys: Int
    val sunrise: Int
    val sunset: Int
    val type: Int
    val timezone: Int
    val visibility: Int

    val deg: Int
    val speed: Double
}