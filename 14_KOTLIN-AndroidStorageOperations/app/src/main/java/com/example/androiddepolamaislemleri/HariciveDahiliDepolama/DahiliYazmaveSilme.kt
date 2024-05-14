package com.example.androiddepolamaislemleri.HariciveDahiliDepolama

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.androiddepolamaislemleri.R
import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter
import java.io.OutputStreamWriter
import java.lang.Exception

class DahiliYazmaveSilme : AppCompatActivity() {
    lateinit var yabanciKelime: EditText
    lateinit var turkceKelime: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_harici_yazmave_silme)

        yabanciKelime=findViewById(R.id.ykelime)
        turkceKelime=findViewById(R.id.tkelime)

        val yazBut: Button =findViewById(R.id.yazButton)
        val silBut: Button =findViewById(R.id.silButton)
        val sozlukBut: Button =findViewById(R.id.sozlukButton)

        sozlukBut.setOnClickListener {
            startActivity(Intent(this@DahiliYazmaveSilme, DahiliOkuma::class.java))
        }
        yazBut.setOnClickListener {
            yaz()
        }
        silBut.setOnClickListener {
            sil()
        }
    }

    fun yaz(){
        try {
            val yol = openFileOutput("dosyam.txt", Context.MODE_PRIVATE)
            val yazici = OutputStreamWriter(yol)
            yazici.write(yabanciKelime.text.toString())
            yazici.write(":")
            yazici.write(turkceKelime.text.toString())

            yazici.close() // Yazma isleminden sonra islemi bitirir ki performans artisi olsun.

            yabanciKelime.setText("")
            turkceKelime.setText("")
        }catch (e: Exception){
            e.printStackTrace()
        }
    }

    fun sil(){
        val yol = filesDir
        val dosya = File(yol,"dosyam.txt")

        .delete()
    }
}