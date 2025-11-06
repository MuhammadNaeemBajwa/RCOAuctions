package com.rco.auctions

import android.app.Application

class AuctionApplication : Application() {

    companion object {
        private const val TAG = "AuctionApplication"
        lateinit var instance: AuctionApplication
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}

