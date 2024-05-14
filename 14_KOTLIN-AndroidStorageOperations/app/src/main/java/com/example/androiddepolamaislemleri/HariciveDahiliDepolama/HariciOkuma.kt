package com.example.androiddepolamaislemleri.HariciveDahiliDepolama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.androiddepolamaislemleri.R
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.Exception
import java.lang.StringBuilder

class HariciOkuma : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_harici_okuma)

        val kelime:TextView=findViewById(R.id.kelimeler)

        try {
            val yol = applicationContext.getExternalFilesDir(null)?.absolutePath
            val sozluk = File(yol,"sozluk.txt")

            val fr = FileReader(sozluk)
            val okuyucu = BufferedReader(fr)
            val sb = StringBuilder()
            var satir:String?=null

            while ({satir=okuyucu.readLine();satir}() != null){
                sb.append(satir+"\n")
            }
            okuyucu.close()

            kelime.text=sb.toString()


        }catch (e:Exception){
            e.printStackTrace()
        }
    }
}