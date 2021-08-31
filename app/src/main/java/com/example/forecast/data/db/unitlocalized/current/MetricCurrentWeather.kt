package com.example.forecast.data.db.unitlocalized.current

import androidx.room.ColumnInfo


data class MetricCurrentWeather(
    @ColumnInfo(name="base")
    override val base: String,
    @ColumnInfo(name="clouds_all")
    override val all: Int,
    @ColumnInfo(name="cod")
    override val cod: Int,
    @ColumnInfo(name="coord_lat")
    override val lat: Double,
    @ColumnInfo(name="coord_lon")
    override val lon: Double,
    @ColumnInfo(name="dt")
    override val dt: Int,

    @ColumnInfo(name="main_feelsLike")
override val feelsLike: Double,
    @ColumnInfo(name="main_humidity")
override val humidity: Int,
    @ColumnInfo(name="main_temp")
override val temp: Double,
    @ColumnInfo(name="main_pressure")
override val pressure: Int,
    @ColumnInfo(name="main_tempMax")
override val tempMax: Double,
    @ColumnInfo(name="main_tempMin")
override val tempMin: Double,
    @ColumnInfo(name="name")
    override val name: String,
    @ColumnInfo(name="sys_country")
    override val country: String,
    @ColumnInfo(name="sys_idSys")
    override val idSys: Int,
    @ColumnInfo(name="sys_sunrise")
    override val sunrise: Int,
    @ColumnInfo(name="sys_sunset")
    override val sunset: Int,
    @ColumnInfo(name="sys_type")
    override val type: Int,
    @ColumnInfo(name="timezone")
    override val timezone: Int,
    @ColumnInfo(name="visibility")
    override val visibility: Int,
    @ColumnInfo(name="wind_deg")
    override val deg: Int,
    @ColumnInfo(name="wind_speed")
    override val speed: Double,

    ): UnitSpecificCurrentWeather
