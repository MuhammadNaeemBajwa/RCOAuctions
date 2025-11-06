package com.rco.auctions.ui.auth

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.rco.auctions.R
import com.rco.auctions.ui.base.BaseActivity
import com.rco.auctions.ui.main.MainActivity

class LoginActivity : BaseActivity() {

    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initViews()
        setupListeners()
    }

    private fun initViews() {
        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
    }

    private fun setupListeners() {
        btnLogin.setOnClickListener {
            val username = etUsername.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (validateInput(username, password)) {
                performLogin(username, password)
            }
        }
    }

    private fun validateInput(username: String, password: String): Boolean {
        return when {
            username.isEmpty() -> {
                showToast("Please enter username")
                false
            }
            password.isEmpty() -> {
                showToast("Please enter password")
                false
            }
            else -> true
        }
    }

    private fun performLogin(username: String, password: String) {
        // Save credentials
        sessionManagement.userName = username
        sessionManagement.password = password
        sessionManagement.isLoggedIn = true

        // Navigate to main screen
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}

