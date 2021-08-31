package com.example.forecast.data.network
import com.example.forecast.data.network.ConnectivityInterceptor
import com.example.forecast.data.network.response.CurrentWeatherResponse
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

const val API_KEY = "7cbcf30649d9c5729d393f169534c76b"

//Current Weather
//api.openweathermap.org/data/2.5/weather?q=Sarajevo&units=metric&appid=7cbcf30649d9c5729d393f169534c76b

interface OpenWeatherApiService {
    @GET("weather")
    fun getCurrentWeather(
    @Query("q") location: String,
    @Query("units") units: String ="metric"

    ) : Deferred<CurrentWeatherResponse>
    companion object {
        operator fun invoke(connectivityInterceptor: ConnectivityInterceptor):OpenWeatherApiService{
            val requestInterceptor = Interceptor { chain ->
                val url = chain.request()
                    .url()
                    .newBuilder()
                    .addQueryParameter("appid", API_KEY)
                    .build()
                val request = chain.request()
                    .newBuilder()
                    .url(url)
                    .build()
                return@Interceptor chain.proceed(request)
            }
            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(requestInterceptor)
                .addInterceptor(connectivityInterceptor)
                .build()
            return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://api.openweathermap.org/data/2.5/")
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(OpenWeatherApiService::class.java)
        }

    }

}