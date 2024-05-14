package com.example.androiddepolamaislemleri.LoginEkrani

import android.content.Context
import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible
import com.example.androiddepolamaislemleri.R

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val kullaniciAdi:EditText=findViewById(R.id.kullaniciAdi)
        val sifre:EditText=findViewById(R.id.sifre)
        val hataliSifre:TextView=findViewById(R.id.hataliSifre)
        val girisButton:Button=findViewById(R.id.girisBut)

        val sp=getSharedPreferences("Veri",Context.MODE_PRIVATE)
        val editor=sp.edit()


        val otomatikGirisKullAdi = sp.getString("KullaniciAdi","")
        val otomatikGirisSifre = sp.getString("Sifre","")

        if (otomatikGirisKullAdi=="root" && otomatikGirisSifre =="root"){
            startActivity(Intent(this@Login, BasariliLogin::class.java))
            finish()
        }

        girisButton.setOnClickListener {
            val girilenKAdi= kullaniciAdi.text.toString().trim()
            val girilenSifre=sifre.text.toString()

            if (girilenKAdi=="root" && girilenSifre=="root"){
                editor.putString("KullaniciAdi",girilenKAdi)
                editor.putString("Sifre",girilenSifre)
                var basariliSayac = sp.getInt("basariliSayac", 0)
                editor.putInt("basariliSayac",++basariliSayac)
                editor.commit()
                startActivity(Intent(this@Login, BasariliLogin::class.java))
                finish()
            }else{
                var basarisizSayac = sp.getInt("basarisizSayac", 0)
                editor.putInt("basarisizSayac",++basarisizSayac)
                editor.commit()
                hataliSifre.isVisible = true
            }

        }


    }
}