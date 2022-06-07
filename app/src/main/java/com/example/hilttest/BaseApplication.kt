package com.example.hilttest

import android.app.Application
import android.util.Log
import com.example.hilttest.di.DisplayHelperEntryPoint
import com.example.hilttest.first_layer.DatabaseHelper
import com.example.hilttest.first_layer.NetworkUtils
import dagger.hilt.EntryPoints
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject
import javax.inject.Named

@HiltAndroidApp
class BaseApplication : Application() {

    @Inject
    lateinit var databaseHelper: DatabaseHelper

    @Named("dev")
    @Inject
    lateinit var networkUtils: NetworkUtils


    override fun onCreate() {
        super.onCreate()

        Log.e("BaseApplication", "databaseHelper = $databaseHelper")
        Log.e("BaseApplication", "networkUtils = ${networkUtils.app}")

        val displayEntryPoint = EntryPoints.get(this, DisplayHelperEntryPoint::class.java)
        val displayHelper = displayEntryPoint.getDisplayHelper()
        Log.e("BaseApplication", "displayHelper = $displayHelper")
    }
}