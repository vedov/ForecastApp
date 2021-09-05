package com.example.forecast.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/example/forecast/data/repository/ForecastRepository;", "", "getCurrentWeather", "Landroidx/lifecycle/LiveData;", "Lcom/example/forecast/data/db/unitlocalized/current/MetricCurrentWeather;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFutureWeather", "Lcom/example/forecast/data/db/entity/Forecast;", "app_debug"})
public abstract interface ForecastRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCurrentWeather(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.example.forecast.data.db.unitlocalized.current.MetricCurrentWeather>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFutureWeather(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.example.forecast.data.db.entity.Forecast>> continuation);
}