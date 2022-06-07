package com.example.hilttest.di

import android.app.Application
import com.example.hilttest.first_layer.NetworkUtils
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)//FragmentComponent//ActivityComponent//SingletonComponent::class)
class NetworkModule {

    // Singleton for whole app
    @Named("dev")
    @Singleton
    @Provides
    fun provideNetworkDevUtils() : NetworkUtils = NetworkUtils()

    @Named("app")
    @Singleton
    @Provides
    fun provideNetworkAppUtils(app : Application) : NetworkUtils = NetworkUtils(app)
}