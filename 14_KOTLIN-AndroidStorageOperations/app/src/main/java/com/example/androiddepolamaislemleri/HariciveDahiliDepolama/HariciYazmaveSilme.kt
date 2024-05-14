package com.example.androiddepolamaislemleri.HariciveDahiliDepolama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.androiddepolamaislemleri.R
import java.io.*
import java.lang.Exception

class HariciYazmaveSilme : AppCompatActivity() {

    lateinit var yabanciKelime:EditText
    lateinit var turkceKelime:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_harici_yazmave_silme)

        yabanciKelime=findViewById(R.id.ykelime)
        turkceKelime=findViewById(R.id.tkelime)

        val yazBut:Button=findViewById(R.id.yazButton)
        val silBut:Button=findViewById(R.id.silButton)
        val sozlukBut:Button=findViewById(R.id.sozlukButton)

        sozlukBut.setOnClickListener {
            startActivity(Intent(this@HariciYazmaveSilme, HariciOkuma::class.java))
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
            val yol = applicationContext.getExternalFilesDir(null)?.absolutePath
            val sozluk = File(yol,"sozluk.txt")

            if (!sozluk.exists()){
                sozluk.createNewFile()
            }

            val fw = FileWriter(sozluk,true)
            val yazici = BufferedWriter(fw)
            yazici.newLine()

            yazici.write(yabanciKelime.text.toString())
            yazici.write(":")
            yazici.write(turkceKelime.text.toString())

            yazici.flush() // Yazma isleminde sorun cikacak gibi ise islemi hizli bitirmesini saglar.
            yazici.close() // Yazma isleminden sonra islemi bitirir ki performans artisi olsun.
            fw.close() // Yazma isleminden sonra islemi bitirir ki performans artisi olsun.

            yabanciKelime.setText("")
            turkceKelime.setText("")

        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    fun sil(){
        val yol = applicationContext.getExternalFilesDir(null)?.absolutePath
        val sozluk = File(yol,"sozluk.txt")

        sozluk.delete()
    }
}