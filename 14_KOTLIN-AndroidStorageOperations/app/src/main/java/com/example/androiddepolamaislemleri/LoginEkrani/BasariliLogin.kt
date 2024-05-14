package com.example.androiddepolamaislemleri.LoginEkrani

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.androiddepolamaislemleri.R

class BasariliLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basarili_login)

        val basariliGiris:TextView=findViewById(R.id.basariliGiris)
        val basarisizGiris:TextView=findViewById(R.id.basarisizGiris)

        val sp=getSharedPreferences("Veri",Context.MODE_PRIVATE)

        val basariliSayac = sp.getInt("basariliSayac", 0)
        basariliGiris.text="Basarili Giris Sayisi: $basariliSayac"

        val basarisizSayac = sp.getInt("basarisizSayac", 0)
        basarisizGiris.text="Basarisiz Giris Sayisi: $basarisizSayac"

        val cikisYapBut:Button=findViewById(R.id.cikisYapButton)
        cikisYapBut.setOnClickListener {
            val editor = sp.edit()
            editor.remove("KullaniciAdi")
            editor.remove("Sifre")
            editor.apply()

            startActivity(Intent(this@BasariliLogin, Login::class.java))
            finish()
        }
    }
}