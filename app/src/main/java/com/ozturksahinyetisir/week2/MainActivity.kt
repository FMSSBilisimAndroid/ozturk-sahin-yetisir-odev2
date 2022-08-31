package com.ozturksahinyetisir.week2

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.ozturksahinyetisir.week2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var LoginIntent: Intent
    lateinit var preferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var SharedPreferences = this.getSharedPreferences("userdata", MODE_PRIVATE)

        LoginIntent = Intent(this,LoginActivity::class.java)

        binding.joinnowbutton.setOnClickListener {
            startActivity(LoginIntent)
        }
    }
}