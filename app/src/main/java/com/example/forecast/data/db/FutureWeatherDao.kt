package com.example.forecast.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.forecast.data.db.entity.Day
import com.example.forecast.data.db.entity.Forecast
import com.example.forecast.data.db.entity.FutureWeatherList
import com.example.forecast.data.db.unitlocalized.current.future.MetricFutureWeather


@Dao
interface FutureWeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(futureWeatherEntries: Forecast)
    @RewriteQueriesToDropUnusedColumns
    @Query("select * from future_weather")
    fun getWeatherMetric(): LiveData<MetricFutureWeather>
}