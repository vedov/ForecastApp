package com.example.forecast.data.network.response

import com.example.forecast.data.db.entity.Forecast
import com.example.forecast.data.db.entity.FutureWeatherList
import com.google.gson.annotations.SerializedName

data class ForecastDaysContainer (
    val entries: Forecast
)