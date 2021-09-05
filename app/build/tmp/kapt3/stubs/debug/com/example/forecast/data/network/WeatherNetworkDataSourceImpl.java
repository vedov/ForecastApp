package com.example.forecast.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/forecast/data/network/WeatherNetworkDataSourceImpl;", "Lcom/example/forecast/data/network/WeatherNetworkDataSource;", "openWeatherApiService", "Lcom/example/forecast/data/network/OpenWeatherApiService;", "(Lcom/example/forecast/data/network/OpenWeatherApiService;)V", "_downloadedCurrentWeather", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/forecast/data/network/response/CurrentWeatherResponse;", "_downloadedFutureWeather", "Lcom/example/forecast/data/network/response/FutureWeatherResponse;", "downloadedCurrentWeather", "Landroidx/lifecycle/LiveData;", "getDownloadedCurrentWeather", "()Landroidx/lifecycle/LiveData;", "downloadedFutureWeather", "getDownloadedFutureWeather", "fetchCurrentWeather", "", "location", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFutureWeather", "app_debug"})
public final class WeatherNetworkDataSourceImpl implements com.example.forecast.data.network.WeatherNetworkDataSource {
    private final com.example.forecast.data.network.OpenWeatherApiService openWeatherApiService = null;
    private final androidx.lifecycle.MutableLiveData<com.example.forecast.data.network.response.CurrentWeatherResponse> _downloadedCurrentWeather = null;
    private final androidx.lifecycle.MutableLiveData<com.example.forecast.data.network.response.FutureWeatherResponse> _downloadedFutureWeather = null;
    
    public WeatherNetworkDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.example.forecast.data.network.OpenWeatherApiService openWeatherApiService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.example.forecast.data.network.response.CurrentWeatherResponse> getDownloadedCurrentWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.example.forecast.data.network.response.FutureWeatherResponse> getDownloadedFutureWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchCurrentWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchFutureWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}