package com.info.androidwidgets.RadioButtonveCheckBox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.info.androidwidgets.MainActivity
import com.info.androidwidgets.R

class RadioButtonVeCheckBoxIkinciSayfa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button_ve_check_box_ikinci_sayfa)

        val javaDurum = intent.getBooleanExtra("javaDurum", true)
        val kotlinDurum = intent.getBooleanExtra("kotlinDurum",true)

        val barcelonaDurum = intent.getBooleanExtra("barcelonaDurum",true)
        val realDurum= intent.getBooleanExtra("realDurum",true)

        val text9:TextView = findViewById(R.id.text9)
        val text10:TextView = findViewById(R.id.text10)
        val text11:TextView = findViewById(R.id.text11)
        val text12:TextView = findViewById(R.id.text12)
        val button7:Button = findViewById(R.id.button7)

        if (kotlinDurum && javaDurum){
            val herikiDurum = "Hem Kotlin Hem Java Biliyorsunuz."
            text10.text = herikiDurum.toString()
        }else if(javaDurum){
            val javaSonuc = "Java Biliyorsunuz."
            text10.text = javaSonuc.toString()
        }else if (kotlinDurum){
            val kotlinSonuc = "Kotlin Biliyorsunuz"
            text10.text = kotlinSonuc.toString()
        }else {
            val herikiDurum2 = "Hic Bir Dil Bilmiyorsunuz."
            text10.text = "Hic Bir Dil Bilmiyorsunuz."
        }

        if (barcelonaDurum == false && realDurum == false){
            val ikiDurumdaYok = "Hic Bir Takim Tutmuyorsunuz."
            text11.text = ikiDurumdaYok.toString()
        }else if (barcelonaDurum){
            val barcelonaSonuc = "Barcelonalisiniz"
            text11.text = barcelonaSonuc.toString()
        }else if (realDurum){
            val realSonuc = "Real Madridlisiniz"
            text11.text = realSonuc.toString()
        }

        button7.setOnClickListener {
            val intent2 = Intent(this@RadioButtonVeCheckBoxIkinciSayfa, MainActivity::class.java)
            intent2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent2)
            finish()
        }

    }
}