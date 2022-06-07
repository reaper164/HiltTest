package com.example.hilttest.first_layer

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DatabaseHelper @Inject constructor() {
    val TAG = "DatabaseHelper"
}