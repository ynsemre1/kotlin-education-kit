package com.example.androiddepolamaislemleri.SozlukApp

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.set
import com.example.androiddepolamaislemleri.R
import org.w3c.dom.Text

class SozlukVeriTabani : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sozluk_veri_tabani)

        val text: TextView = findViewById(R.id.sozlukler)
        val vt = VeriTabaniSinifi(this)

        val dao = SozlukDAO(vt)

        val sozcuklerList = dao.veriGetirme()

        val text2 = StringBuilder()

        var sayac = 0

        for (i in sozcuklerList){
            sayac++
            text2.append(sayac.toString())
            text2.append(i.sozcuk_Turkce+" : ")
            text2.append(i.sozcuk_Ingilizce+"\n")
        }

        text.text = text2.toString()







    }
}


