package com.example.forecast.data.db.entity


import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
const val CURRENT_WEATHER_ID = 0
@Entity(tableName = "current_weather")
data class CurrentWeather(
    @SerializedName("base")
    val base: String,
    @Embedded(prefix="clouds_")
    @SerializedName("clouds")
    val clouds: Clouds,
    @SerializedName("cod")
    val cod: Int,
    @Embedded(prefix="coord_")
    @SerializedName("coord")
    val coord: Coord,
    @SerializedName("dt")
    val dt: Int,
/*    @SerializedName("id")
    val idCurrentWeather: Int,*/
    @Embedded(prefix="main_")
    @SerializedName("main")
    val main: Main,
    @SerializedName("name")
    val name: String,
    @Embedded(prefix="sys_")
    @SerializedName("sys")
    val sys: Sys,
    @SerializedName("timezone")
    val timezone: Int,
    @SerializedName("visibility")
    val visibility: Int,
/*    @SerializedName("weather")
    val weather: List<Weather>,*/
    @Embedded(prefix="wind_")
    @SerializedName("wind")
    val wind: Wind
){
    @PrimaryKey(autoGenerate = false)
    var id: Int = CURRENT_WEATHER_ID
}