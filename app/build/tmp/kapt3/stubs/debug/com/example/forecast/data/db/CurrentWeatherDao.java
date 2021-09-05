package com.example.forecast.data.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/example/forecast/data/db/CurrentWeatherDao;", "", "getWeatherMetric", "Landroidx/lifecycle/LiveData;", "Lcom/example/forecast/data/db/unitlocalized/current/MetricCurrentWeather;", "upsert", "", "weatherEntry", "Lcom/example/forecast/data/db/entity/CurrentWeather;", "app_debug"})
public abstract interface CurrentWeatherDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void upsert(@org.jetbrains.annotations.NotNull()
    com.example.forecast.data.db.entity.CurrentWeather weatherEntry);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from current_weather where id = 0")
    @androidx.room.RewriteQueriesToDropUnusedColumns()
    public abstract androidx.lifecycle.LiveData<com.example.forecast.data.db.unitlocalized.current.MetricCurrentWeather> getWeatherMetric();
}