package com.example.androiddepolamaislemleri

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GirisSayaci_SharedPreferences : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_giris_sayaci_shared_preferences)

        val girisText:TextView=findViewById(R.id.girisSay)

        val sp = getSharedPreferences("Giris Sayisi",Context.MODE_PRIVATE)
        val edit = sp.edit()

        var sayac = sp.getInt("sayac", 0)
        edit.putInt("sayac",++sayac)
        edit.apply()

        girisText.text="Giris Sayisi: $sayac"
    }
}