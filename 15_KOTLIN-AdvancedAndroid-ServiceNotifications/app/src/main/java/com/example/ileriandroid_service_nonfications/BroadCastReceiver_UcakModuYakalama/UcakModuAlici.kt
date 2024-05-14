package com.example.ileriandroid_service_nonfications.BroadCastReceiver_UcakModuYakalama

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class UcakModuAlici:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context,"UcakModu Calisti", Toast.LENGTH_SHORT)
            .show()
    }
}