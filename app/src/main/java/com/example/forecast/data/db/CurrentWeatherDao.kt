package com.example.forecast.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.forecast.data.db.entity.CURRENT_WEATHER_ID
import com.example.forecast.data.db.entity.CurrentWeather

import com.example.forecast.data.db.unitlocalized.current.MetricCurrentWeather

@Dao
interface CurrentWeatherDao {
@Insert(onConflict = OnConflictStrategy.REPLACE)
fun upsert(weatherEntry: CurrentWeather)

@RewriteQueriesToDropUnusedColumns
@Query("select * from current_weather where id = $CURRENT_WEATHER_ID")
fun getWeatherMetric(): LiveData<MetricCurrentWeather>
}