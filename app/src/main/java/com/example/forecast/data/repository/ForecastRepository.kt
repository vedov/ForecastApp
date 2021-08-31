package com.example.forecast.data.repository

import androidx.lifecycle.LiveData
import com.example.forecast.data.db.unitlocalized.current.MetricCurrentWeather

interface ForecastRepository {
    suspend fun getCurrentWeather(): LiveData<MetricCurrentWeather>
}