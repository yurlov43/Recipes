package com.example.recipes

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import com.example.recipes.databinding.ActivityRegistrationBinding

const val MIN_NAME_LENGTH = 3
const val MIN_EMAIL_LENGTH = 5
const val MIN_PASSWORD_LENGTH = 6

class RegistrationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.loginButton.setOnClickListener {
            val intent =
                Intent(this@RegistrationActivity, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.nameEditText.doAfterTextChanged { text ->
            binding.nameTextInputLayout.error =
                if (text.toString().length in 0 until MIN_NAME_LENGTH) {
                    getString(R.string.registration_minimum_number_of_characters, MIN_NAME_LENGTH)
                } else null
        }

        binding.emailEditText.doAfterTextChanged { text ->
            binding.emailTextInputLayout.error =
                if (android.util.Patterns.EMAIL_ADDRESS.matcher(text.toString()).matches()) {
                    null
                } else getString(R.string.registration_email_error)

            binding.emailTextInputLayout.error =
                if (text.toString().length < MIN_EMAIL_LENGTH) {
                    getString(R.string.registration_minimum_number_of_characters, MIN_EMAIL_LENGTH)
                } else binding.emailTextInputLayout.error
        }

        binding.passwordEditText.doAfterTextChanged { text ->
            binding.passwordTextInputLayout.error =
                if (text.toString().length < MIN_PASSWORD_LENGTH) {
                    getString(R.string.registration_minimum_number_of_characters, MIN_PASSWORD_LENGTH)
                } else null
        }
    }
}
