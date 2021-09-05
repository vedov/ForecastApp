package com.example.forecast.data.db.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
@Entity(tableName = "future_weather")
data class Forecast(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    @SerializedName("cod")
    val cod: String,
    @SerializedName("message")
    val message: String,
    @SerializedName("cnt")
    val cnt: String,
)

