package com.example.hilttest.di

import android.app.Activity
import android.app.Application
import com.example.hilttest.first_layer.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped
import dagger.hilt.android.scopes.ActivityScoped


@Module
@InstallIn(ActivityComponent::class)
class RepoModule {

    @ActivityScoped
    @Provides
    fun provideRepository(application: Application, activity: Activity) : Repository = Repository(activity)
}