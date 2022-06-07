package com.example.hilttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.hilttest.first_layer.DatabaseHelper
import com.example.hilttest.first_layer.NetworkUtils
import com.example.hilttest.first_layer.Repository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var databaseHelper: DatabaseHelper
    @Named("app")
    @Inject
    lateinit var networkUtils: NetworkUtils
    @Inject
    lateinit var repository: Repository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("MainActivity", "databaseHelper = $databaseHelper")
        Log.e("MainActivity", "networkUtils = ${networkUtils.app}")
        Log.e("MainActivity", "repository =  $repository, activity = ${repository.activity}")


        val btn : Button = findViewById(R.id.button)
        btn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

    }
}