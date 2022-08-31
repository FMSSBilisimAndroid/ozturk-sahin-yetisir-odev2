package com.ozturksahinyetisir.week2

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ozturksahinyetisir.week2.databinding.ActivityLastBinding

class LastActivity : AppCompatActivity() {

    lateinit var preferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLastBinding.inflate(layoutInflater)
        setContentView(binding.root)

        preferences = getSharedPreferences("userdata", MODE_PRIVATE)
        var usernameveri = preferences.getString("usernameid","")

        binding.kullanicitext.text = usernameveri.toString()

    }
}