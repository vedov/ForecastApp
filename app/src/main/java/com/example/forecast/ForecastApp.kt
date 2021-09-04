package com.example.forecast

import android.app.Application
import androidx.preference.PreferenceManager
import com.example.forecast.data.db.ForecastDatabase
import com.example.forecast.data.network.*
import com.example.forecast.data.repository.ForecastRepository
import com.example.forecast.data.repository.ForecastRepositoryImpl
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton

class ForecastApp: Application(), KodeinAware {
    //Using Kodein.lazy allows accessing the Context at binding time.
    override val kodein = Kodein.lazy {
        bind() from singleton { ForecastDatabase(instance()) }
        bind() from singleton { instance<ForecastDatabase>().currentWeatherDao() }
        bind<ConnectivityInterceptor>() with singleton { ConnectivityInterceptorImpl(instance()) }
        bind() from singleton { OpenWeatherApiService(instance()) }
        bind<WeatherNetworkDataSource>() with singleton { WeatherNetworkDataSourceImpl(instance()) }
        bind<ForecastRepository>() with singleton { ForecastRepositoryImpl(instance(), instance()) }
    }

    override fun onCreate() {
        super.onCreate()

    }
}

