package com.example.forecast.data.provider

interface LocationProvider {
    suspend fun getPreferredLocationString(): String
    suspend fun getLocationString(): String
}