package com.example.forecast.data.db.unitlocalized.current;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b!\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0012\u0010\u000e\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005R\u0012\u0010\u0018\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005R\u0012\u0010\u001a\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0012\u0010\u001c\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015R\u0012\u0010\u001e\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\tR\u0012\u0010 \u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0005R\u0012\u0010\"\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u0015R\u0012\u0010$\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010\u0005R\u0012\u0010&\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\'\u0010\u0005R\u0012\u0010(\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010\u0015R\u0012\u0010*\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b+\u0010\u0015R\u0012\u0010,\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b-\u0010\u0015R\u0012\u0010.\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b/\u0010\u0005R\u0012\u00100\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b1\u0010\u0005R\u0012\u00102\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b3\u0010\u0005\u00a8\u00064"}, d2 = {"Lcom/example/forecast/data/db/unitlocalized/current/UnitSpecificCurrentWeather;", "", "all", "", "getAll", "()I", "base", "", "getBase", "()Ljava/lang/String;", "cod", "getCod", "country", "getCountry", "deg", "getDeg", "dt", "getDt", "feelsLike", "", "getFeelsLike", "()D", "humidity", "getHumidity", "idSys", "getIdSys", "lat", "getLat", "lon", "getLon", "name", "getName", "pressure", "getPressure", "speed", "getSpeed", "sunrise", "getSunrise", "sunset", "getSunset", "temp", "getTemp", "tempMax", "getTempMax", "tempMin", "getTempMin", "timezone", "getTimezone", "type", "getType", "visibility", "getVisibility", "app_debug"})
public abstract interface UnitSpecificCurrentWeather {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getBase();
    
    public abstract int getAll();
    
    public abstract int getCod();
    
    public abstract double getLat();
    
    public abstract double getLon();
    
    public abstract int getDt();
    
    public abstract double getFeelsLike();
    
    public abstract int getHumidity();
    
    public abstract double getTemp();
    
    public abstract int getPressure();
    
    public abstract double getTempMax();
    
    public abstract double getTempMin();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCountry();
    
    public abstract int getIdSys();
    
    public abstract int getSunrise();
    
    public abstract int getSunset();
    
    public abstract int getType();
    
    public abstract int getTimezone();
    
    public abstract int getVisibility();
    
    public abstract int getDeg();
    
    public abstract double getSpeed();
}