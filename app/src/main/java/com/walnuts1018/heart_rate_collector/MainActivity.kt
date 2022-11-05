package com.walnuts1018.heart_rate_collector

import android.app.Activity
import android.os.Bundle
import com.walnuts1018.heart_rate_collector.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}