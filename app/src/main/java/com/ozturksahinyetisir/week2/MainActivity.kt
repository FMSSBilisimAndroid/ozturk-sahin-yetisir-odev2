package com.ozturksahinyetisir.week2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ozturksahinyetisir.week2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var LoginIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        LoginIntent = Intent(this,LoginActivity::class.java)

        binding.joinnowbutton.setOnClickListener {
            startActivity(LoginIntent)
        }
    }
}