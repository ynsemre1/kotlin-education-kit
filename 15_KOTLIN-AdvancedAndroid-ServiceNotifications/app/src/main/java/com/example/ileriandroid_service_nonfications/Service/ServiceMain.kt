package com.example.ileriandroid_service_nonfications.Service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.ileriandroid_service_nonfications.R

class ServiceMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service_main)

        val baslaBut:Button=findViewById(R.id.baslaButton)
        val durBut:Button=findViewById(R.id.durButton)

        baslaBut.setOnClickListener {
            startService(Intent(this@ServiceMain,TimerService::class.java))
        }

        durBut.setOnClickListener {
            stopService(Intent(this@ServiceMain,TimerService::class.java))
        }
    }
}