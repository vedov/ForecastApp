package com.example.forecast.ui.weather.current

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.Group
import androidx.lifecycle.ViewModelProviders
import com.example.forecast.R
import com.example.forecast.data.network.ConnectivityInterceptorImpl
import com.example.forecast.data.network.OpenWeatherApiService
import com.example.forecast.data.network.WeatherNetworkDataSourceImpl
import com.example.forecast.data.provider.CUSTOM_LOCATION
import com.example.forecast.data.provider.LocationProvider
import com.example.forecast.data.repository.ForecastRepository
import com.example.forecast.ui.base.ScopedFragment
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.closestKodein
import java.time.ZonedDateTime
import android.content.SharedPreferences

import android.R.string.no
import androidx.preference.PreferenceManager.getDefaultSharedPreferences


class CurrentWeatherFragment : ScopedFragment(), KodeinAware {

    override val kodein by closestKodein()
    private lateinit var locationProvider: LocationProvider
    private lateinit var viewModel: CurrentWeatherViewModel
    private lateinit var loading: Group
    private lateinit var currentLocation: String
    private lateinit var locationPreference: String
    private lateinit var temperatureTextView: TextView
    private lateinit var feelsLikeTextView: TextView
    private lateinit var conditionTextView: TextView
    private lateinit var locationTextView: TextView
    private lateinit var precipitationTextView: TextView
    private lateinit var windTextView: TextView
    private lateinit var visibilityTextView: TextView
    private lateinit var timeOfDayImageView: ImageView
    private lateinit var conditionImageView: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.current_weather_fragment,container,false)
        loading = view.findViewById(R.id.group_loading)
        temperatureTextView = view.findViewById(R.id.textView_temperature)
        feelsLikeTextView = view.findViewById(R.id.textView_feels_like_temperature)
        conditionTextView = view.findViewById(R.id.textView_condition)
        locationTextView = view.findViewById(R.id.textView_location)
        precipitationTextView = view.findViewById(R.id.textView_precipitation)
        windTextView = view.findViewById(R.id.textView_wind)
        visibilityTextView = view.findViewById(R.id.textView_visibility)
        timeOfDayImageView = view.findViewById(R.id.imageView_timeOfDay)
        conditionImageView = view.findViewById(R.id.imageView_condition)
        return view
    }

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("FragmentLiveDataObserve")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CurrentWeatherViewModel::class.java)
        // TODO: Use the ViewModel
        val apiService = OpenWeatherApiService(ConnectivityInterceptorImpl(requireContext()))
        val weatherNetworkDataSource = WeatherNetworkDataSourceImpl(apiService)


        weatherNetworkDataSource.downloadedCurrentWeather.observe(this, {
            loading.visibility = View.GONE
            updateLocation()
            updateImage()
            updateTemperatures(it.main.temp.toInt(), roundTemperature(it.main.feelsLike))
            updateCondition(it.weather[0].description.capitalize(),it.weather[0].idWeather)
            updatePrecipitation(it.main.humidity)
            updateWind(it.wind.speed)
            updateVisibility(it.visibility)



        })
        GlobalScope.launch(Dispatchers.Main) {
            val sharedpreferences = getDefaultSharedPreferences(context?.applicationContext)
            locationPreference = sharedpreferences.getString("CUSTOM_LOCATION",null).toString()
            weatherNetworkDataSource.fetchCurrentWeather(locationPreference)
            setLocation(locationPreference)
        }
    }


   /* private fun updateLocation(location: String) {
        (activity as? AppCompatActivity)?.supportActionBar?.title = location
    }*/
    private fun roundTemperature(temperature:Double): Double {
        return kotlin.math.round(temperature*2)/2.0
    }
    private fun getLocation(): String {
        return currentLocation
    }
    private fun setLocation(location: String){
        currentLocation = location
    }
    private fun updateLocation() {
        locationTextView.text = getLocation().uppercase()
    }

    private fun updateTemperatures(temperature: Int, feelsLike: Double) {
        temperatureTextView.text = "$temperature°C"
        feelsLikeTextView.text = "Feels like $feelsLike°C"
    }
    private fun updateCondition(condition: String, conditionCode: Int) {
        val weatherCode = conditionCode/100
        conditionTextView.text = condition
        if(conditionCode==800) conditionImageView.visibility = View.GONE
        else {
            if(weatherCode == 2 || weatherCode == 3 || weatherCode == 5){
                conditionImageView.setBackgroundResource(R.drawable.ic_rain)
            }
            if(weatherCode == 6) {
                conditionImageView.setBackgroundResource(R.drawable.ic_snow)
            }
            if(weatherCode == 8) {
                conditionImageView.setBackgroundResource(R.drawable.ic_cloudy)
            }
        }



    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun updateImage(){
        val currentTime = ZonedDateTime.now().hour
        if(currentTime in 5..11){
            timeOfDayImageView.setBackgroundResource(R.drawable.ic_morning)
        }
        else if(currentTime in 12..16){
            timeOfDayImageView.setBackgroundResource(R.drawable.ic_day)
        }
        else if (currentTime in 17..21){
            timeOfDayImageView.setBackgroundResource(R.drawable.ic_sunset)
        }
        else {
            timeOfDayImageView.setBackgroundResource(R.drawable.ic_night)
        }
    }
    private fun updatePrecipitation(precipitationVolume: Int) {
        precipitationTextView.text = "$precipitationVolume mm"
    }
    private fun updateWind( windSpeed: Double) {
        windTextView.text = "$windSpeed m/s"
    }
    private fun updateVisibility(visibilityDistance: Int) {
        var distance = visibilityDistance/1000
        visibilityTextView.text = "$distance km"
    }


}
