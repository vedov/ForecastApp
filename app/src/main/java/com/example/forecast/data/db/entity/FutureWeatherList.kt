package com.example.forecast.data.db.entity

import androidx.room.Embedded
import androidx.room.Entity
import com.google.gson.annotations.SerializedName
data class FutureWeatherList(
    @SerializedName("dt")
    val dt: Long,
    @Embedded(prefix = "list_")
    @SerializedName("main")
    val main: Main,

    @SerializedName("dt_txt")
    val dt_txt: String,

)
