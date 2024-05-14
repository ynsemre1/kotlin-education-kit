package com.info.androidegiris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        R.string.app_name
        R.drawable.resim
        R.drawable.ic_baseline_brightness_high_24

        R.string.mesaj

        Log.e("CIKTI","MESAJ")
    }
}