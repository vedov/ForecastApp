package com.example.forecast.data.db.entity

import com.google.gson.annotations.SerializedName

data class Temp(
    @SerializedName("day")
    val day: Double,
    @SerializedName("min")
    val min: Double,
    @SerializedName("max")
    val max: Double,
    @SerializedName("night")
    val night: Double,
    @SerializedName("eve")
    val eve: Double,
    @SerializedName("morn")
    val morn: Double
){
    constructor(): this(0.0,0.0,0.0,0.0,0.0,0.0)
}
