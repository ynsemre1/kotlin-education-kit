package com.example.androiddepolamaislemleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.androiddepolamaislemleri.HariciveDahiliDepolama.DahiliYazmaveSilme
import com.example.androiddepolamaislemleri.HariciveDahiliDepolama.HariciYazmaveSilme
import com.example.androiddepolamaislemleri.HazirVeriTabaniKullanimi.MainVeriTabaniKopyalama
import com.example.androiddepolamaislemleri.LoginEkrani.Login
import com.example.androiddepolamaislemleri.SQLiteKullanimi.VeriKaydiActivity
import com.example.androiddepolamaislemleri.SozlukApp.SozlukActivity
import com.google.android.material.button.MaterialButtonToggleGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1:Button=findViewById(R.id.b1)
        b1.setOnClickListener {
            startActivity(Intent(this@MainActivity, SharedPreferencesKullanimi::class.java))
        }

        val b2:Button=findViewById(R.id.b2)
        b2.setOnClickListener {
            startActivity(Intent(this@MainActivity, GirisSayaci_SharedPreferences::class.java))
        }

        val b3:Button=findViewById(R.id.b3)
        b3.setOnClickListener {
            startActivity(Intent(this@MainActivity, Login::class.java))
        }

        val b4:Button=findViewById(R.id.b4)
        b4.setOnClickListener {
            startActivity(Intent(this@MainActivity, HariciYazmaveSilme::class.java))
        }

        val b5:Button=findViewById(R.id.b5)
        b5.setOnClickListener {
            startActivity(Intent(this@MainActivity, DahiliYazmaveSilme::class.java))
        }

        val b6:Button=findViewById(R.id.b6)
        b6.setOnClickListener {
            startActivity(Intent(this@MainActivity, VeriKaydiActivity::class.java))
        }

        val b7:Button=findViewById(R.id.b7)
        b7.setOnClickListener {
            startActivity(Intent(this@MainActivity, SozlukActivity::class.java))
        }

        val b8:Button=findViewById(R.id.b8)
        b8.setOnClickListener{
            startActivity(Intent(this@MainActivity, MainVeriTabaniKopyalama::class.java))
        }

        var int = 3
        var string = "Yunus"
        var double = 3.0


    }
}