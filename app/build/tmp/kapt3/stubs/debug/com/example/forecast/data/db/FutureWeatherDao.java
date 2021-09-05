package com.example.forecast.data.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\'\u00a8\u0006\b"}, d2 = {"Lcom/example/forecast/data/db/FutureWeatherDao;", "", "getWeatherMetric", "Landroidx/lifecycle/LiveData;", "Lcom/example/forecast/data/db/entity/Forecast;", "insert", "", "futureWeatherEntries", "app_debug"})
public abstract interface FutureWeatherDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.forecast.data.db.entity.Forecast futureWeatherEntries);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from future_weather")
    @androidx.room.RewriteQueriesToDropUnusedColumns()
    public abstract androidx.lifecycle.LiveData<com.example.forecast.data.db.entity.Forecast> getWeatherMetric();
}