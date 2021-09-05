package com.example.forecast.data.db

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.room.*

import com.example.forecast.data.db.entity.CurrentWeather
import com.example.forecast.data.db.entity.Forecast
import com.example.forecast.data.db.entity.FutureWeatherList
import com.example.forecast.data.db.entity.Weather
import com.google.gson.Gson
import java.time.Instant


@Database(
    entities = [CurrentWeather::class, Forecast::class],
    version = 1,
    exportSchema = false
)

@TypeConverters(ForecastDatabase.Converters::class)
abstract class ForecastDatabase : RoomDatabase() {
    abstract fun currentWeatherDao(): CurrentWeatherDao
    abstract fun futureWeatherDao(): FutureWeatherDao

    class Converters {
        @TypeConverter
        fun weatherListToJson(value: List<Weather>?) = Gson().toJson(value)
        @TypeConverter
        fun forecastListToJson(value: List<FutureWeatherList>?) = Gson().toJson(value)

        @TypeConverter
        fun weatherJsonToList(value: String) = Gson().fromJson(value, Array<Weather>::class.java).toList()
        @TypeConverter
        fun forecastJsonToList(value: String) = Gson().fromJson(value, Array<FutureWeatherList>::class.java).toList()

    }

    companion object {
        @Volatile private var instance: ForecastDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDatabase(context).also { instance = it }
        }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext,
                ForecastDatabase::class.java, "forecast.db")
                .build()
    }
}