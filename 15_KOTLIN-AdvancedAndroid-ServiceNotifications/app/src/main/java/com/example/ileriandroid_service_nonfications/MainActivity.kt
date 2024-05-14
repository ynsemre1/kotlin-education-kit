package com.example.ileriandroid_service_nonfications

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.ileriandroid_service_nonfications.Bildirim_DurumaBagli.DurumaBagliBildirim
import com.example.ileriandroid_service_nonfications.BroadCastReceiver_UcakModuYakalama.UcakModuMain
import com.example.ileriandroid_service_nonfications.BroadcastReceiver_SarzSeviyeKontrol.SarzSeviyeMain
import com.example.ileriandroid_service_nonfications.CountDownTimer.CountDownTimer
import com.example.ileriandroid_service_nonfications.Service.ServiceMain

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val serviceBut:Button=findViewById(R.id.serviceBut)
        serviceBut.setOnClickListener {
            startActivity(Intent(this@MainActivity,ServiceMain::class.java))
        }

        val sarzButton:Button=findViewById(R.id.sarjButton)
        sarzButton.setOnClickListener {
            startActivity(Intent(this@MainActivity,SarzSeviyeMain::class.java))
        }

        val ucakmoduButton:Button=findViewById(R.id.ucakmoduButton)
        ucakmoduButton.setOnClickListener {
            startActivity(Intent(this@MainActivity,UcakModuMain::class.java))
        }

        val bildirimButton:Button=findViewById(R.id.bildirimButton)
        bildirimButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, DurumaBagliBildirim::class.java))
        }

        val sayiciButton:Button=findViewById(R.id.sayiciButton)
        sayiciButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, CountDownTimer::class.java))
        }


    }
}