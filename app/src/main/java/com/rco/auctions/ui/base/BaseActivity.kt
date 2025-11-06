package com.rco.auctions.ui.base

import androidx.appcompat.app.AppCompatActivity
import com.rco.auctions.utils.SessionManagement

open class BaseActivity : AppCompatActivity() {

    protected lateinit var sessionManagement: SessionManagement

    override fun onStart() {
        super.onStart()
        if (!::sessionManagement.isInitialized) {
            sessionManagement = SessionManagement(this)
        }
    }

    protected fun showToast(message: String) {
        android.widget.Toast.makeText(this, message, android.widget.Toast.LENGTH_SHORT).show()
    }

    protected fun showLongToast(message: String) {
        android.widget.Toast.makeText(this, message, android.widget.Toast.LENGTH_LONG).show()
    }
}

