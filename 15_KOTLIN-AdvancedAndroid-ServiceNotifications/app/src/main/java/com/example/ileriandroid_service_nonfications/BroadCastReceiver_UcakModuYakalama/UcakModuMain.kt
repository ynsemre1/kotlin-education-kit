package com.example.ileriandroid_service_nonfications.BroadCastReceiver_UcakModuYakalama

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ileriandroid_service_nonfications.R

class UcakModuMain : AppCompatActivity() {

    private lateinit var ucakModu:UcakModuAlici

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ucak_modu_main)

        ucakModu = UcakModuAlici()
    }

    override fun onResume() {
        super.onResume()

        val intentFilter = IntentFilter()
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE")

        registerReceiver(ucakModu,intentFilter)
    }

    override fun onStop() {
        super.onStop()

        unregisterReceiver(ucakModu)
    }
}