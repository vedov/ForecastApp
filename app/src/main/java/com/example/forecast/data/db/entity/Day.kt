package com.example.forecast.data.db.entity

import androidx.room.Embedded
import com.google.gson.annotations.SerializedName

data class Day (
    @SerializedName("base")
    val base: String,
    @Embedded(prefix = "clouds_")
    @SerializedName("clouds")
    val clouds: Clouds,
    @SerializedName("cod")
    val cod: Int,
    @Embedded(prefix = "coord_")
    @SerializedName("coord")
    val coord: Coord,
    @SerializedName("dt")
    val dt: Int,
    @Embedded(prefix = "main_")
    @SerializedName("main")
    val main: Main,
    @SerializedName("name")
    val name: String,
    @Embedded(prefix = "sys_")
    @SerializedName("sys")
    val sys: Sys,
    @SerializedName("timezone")
    val timezone: Int,
    @SerializedName("visibility")
    val visibility: Int,
    @Embedded(prefix = "wind_")
    @SerializedName("wind")
    val wind: Wind,
    @SerializedName("dt_txt")
    val dt_txt: String
)