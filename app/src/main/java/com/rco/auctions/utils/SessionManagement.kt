package com.rco.auctions.utils

import android.content.Context
import android.content.SharedPreferences

class SessionManagement(context: Context) {

    companion object {
        private const val PREF_NAME = "AuctionSession"
        private const val KEY_IS_LOGGED_IN = "isLoggedIn"
        private const val KEY_USERNAME = "userName"
        private const val KEY_PASSWORD = "password"
        private const val KEY_USER_ID = "userId"
        private const val KEY_RECORD_ID = "recordId"
        private const val KEY_DEVICE_ID = "deviceId"
    }

    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)

    var isLoggedIn: Boolean
        get() = sharedPreferences.getBoolean(KEY_IS_LOGGED_IN, false)
        set(value) = sharedPreferences.edit().putBoolean(KEY_IS_LOGGED_IN, value).apply()

    var userName: String
        get() = sharedPreferences.getString(KEY_USERNAME, "") ?: ""
        set(value) = sharedPreferences.edit().putString(KEY_USERNAME, value).apply()

    var password: String
        get() = sharedPreferences.getString(KEY_PASSWORD, "") ?: ""
        set(value) = sharedPreferences.edit().putString(KEY_PASSWORD, value).apply()

    var userId: String
        get() = sharedPreferences.getString(KEY_USER_ID, "") ?: ""
        set(value) = sharedPreferences.edit().putString(KEY_USER_ID, value).apply()

    var recordId: String
        get() = sharedPreferences.getString(KEY_RECORD_ID, "") ?: ""
        set(value) = sharedPreferences.edit().putString(KEY_RECORD_ID, value).apply()

    var deviceId: String
        get() = sharedPreferences.getString(KEY_DEVICE_ID, "") ?: ""
        set(value) = sharedPreferences.edit().putString(KEY_DEVICE_ID, value).apply()

    fun clearSession() {
        sharedPreferences.edit().clear().apply()
    }
}

