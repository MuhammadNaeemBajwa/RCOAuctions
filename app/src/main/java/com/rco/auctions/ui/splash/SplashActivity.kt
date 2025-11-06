package com.rco.auctions.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.rco.auctions.R
import com.rco.auctions.ui.auth.LoginActivity
import com.rco.auctions.ui.base.BaseActivity
import com.rco.auctions.ui.main.MainActivity

class SplashActivity : BaseActivity() {

    private val splashDuration = 2000L // 2 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            navigateToNextScreen()
        }, splashDuration)
    }

    private fun navigateToNextScreen() {
        val intent = if (sessionManagement.isLoggedIn) {
            Intent(this, MainActivity::class.java)
        } else {
            Intent(this, LoginActivity::class.java)
        }
        startActivity(intent)
        finish()
    }
}

