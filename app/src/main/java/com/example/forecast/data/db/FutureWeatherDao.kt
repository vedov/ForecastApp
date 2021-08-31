package com.example.forecast.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.forecast.data.db.entity.CURRENT_WEATHER_ID
import com.example.forecast.data.db.entity.CurrentWeather
import com.example.forecast.data.db.futureentity.FutureWeather

import com.example.forecast.data.db.unitlocalized.current.MetricCurrentWeather
import java.time.LocalDate

@Dao
interface FutureWeatherDao {
    /*@Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(futureWeatherEntries: List<FutureWeather>)

    @RewriteQueriesToDropUnusedColumns
    @Query("select * from current_weather where id = $CURRENT_WEATHER_ID")
    fun getWeatherMetric(): LiveData<MetricCurrentWeather>


    @RewriteQueriesToDropUnusedColumns
    @Query("select * from future_weather where date(date) >= date(:startDate)")
    fun getSimpleWeatherForecastsMetric(startDate: LocalDate): LiveData<List<MetricSimpleFutureWeatherEntry>>

    @RewriteQueriesToDropUnusedColumns
    @Query("select count(id) from future_weather where date(date) >= date(:startDate)")
    fun countFutureWeather(startDate: LocalDate): Int
    @RewriteQueriesToDropUnusedColumns
    @Query("delete from future_weather where date(date) < date(:firstDateToKeep)")
    fun deleteOldEntries(firstDateToKeep: LocalDate)*/
}