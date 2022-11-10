package com.example.recipes

import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import com.google.android.material.textfield.TextInputLayout


class RegistrationActivity : AppCompatActivity() {

    private val minNameLength = 3
    private val minEmailLength = 5
    val minPasswordLength = 6

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val loginButton = findViewById<Button>(R.id.loginButton2)
        loginButton?.setOnClickListener {
            val intent =
                Intent(this@RegistrationActivity, LoginActivity::class.java)
            startActivity(intent)
        }

        val nameTextInputLayout = findViewById<TextInputLayout>(R.id.nameTextInputLayout)
        val nameEditText = findViewById<EditText>(R.id.nameEditText)

        nameEditText.doAfterTextChanged {
            nameTextInputLayout.error =
                if (nameEditText.text.length in 0 until minNameLength) {
                    "Введите не менее $minNameLength символов!"
                } else null
        }

        val emailTextInputLayout = findViewById<TextInputLayout>(R.id.emailTextInputLayout)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)

        emailEditText.doAfterTextChanged {
            emailTextInputLayout.error =
                if ('@' !in emailEditText.text) {
                    "Email должен содержать: @"
                } else null

            emailTextInputLayout.error =
                if (emailEditText.text.length < minEmailLength) {
                    "Введите не менее $minEmailLength символов!"
                } else emailTextInputLayout.error
        }

        val passwordTextInputLayout = findViewById<TextInputLayout>(R.id.passwordTextInputLayout)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)

        passwordEditText.doAfterTextChanged {
            passwordTextInputLayout.error =
                if (passwordEditText.text.length < minPasswordLength) {
                    "Введите не менее $minPasswordLength символов!"
                } else null

        }
    }
}
