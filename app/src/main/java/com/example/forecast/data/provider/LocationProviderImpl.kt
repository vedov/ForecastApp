package com.example.forecast.data.provider

import android.content.Context
const val CUSTOM_LOCATION = "CUSTOM_LOCATION"
class LocationProviderImpl(context: Context) : PreferenceProvider(context),LocationProvider {
    override suspend fun getPreferredLocationString(): String {
        return "Sarajevo"
    }

    override suspend fun getLocationString(): String {
        val selectedLocation = preferences.getString(CUSTOM_LOCATION,"")
        return selectedLocation.toString()
    }
}

