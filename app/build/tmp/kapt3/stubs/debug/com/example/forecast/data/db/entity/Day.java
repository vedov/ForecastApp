package com.example.forecast.data.db.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0007H\u00c6\u0003J\t\u0010+\u001a\u00020\u0013H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0007H\u00c6\u0003J\t\u0010/\u001a\u00020\tH\u00c6\u0003J\t\u00100\u001a\u00020\u0007H\u00c6\u0003J\t\u00101\u001a\u00020\fH\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u000fH\u00c6\u0003J\t\u00104\u001a\u00020\u0007H\u00c6\u0003J\u0081\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00109\u001a\u00020\u0007H\u00d6\u0001J\t\u0010:\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0010\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0016\u0010\u0011\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(\u00a8\u0006;"}, d2 = {"Lcom/example/forecast/data/db/entity/Day;", "", "base", "", "clouds", "Lcom/example/forecast/data/db/entity/Clouds;", "cod", "", "coord", "Lcom/example/forecast/data/db/entity/Coord;", "dt", "main", "Lcom/example/forecast/data/db/entity/Main;", "name", "sys", "Lcom/example/forecast/data/db/entity/Sys;", "timezone", "visibility", "wind", "Lcom/example/forecast/data/db/entity/Wind;", "dt_txt", "(Ljava/lang/String;Lcom/example/forecast/data/db/entity/Clouds;ILcom/example/forecast/data/db/entity/Coord;ILcom/example/forecast/data/db/entity/Main;Ljava/lang/String;Lcom/example/forecast/data/db/entity/Sys;IILcom/example/forecast/data/db/entity/Wind;Ljava/lang/String;)V", "getBase", "()Ljava/lang/String;", "getClouds", "()Lcom/example/forecast/data/db/entity/Clouds;", "getCod", "()I", "getCoord", "()Lcom/example/forecast/data/db/entity/Coord;", "getDt", "getDt_txt", "getMain", "()Lcom/example/forecast/data/db/entity/Main;", "getName", "getSys", "()Lcom/example/forecast/data/db/entity/Sys;", "getTimezone", "getVisibility", "getWind", "()Lcom/example/forecast/data/db/entity/Wind;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Day {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "base")
    private final java.lang.String base = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "clouds_")
    @com.google.gson.annotations.SerializedName(value = "clouds")
    private final com.example.forecast.data.db.entity.Clouds clouds = null;
    @com.google.gson.annotations.SerializedName(value = "cod")
    private final int cod = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "coord_")
    @com.google.gson.annotations.SerializedName(value = "coord")
    private final com.example.forecast.data.db.entity.Coord coord = null;
    @com.google.gson.annotations.SerializedName(value = "dt")
    private final int dt = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "main_")
    @com.google.gson.annotations.SerializedName(value = "main")
    private final com.example.forecast.data.db.entity.Main main = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "sys_")
    @com.google.gson.annotations.SerializedName(value = "sys")
    private final com.example.forecast.data.db.entity.Sys sys = null;
    @com.google.gson.annotations.SerializedName(value = "timezone")
    private final int timezone = 0;
    @com.google.gson.annotations.SerializedName(value = "visibility")
    private final int visibility = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "wind_")
    @com.google.gson.annotations.SerializedName(value = "wind")
    private final com.example.forecast.data.db.entity.Wind wind = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "dt_txt")
    private final java.lang.String dt_txt = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.forecast.data.db.entity.Day copy(@org.jetbrains.annotations.NotNull()
    java.lang.String base, @org.jetbrains.annotations.NotNull()
    com.example.forecast.data.db.entity.Clouds clouds, int cod, @org.jetbrains.annotations.NotNull()
    com.example.forecast.data.db.entity.Coord coord, int dt, @org.jetbrains.annotations.NotNull()
    com.example.forecast.data.db.entity.Main main, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.example.forecast.data.db.entity.Sys sys, int timezone, int visibility, @org.jetbrains.annotations.NotNull()
    com.example.forecast.data.db.entity.Wind wind, @org.jetbrains.annotations.NotNull()
    java.lang.String dt_txt) {
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
    
    public Day(@org.jetbrains.annotations.NotNull()
    java.lang.String base, @org.jetbrains.annotations.NotNull()
    com.example.forecast.data.db.entity.Clouds clouds, int cod, @org.jetbrains.annotations.NotNull()
    com.example.forecast.data.db.entity.Coord coord, int dt, @org.jetbrains.annotations.NotNull()
    com.example.forecast.data.db.entity.Main main, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.example.forecast.data.db.entity.Sys sys, int timezone, int visibility, @org.jetbrains.annotations.NotNull()
    com.example.forecast.data.db.entity.Wind wind, @org.jetbrains.annotations.NotNull()
    java.lang.String dt_txt) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.forecast.data.db.entity.Clouds component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.forecast.data.db.entity.Clouds getClouds() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getCod() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.forecast.data.db.entity.Coord component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.forecast.data.db.entity.Coord getCoord() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getDt() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.forecast.data.db.entity.Main component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.forecast.data.db.entity.Main getMain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.forecast.data.db.entity.Sys component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.forecast.data.db.entity.Sys getSys() {
        return null;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getTimezone() {
        return 0;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getVisibility() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.forecast.data.db.entity.Wind component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.forecast.data.db.entity.Wind getWind() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDt_txt() {
        return null;
    }
}