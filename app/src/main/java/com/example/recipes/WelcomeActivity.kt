package com.example.recipes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WelcomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val registrationButton = findViewById<Button>(R.id.registrationButton)
        registrationButton?.setOnClickListener {
            val intent = Intent(this@WelcomeActivity, RegistrationActivity::class.java)
            startActivity(intent)
        }

        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton?.setOnClickListener {
            val intent = Intent(this@WelcomeActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}