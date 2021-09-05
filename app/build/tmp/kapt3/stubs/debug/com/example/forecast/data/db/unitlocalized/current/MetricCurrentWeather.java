package com.example.forecast.data.db.unitlocalized.current;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\bD\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u00b5\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\b\u00a2\u0006\u0002\u0010\u001bJ\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\bH\u00c6\u0003J\t\u00108\u001a\u00020\bH\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\u0005H\u00c6\u0003J\t\u0010>\u001a\u00020\u0005H\u00c6\u0003J\t\u0010?\u001a\u00020\u0005H\u00c6\u0003J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\t\u0010A\u001a\u00020\u0005H\u00c6\u0003J\t\u0010B\u001a\u00020\u0005H\u00c6\u0003J\t\u0010C\u001a\u00020\bH\u00c6\u0003J\t\u0010D\u001a\u00020\u0005H\u00c6\u0003J\t\u0010E\u001a\u00020\bH\u00c6\u0003J\t\u0010F\u001a\u00020\bH\u00c6\u0003J\t\u0010G\u001a\u00020\u0005H\u00c6\u0003J\t\u0010H\u001a\u00020\bH\u00c6\u0003J\t\u0010I\u001a\u00020\u0005H\u00c6\u0003J\t\u0010J\u001a\u00020\bH\u00c6\u0003J\u00e5\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\bH\u00c6\u0001J\u0013\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010OH\u00d6\u0003J\t\u0010P\u001a\u00020\u0005H\u00d6\u0001J\t\u0010Q\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0016\u0010\u0012\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0016\u0010\u0019\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0016\u0010\n\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\b8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\f\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0016\u0010\u0013\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001dR\u0016\u0010\u0007\u001a\u00020\b8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0016\u0010\t\u001a\u00020\b8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0016\u0010\u0011\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0016\u0010\u000e\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0016\u0010\u001a\u001a\u00020\b8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0016\u0010\u0014\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0016\u0010\u0015\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0016\u0010\r\u001a\u00020\b8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0016\u0010\u000f\u001a\u00020\b8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0016\u0010\u0010\u001a\u00020\b8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0016\u0010\u0017\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001dR\u0016\u0010\u0016\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001dR\u0016\u0010\u0018\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001d\u00a8\u0006R"}, d2 = {"Lcom/example/forecast/data/db/unitlocalized/current/MetricCurrentWeather;", "Lcom/example/forecast/data/db/unitlocalized/current/UnitSpecificCurrentWeather;", "base", "", "all", "", "cod", "lat", "", "lon", "dt", "feelsLike", "humidity", "temp", "pressure", "tempMax", "tempMin", "name", "country", "idSys", "sunrise", "sunset", "type", "timezone", "visibility", "deg", "speed", "(Ljava/lang/String;IIDDIDIDIDDLjava/lang/String;Ljava/lang/String;IIIIIIID)V", "getAll", "()I", "getBase", "()Ljava/lang/String;", "getCod", "getCountry", "getDeg", "getDt", "getFeelsLike", "()D", "getHumidity", "getIdSys", "getLat", "getLon", "getName", "getPressure", "getSpeed", "getSunrise", "getSunset", "getTemp", "getTempMax", "getTempMin", "getTimezone", "getType", "getVisibility", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class MetricCurrentWeather implements com.example.forecast.data.db.unitlocalized.current.UnitSpecificCurrentWeather {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "base")
    private final java.lang.String base = null;
    @androidx.room.ColumnInfo(name = "clouds_all")
    private final int all = 0;
    @androidx.room.ColumnInfo(name = "cod")
    private final int cod = 0;
    @androidx.room.ColumnInfo(name = "coord_lat")
    private final double lat = 0.0;
    @androidx.room.ColumnInfo(name = "coord_lon")
    private final double lon = 0.0;
    @androidx.room.ColumnInfo(name = "dt")
    private final int dt = 0;
    @androidx.room.ColumnInfo(name = "main_feelsLike")
    private final double feelsLike = 0.0;
    @androidx.room.ColumnInfo(name = "main_humidity")
    private final int humidity = 0;
    @androidx.room.ColumnInfo(name = "main_temp")
    private final double temp = 0.0;
    @androidx.room.ColumnInfo(name = "main_pressure")
    private final int pressure = 0;
    @androidx.room.ColumnInfo(name = "main_tempMax")
    private final double tempMax = 0.0;
    @androidx.room.ColumnInfo(name = "main_tempMin")
    private final double tempMin = 0.0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "sys_country")
    private final java.lang.String country = null;
    @androidx.room.ColumnInfo(name = "sys_idSys")
    private final int idSys = 0;
    @androidx.room.ColumnInfo(name = "sys_sunrise")
    private final int sunrise = 0;
    @androidx.room.ColumnInfo(name = "sys_sunset")
    private final int sunset = 0;
    @androidx.room.ColumnInfo(name = "sys_type")
    private final int type = 0;
    @androidx.room.ColumnInfo(name = "timezone")
    private final int timezone = 0;
    @androidx.room.ColumnInfo(name = "visibility")
    private final int visibility = 0;
    @androidx.room.ColumnInfo(name = "wind_deg")
    private final int deg = 0;
    @androidx.room.ColumnInfo(name = "wind_speed")
    private final double speed = 0.0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.forecast.data.db.unitlocalized.current.MetricCurrentWeather copy(@org.jetbrains.annotations.NotNull()
    java.lang.String base, int all, int cod, double lat, double lon, int dt, double feelsLike, int humidity, double temp, int pressure, double tempMax, double tempMin, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String country, int idSys, int sunrise, int sunset, int type, int timezone, int visibility, int deg, double speed) {
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
    
    public MetricCurrentWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String base, int all, int cod, double lat, double lon, int dt, double feelsLike, int humidity, double temp, int pressure, double tempMax, double tempMin, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String country, int idSys, int sunrise, int sunset, int type, int timezone, int visibility, int deg, double speed) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getBase() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @java.lang.Override()
    public int getAll() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    @java.lang.Override()
    public int getCod() {
        return 0;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    @java.lang.Override()
    public double getLat() {
        return 0.0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    @java.lang.Override()
    public double getLon() {
        return 0.0;
    }
    
    public final int component6() {
        return 0;
    }
    
    @java.lang.Override()
    public int getDt() {
        return 0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    @java.lang.Override()
    public double getFeelsLike() {
        return 0.0;
    }
    
    public final int component8() {
        return 0;
    }
    
    @java.lang.Override()
    public int getHumidity() {
        return 0;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    @java.lang.Override()
    public double getTemp() {
        return 0.0;
    }
    
    public final int component10() {
        return 0;
    }
    
    @java.lang.Override()
    public int getPressure() {
        return 0;
    }
    
    public final double component11() {
        return 0.0;
    }
    
    @java.lang.Override()
    public double getTempMax() {
        return 0.0;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    @java.lang.Override()
    public double getTempMin() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCountry() {
        return null;
    }
    
    public final int component15() {
        return 0;
    }
    
    @java.lang.Override()
    public int getIdSys() {
        return 0;
    }
    
    public final int component16() {
        return 0;
    }
    
    @java.lang.Override()
    public int getSunrise() {
        return 0;
    }
    
    public final int component17() {
        return 0;
    }
    
    @java.lang.Override()
    public int getSunset() {
        return 0;
    }
    
    public final int component18() {
        return 0;
    }
    
    @java.lang.Override()
    public int getType() {
        return 0;
    }
    
    public final int component19() {
        return 0;
    }
    
    @java.lang.Override()
    public int getTimezone() {
        return 0;
    }
    
    public final int component20() {
        return 0;
    }
    
    @java.lang.Override()
    public int getVisibility() {
        return 0;
    }
    
    public final int component21() {
        return 0;
    }
    
    @java.lang.Override()
    public int getDeg() {
        return 0;
    }
    
    public final double component22() {
        return 0.0;
    }
    
    @java.lang.Override()
    public double getSpeed() {
        return 0.0;
    }
}