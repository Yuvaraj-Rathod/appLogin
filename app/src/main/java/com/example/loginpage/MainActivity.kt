package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var usernameInput : EditText
    lateinit var passwordInput : EditText
    lateinit var loginBtn :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        loginBtn = findViewById(R.id.login_btn)

        loginBtn.setOnClickListener{
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            if (username.length > 6 && password.length > 6) {
                // Both username and password meet the length requirement
                Log.i("Test Credentials", "Username : $username and password : $password")
                // Proceed with login logic here
            } else {
                // Display an error message using Toast
                Toast.makeText(this, "Username and password must be more than 6 characters", Toast.LENGTH_SHORT).show()
            }
        }
        }
    }
