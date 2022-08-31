package com.ozturksahinyetisir.week2

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ozturksahinyetisir.week2.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRegisterBinding
    private lateinit var MainIntent : Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        MainIntent = Intent(this,MainActivity::class.java)
        binding.SignUpButton.setOnClickListener{
            var emailveri = binding.editEmail.text.toString()
            var usernameveri = binding.editName.text.toString()
            var passwordveri = binding.editPassword.text.toString()
            
            var SharedPreferences = this.getSharedPreferences("userdata", MODE_PRIVATE)
            var editor = SharedPreferences.edit()
            
            editor.putString("emailid","$emailveri").apply()
            editor.putString("usernameid","$usernameveri").apply()
            editor.putString("pword","$passwordveri").apply()
            Toast.makeText(applicationContext, "Register Successful", Toast.LENGTH_LONG).show()

            binding.editName.text.clear()
            binding.editEmail.text.clear()
            binding.editPassword.text.clear()

            binding.backImageButton2.setOnClickListener{
                startActivity(MainIntent)
            }
        }

    }
}