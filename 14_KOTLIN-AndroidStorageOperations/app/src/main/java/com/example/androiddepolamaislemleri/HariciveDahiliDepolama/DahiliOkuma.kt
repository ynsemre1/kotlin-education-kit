package com.example.androiddepolamaislemleri.HariciveDahiliDepolama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.androiddepolamaislemleri.R
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.InputStreamReader
import java.lang.Exception
import java.lang.StringBuilder

class DahiliOkuma : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_harici_okuma)

        val kelime: TextView =findViewById(R.id.kelimeler)

        try {
            val yol = openFileInput("dosyam.txt")
            val dosyam = InputStreamReader(yol)

            val okuyucu = BufferedReader(dosyam)
            val sb = StringBuilder()
            var satir:String?=null

            while ({satir=okuyucu.readLine();satir}() != null){
                sb.append(satir+"\n")
            }
            okuyucu.close()

            kelime.text=sb.toString()
        }catch (e: Exception){
            e.printStackTrace()
        }
    }
}