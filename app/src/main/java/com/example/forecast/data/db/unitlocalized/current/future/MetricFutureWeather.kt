package com.example.forecast.data.db.unitlocalized.current.future

import androidx.room.ColumnInfo
import com.google.gson.annotations.SerializedName


data class MetricFutureWeather(
    @ColumnInfo(name="cod")
    override val cod: Int

    ): UnitSpecificFutureWeather
