package com.example.ileriandroid_service_nonfications.BroadcastReceiver_SarzSeviyeKontrol

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ileriandroid_service_nonfications.R

class SarzSeviyeMain : AppCompatActivity() {

    private lateinit var sarjSeviye:SarzSeviyeAlgilama

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sarz_seviye_main)

        sarjSeviye = SarzSeviyeAlgilama()
    }

    override fun onResume() {
        super.onResume()

        val filter = IntentFilter()
        filter.addAction("android.intent.action.BATTERY_LOW")

        registerReceiver(sarjSeviye,filter)
    }

    override fun onStop() {
        super.onStop()

        unregisterReceiver(sarjSeviye)
    }
}