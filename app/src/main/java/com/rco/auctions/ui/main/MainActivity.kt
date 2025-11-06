package com.rco.auctions.ui.main

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.rco.auctions.R
import com.rco.auctions.ui.auction.AuctionActivity
import com.rco.auctions.ui.base.BaseActivity

class MainActivity : BaseActivity() {

    private lateinit var btnViewAuctions: Button
    private lateinit var btnLogout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        setupListeners()
    }

    private fun initViews() {
        btnViewAuctions = findViewById(R.id.btnViewAuctions)
        btnLogout = findViewById(R.id.btnLogout)
    }

    private fun setupListeners() {
        btnViewAuctions.setOnClickListener {
            startActivity(Intent(this, AuctionActivity::class.java))
        }

        btnLogout.setOnClickListener {
            sessionManagement.clearSession()
            finish()
        }
    }
}

