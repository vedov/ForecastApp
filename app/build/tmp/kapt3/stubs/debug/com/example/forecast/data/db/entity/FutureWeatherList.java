package com.example.forecast.data.db.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0007H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003J\t\u0010#\u001a\u00020\u0007H\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003J\t\u0010%\u001a\u00020\u0007H\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003Ji\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020,H\u00d6\u0001J\t\u0010-\u001a\u00020.H\u00d6\u0001R\u0016\u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006/"}, d2 = {"Lcom/example/forecast/data/db/entity/FutureWeatherList;", "", "dt", "", "temp", "Lcom/example/forecast/data/db/entity/Temp;", "pressure", "", "humidity", "weather", "", "Lcom/example/forecast/data/db/entity/Weather;", "speed", "deg", "clouds", "rain", "(JLcom/example/forecast/data/db/entity/Temp;DDLjava/util/List;DDDD)V", "getClouds", "()D", "getDeg", "getDt", "()J", "getHumidity", "getPressure", "getRain", "getSpeed", "getTemp", "()Lcom/example/forecast/data/db/entity/Temp;", "getWeather", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class FutureWeatherList {
    @com.google.gson.annotations.SerializedName(value = "dt")
    private final long dt = 0L;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "temp")
    private final com.example.forecast.data.db.entity.Temp temp = null;
    @com.google.gson.annotations.SerializedName(value = "pressure")
    private final double pressure = 0.0;
    @com.google.gson.annotations.SerializedName(value = "humidity")
    private final double humidity = 0.0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "weather")
    private final java.util.List<com.example.forecast.data.db.entity.Weather> weather = null;
    @com.google.gson.annotations.SerializedName(value = "speed")
    private final double speed = 0.0;
    @com.google.gson.annotations.SerializedName(value = "deg")
    private final double deg = 0.0;
    @com.google.gson.annotations.SerializedName(value = "clouds")
    private final double clouds = 0.0;
    @com.google.gson.annotations.SerializedName(value = "rain")
    private final double rain = 0.0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.forecast.data.db.entity.FutureWeatherList copy(long dt, @org.jetbrains.annotations.NotNull()
    com.example.forecast.data.db.entity.Temp temp, double pressure, double humidity, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.forecast.data.db.entity.Weather> weather, double speed, double deg, double clouds, double rain) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public FutureWeatherList(long dt, @org.jetbrains.annotations.NotNull()
    com.example.forecast.data.db.entity.Temp temp, double pressure, double humidity, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.forecast.data.db.entity.Weather> weather, double speed, double deg, double clouds, double rain) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getDt() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.forecast.data.db.entity.Temp component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.forecast.data.db.entity.Temp getTemp() {
        return null;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double getPressure() {
        return 0.0;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double getHumidity() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.forecast.data.db.entity.Weather> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.forecast.data.db.entity.Weather> getWeather() {
        return null;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double getSpeed() {
        return 0.0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double getDeg() {
        return 0.0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double getClouds() {
        return 0.0;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    public final double getRain() {
        return 0.0;
    }
}