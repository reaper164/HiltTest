package com.example.hilttest.di

import com.example.hilttest.first_layer.DisplayHelper
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface DisplayHelperEntryPoint {
    fun getDisplayHelper() : DisplayHelper
}