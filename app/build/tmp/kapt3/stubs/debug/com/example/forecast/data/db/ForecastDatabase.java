package com.example.forecast.data.db;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.forecast.data.db.ForecastDatabase.Converters.class})
@androidx.room.Database(entities = {com.example.forecast.data.db.entity.CurrentWeather.class, com.example.forecast.data.db.entity.Forecast.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\t"}, d2 = {"Lcom/example/forecast/data/db/ForecastDatabase;", "Landroidx/room/RoomDatabase;", "()V", "currentWeatherDao", "Lcom/example/forecast/data/db/CurrentWeatherDao;", "futureWeatherDao", "Lcom/example/forecast/data/db/FutureWeatherDao;", "Companion", "Converters", "app_debug"})
public abstract class ForecastDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.forecast.data.db.ForecastDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile com.example.forecast.data.db.ForecastDatabase instance;
    private static final java.lang.Object LOCK = null;
    
    public ForecastDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.forecast.data.db.CurrentWeatherDao currentWeatherDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.forecast.data.db.FutureWeatherDao futureWeatherDao();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J \u0010\b\u001a\n \t*\u0004\u0018\u00010\u00070\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J \u0010\f\u001a\n \t*\u0004\u0018\u00010\u00070\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004H\u0007\u00a8\u0006\r"}, d2 = {"Lcom/example/forecast/data/db/ForecastDatabase$Converters;", "", "()V", "forecastJsonToList", "", "Lcom/example/forecast/data/db/entity/FutureWeatherList;", "value", "", "forecastListToJson", "kotlin.jvm.PlatformType", "weatherJsonToList", "Lcom/example/forecast/data/db/entity/Weather;", "weatherListToJson", "app_debug"})
    public static final class Converters {
        
        public Converters() {
            super();
        }
        
        @androidx.room.TypeConverter()
        public final java.lang.String weatherListToJson(@org.jetbrains.annotations.Nullable()
        java.util.List<com.example.forecast.data.db.entity.Weather> value) {
            return null;
        }
        
        @androidx.room.TypeConverter()
        public final java.lang.String forecastListToJson(@org.jetbrains.annotations.Nullable()
        java.util.List<com.example.forecast.data.db.entity.FutureWeatherList> value) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @androidx.room.TypeConverter()
        public final java.util.List<com.example.forecast.data.db.entity.Weather> weatherJsonToList(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @androidx.room.TypeConverter()
        public final java.util.List<com.example.forecast.data.db.entity.FutureWeatherList> forecastJsonToList(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0011\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/forecast/data/db/ForecastDatabase$Companion;", "", "()V", "LOCK", "instance", "Lcom/example/forecast/data/db/ForecastDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "invoke", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.forecast.data.db.ForecastDatabase invoke(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.example.forecast.data.db.ForecastDatabase buildDatabase(android.content.Context context) {
            return null;
        }
    }
}