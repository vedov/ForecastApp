package com.example.forecast.ui.weather.future.list

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.Group
import androidx.preference.PreferenceManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.forecast.R
import com.example.forecast.data.db.entity.FutureWeatherList
import com.example.forecast.data.network.ConnectivityInterceptorImpl
import com.example.forecast.data.network.OpenWeatherApiService
import com.example.forecast.data.network.WeatherNetworkDataSource
import com.example.forecast.data.network.WeatherNetworkDataSourceImpl
import com.example.forecast.data.network.response.FutureWeatherResponse
import com.example.forecast.ui.base.RecyclerAdapter
import com.example.forecast.ui.base.ScopedFragment
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.closestKodein

class FutureListWeatherFragment : ScopedFragment(), KodeinAware {

    override val kodein by closestKodein()


    private lateinit var viewModel: FutureListWeatherViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var loading: Group
    private lateinit var currentLocation: String
    private lateinit var locationPreference: String


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.future_list_weather_fragment,container,false)
        loading = view.findViewById(R.id.group_loading)
        recyclerView = view.findViewById(R.id.recyclerView)

        return view
    }

   @SuppressLint("FragmentLiveDataObserve")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FutureListWeatherViewModel::class.java)
       var itemList: List<FutureWeatherList>
       val apiService = OpenWeatherApiService(ConnectivityInterceptorImpl(requireContext()))
       val weatherNetworkDataSource = WeatherNetworkDataSourceImpl(apiService)
       weatherNetworkDataSource.downloadedFutureWeather.observe(viewLifecycleOwner, {
           itemList = it.list
           recyclerView.layoutManager = LinearLayoutManager(activity)
           recyclerView.adapter = RecyclerAdapter(itemList)
           loading.visibility = View.GONE
       })
        GlobalScope.launch(Dispatchers.Main) {
            val sharedpreferences =
                PreferenceManager.getDefaultSharedPreferences(context?.applicationContext)
            locationPreference = sharedpreferences.getString("CUSTOM_LOCATION",null).toString()
            weatherNetworkDataSource.fetchCurrentWeather(locationPreference)
            weatherNetworkDataSource.fetchFutureWeather(locationPreference)
            setLocation(locationPreference)
        }


    }
    private fun setLocation(location: String){
        currentLocation = location
    }

}