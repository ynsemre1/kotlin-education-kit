package com.example.androiddepolamaislemleri

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SharedPreferencesKullanimi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_veri)

        val sp = getSharedPreferences("Veri", Context.MODE_PRIVATE)
        val editor = sp.edit()

        //Veri Yazma
        editor.putString("ad", "Yunus")
        editor.putInt("yas", 20)
        editor.apply()

        //Veri Okuma
        val isim = sp.getString("ad", "Isim Girilmedi")
        val yasim = sp.getInt("yas", 0)

        //Veriyi Konsola Yazdirma
        Log.e("adim", isim!!)


        /*
        Veri Silme
        editor.remove("yas")
        editor.commit()
        Log.e("yasim", yasim.toString())
        */

    }
}