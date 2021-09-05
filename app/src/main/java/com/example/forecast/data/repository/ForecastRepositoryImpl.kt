package com.example.forecast.data.repository

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import com.example.forecast.data.db.CurrentWeatherDao
import com.example.forecast.data.db.unitlocalized.current.MetricCurrentWeather
import com.example.forecast.data.network.WeatherNetworkDataSource
import com.example.forecast.data.network.response.CurrentWeatherResponse
import com.example.forecast.data.provider.LocationProvider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.time.ZonedDateTime

class ForecastRepositoryImpl(
    private val currentWeatherDao: CurrentWeatherDao,
    private val weatherNetworkDataSource: WeatherNetworkDataSource,
    private val locationProvider: LocationProvider
    ) : ForecastRepository {

        init {
            weatherNetworkDataSource.downloadedCurrentWeather.observeForever { newCurrentWeather ->
                persistFetchedCurrentWeather(newCurrentWeather)
            }
        }

        @RequiresApi(Build.VERSION_CODES.O)
        override suspend fun getCurrentWeather(): LiveData<MetricCurrentWeather> {
            return withContext(Dispatchers.IO) {
                initWeatherData()
                currentWeatherDao.getWeatherMetric()
            }
        }

        private fun persistFetchedCurrentWeather(fetchedWeather: CurrentWeatherResponse) {
            GlobalScope.launch(Dispatchers.IO) {
                currentWeatherDao.upsert(fetchedWeather.currentWeather)
            }
        }

        @RequiresApi(Build.VERSION_CODES.O)
        private suspend fun initWeatherData() {
            if (isFetchCurrentNeeded(ZonedDateTime.now().minusHours(1)))
                fetchCurrentWeather()
        }

        private suspend fun fetchCurrentWeather() {
            weatherNetworkDataSource.fetchCurrentWeather(
                locationProvider.getLocationString()
            )
            Log.d("AHMO",locationProvider.getLocationString())
        }

        @RequiresApi(Build.VERSION_CODES.O)
        private fun isFetchCurrentNeeded(lastFetchTime: ZonedDateTime): Boolean {
            val thirtyMinutesAgo = ZonedDateTime.now().minusMinutes(30)
            return lastFetchTime.isBefore(thirtyMinutesAgo)
        }
}