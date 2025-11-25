package com.example.lab_week_11_a

import android.app.Application
import android.content.Context

class PreferenceApplication : Application() {

    lateinit var preferenceWrapper: PreferenceWrapper

    override fun onCreate() {
        super.onCreate()

        // Initialize SharedPreference wrapper
        preferenceWrapper = PreferenceWrapper(
            getSharedPreferences(
                // Nama file prefs.xml
                "prefs",
                // Private untuk aplikasi ini saja
                Context.MODE_PRIVATE
            )
        )
    }
}