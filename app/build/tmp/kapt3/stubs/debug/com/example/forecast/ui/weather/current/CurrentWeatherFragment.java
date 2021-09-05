package com.example.forecast.ui.weather.current;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\tH\u0002J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0017J$\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0002J\u0010\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020\tH\u0002J\u0018\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u00020 H\u0003J\b\u00103\u001a\u00020 H\u0002J\u0010\u00104\u001a\u00020 2\u0006\u00105\u001a\u000201H\u0002J\u0018\u00106\u001a\u00020 2\u0006\u0010+\u001a\u0002012\u0006\u00107\u001a\u00020*H\u0002J\u0010\u00108\u001a\u00020 2\u0006\u00109\u001a\u000201H\u0002J\u0010\u0010:\u001a\u00020 2\u0006\u0010;\u001a\u00020*H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lcom/example/forecast/ui/weather/current/CurrentWeatherFragment;", "Lcom/example/forecast/ui/base/ScopedFragment;", "Lorg/kodein/di/KodeinAware;", "()V", "conditionImageView", "Landroid/widget/ImageView;", "conditionTextView", "Landroid/widget/TextView;", "currentLocation", "", "feelsLikeTextView", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "Lkotlin/Lazy;", "loading", "Landroidx/constraintlayout/widget/Group;", "locationPreference", "locationProvider", "Lcom/example/forecast/data/provider/LocationProvider;", "locationTextView", "precipitationTextView", "temperatureTextView", "timeOfDayImageView", "viewModel", "Lcom/example/forecast/ui/weather/current/CurrentWeatherViewModel;", "visibilityTextView", "windTextView", "getLocation", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "roundTemperature", "", "temperature", "setLocation", "location", "updateCondition", "condition", "conditionCode", "", "updateImage", "updateLocation", "updatePrecipitation", "precipitationVolume", "updateTemperatures", "feelsLike", "updateVisibility", "visibilityDistance", "updateWind", "windSpeed", "app_debug"})
public final class CurrentWeatherFragment extends com.example.forecast.ui.base.ScopedFragment implements org.kodein.di.KodeinAware {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    private com.example.forecast.data.provider.LocationProvider locationProvider;
    private com.example.forecast.ui.weather.current.CurrentWeatherViewModel viewModel;
    private androidx.constraintlayout.widget.Group loading;
    private java.lang.String currentLocation;
    private java.lang.String locationPreference;
    private android.widget.TextView temperatureTextView;
    private android.widget.TextView feelsLikeTextView;
    private android.widget.TextView conditionTextView;
    private android.widget.TextView locationTextView;
    private android.widget.TextView precipitationTextView;
    private android.widget.TextView windTextView;
    private android.widget.TextView visibilityTextView;
    private android.widget.ImageView timeOfDayImageView;
    private android.widget.ImageView conditionImageView;
    
    public CurrentWeatherFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"FragmentLiveDataObserve"})
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final double roundTemperature(double temperature) {
        return 0.0;
    }
    
    private final java.lang.String getLocation() {
        return null;
    }
    
    private final void setLocation(java.lang.String location) {
    }
    
    private final void updateLocation() {
    }
    
    private final void updateTemperatures(int temperature, double feelsLike) {
    }
    
    private final void updateCondition(java.lang.String condition, int conditionCode) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void updateImage() {
    }
    
    private final void updatePrecipitation(int precipitationVolume) {
    }
    
    private final void updateWind(double windSpeed) {
    }
    
    private final void updateVisibility(int visibilityDistance) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
}