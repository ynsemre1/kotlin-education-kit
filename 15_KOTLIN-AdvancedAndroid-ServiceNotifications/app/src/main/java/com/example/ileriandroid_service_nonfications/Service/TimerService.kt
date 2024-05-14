package com.example.ileriandroid_service_nonfications.Service

import android.app.Service
import android.content.Intent
import android.os.Handler
import android.os.IBinder
import android.widget.Toast

class TimerService:Service() {

    private lateinit var handler:Handler
    private val thread = object : Runnable{
        override fun run() {
            Toast.makeText(this@TimerService,"Service Calismaya Devam Ediyor", Toast.LENGTH_SHORT)
                .show()

            this@TimerService.handler.postDelayed(this,5000)
        }
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null //Intent ile veri gonderiminde kullanilir.
    }

    override fun onCreate() { //Service basladiginda calisir.
        handler = Handler()
        handler.postDelayed(thread,5000)

        Toast.makeText(this,"Service Baslatildi", Toast.LENGTH_SHORT)
            .show()
    }

    override fun onDestroy() { //Service durduldugunda calisir.
        handler.removeCallbacks(thread)

        Toast.makeText(this,"Service Durduruldu", Toast.LENGTH_SHORT)
            .show()
    }
}