package com.example.forecast.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\'J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/forecast/data/network/OpenWeatherApiService;", "", "getCurrentWeather", "Lkotlinx/coroutines/Deferred;", "Lcom/example/forecast/data/network/response/CurrentWeatherResponse;", "location", "", "units", "getFutureWeather", "Lcom/example/forecast/data/network/response/FutureWeatherResponse;", "Companion", "app_debug"})
public abstract interface OpenWeatherApiService {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.forecast.data.network.OpenWeatherApiService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "weather")
    public abstract kotlinx.coroutines.Deferred<com.example.forecast.data.network.response.CurrentWeatherResponse> getCurrentWeather(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "units")
    java.lang.String units);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "forecast")
    public abstract kotlinx.coroutines.Deferred<com.example.forecast.data.network.response.FutureWeatherResponse> getFutureWeather(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "units")
    java.lang.String units);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002\u00a8\u0006\u0007"}, d2 = {"Lcom/example/forecast/data/network/OpenWeatherApiService$Companion;", "", "()V", "invoke", "Lcom/example/forecast/data/network/OpenWeatherApiService;", "connectivityInterceptor", "Lcom/example/forecast/data/network/ConnectivityInterceptor;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.forecast.data.network.OpenWeatherApiService invoke(@org.jetbrains.annotations.NotNull()
        com.example.forecast.data.network.ConnectivityInterceptor connectivityInterceptor) {
            return null;
        }
    }
}