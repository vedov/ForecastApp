package com.example.forecast.ui.weather.future.list

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.Group
import androidx.preference.PreferenceManager
import com.example.forecast.R
import com.example.forecast.data.network.ConnectivityInterceptorImpl
import com.example.forecast.data.network.OpenWeatherApiService
import com.example.forecast.data.network.WeatherNetworkDataSourceImpl
import com.example.forecast.data.provider.LocationProvider
import com.example.forecast.ui.weather.current.CurrentWeatherViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class FutureListWeatherFragment : Fragment() {
    private lateinit var locationProvider: LocationProvider
    private lateinit var viewModel: FutureListWeatherViewModel
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

    companion object {
        fun newInstance() = FutureListWeatherFragment()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.current_weather_fragment,container,false)
        return view
    }

    @SuppressLint("FragmentLiveDataObserve")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FutureListWeatherViewModel::class.java)
        // TODO: Use the ViewModel
        val apiService = OpenWeatherApiService(ConnectivityInterceptorImpl(requireContext()))
        val weatherNetworkDataSource = WeatherNetworkDataSourceImpl(apiService)


        weatherNetworkDataSource.downloadedFutureWeather.observe(this, {
            Log.d("AHMO",it.toString())



        })
        GlobalScope.launch(Dispatchers.Main) {
            /*val sharedpreferences =
                PreferenceManager.getDefaultSharedPreferences(context?.applicationContext)
            locationPreference = sharedpreferences.getString("CUSTOM_LOCATION",null).toString()*/
            weatherNetworkDataSource.fetchCurrentWeather("Sarajevo")
            weatherNetworkDataSource.fetchFutureWeather("Sarajevo")
            setLocation("Sarajevo")
            // TODO: POPRAVI SRANJE DA IZ SHARED PREFERENCE IDE OVDJE U LOKACIJU NEKAKO
        }
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

}