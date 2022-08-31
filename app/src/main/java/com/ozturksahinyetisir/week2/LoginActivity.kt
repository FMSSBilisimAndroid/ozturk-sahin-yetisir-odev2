package com.ozturksahinyetisir.week2

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

import com.ozturksahinyetisir.week2.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {


    private lateinit var binding:ActivityLoginBinding
    private lateinit var MainIntent: Intent
    private lateinit var RegisterIntent: Intent
    private lateinit var LastIntent: Intent
    lateinit var preferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        //val found = false
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        LastIntent = Intent(this,LastActivity::class.java)
        MainIntent = Intent(this,MainActivity::class.java)
        RegisterIntent = Intent(this,RegisterActivity::class.java)
        val regPage = findViewById(R.id.orCreateNewText) as TextView
        preferences = getSharedPreferences("userdata", MODE_PRIVATE)
        binding.loginImageButton.setOnClickListener {
            var usernameveri = preferences.getString("usernameid","")
            var passwordveri = preferences.getString("pword","")

            var loginUsername = binding.usernameLayout.text.toString()
            var loginPw = binding.passwordLayout.text.toString()

            if ((usernameveri == loginUsername) && (passwordveri == loginPw)) {
                startActivity(LastIntent)
            }else if((loginUsername.isEmpty()) || loginPw.isEmpty()) {
                Toast.makeText(this, "username & password cannot be left blank ", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Incorrect id or password", Toast.LENGTH_SHORT).show()
            }

            binding.backButton.setOnClickListener {
                startActivity(MainIntent)
            }

            regPage.setOnClickListener{
                startActivity(RegisterIntent)
            }
        }


        }

        }

