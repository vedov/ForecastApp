package com.example.forecast.ui.base

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.preference.PreferenceManager
import androidx.recyclerview.widget.RecyclerView
import com.example.forecast.R
import com.example.forecast.data.db.entity.FutureWeatherList
import com.example.forecast.data.network.ConnectivityInterceptorImpl
import com.example.forecast.data.network.OpenWeatherApiService
import com.example.forecast.data.network.WeatherNetworkDataSource
import com.example.forecast.data.network.WeatherNetworkDataSourceImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class RecyclerAdapter(private val forecast: List<FutureWeatherList>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemTemperature: TextView
        var itemCondition: TextView
        var itemDate: TextView
        var itemHour: TextView

        init {
            itemTemperature = itemView.findViewById(R.id.textview_day_temperature)
            itemCondition = itemView.findViewById(R.id.textview_day_condition)
            itemDate = itemView.findViewById(R.id.textview_day_date)
            itemHour = itemView.findViewById(R.id.textview_day_hour)

        }
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_future_weather, viewGroup, false)

        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        val temp = kotlin.math.round(forecast[position].main.temp).toString().split(".0")[0]
        holder.itemTemperature.text = temp + "°C"
        holder.itemCondition.text = "Feels like: " + forecast[position].main.feelsLike.toString() + "°C"
        holder.itemDate.text = forecast[position].dt_txt.split(" ")[0]
        holder.itemHour.text = forecast[position].dt_txt.split(" ")[1].split(":")[0] +":"+ forecast[position].dt_txt.split(" ")[1].split(":")[1]

    }

    override fun getItemCount(): Int {
        return forecast.size
    }
}