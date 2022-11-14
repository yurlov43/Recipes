package com.example.recipes

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val registrationButton = findViewById<Button>(R.id.registration_button)
        registrationButton?.setOnClickListener {
            val intent = Intent(this@LoginActivity, RegistrationActivity::class.java)
            startActivity(intent)
        }
    }
}