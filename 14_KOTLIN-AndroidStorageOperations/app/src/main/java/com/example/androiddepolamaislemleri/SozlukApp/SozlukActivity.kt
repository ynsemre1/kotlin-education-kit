package com.example.androiddepolamaislemleri.SozlukApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.androiddepolamaislemleri.R

class SozlukActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sozluk)

        val vt = VeriTabaniSinifi(this)

        val yazBut:Button=findViewById(R.id.yaz)
        val silBut:Button=findViewById(R.id.sil)
        val sozlukBut:Button=findViewById(R.id.sozluk)

        val turkceText:EditText=findViewById(R.id.turkceText)
        val ingilizceText:EditText=findViewById(R.id.ingilizceText)

        val dao = SozlukDAO(vt)

        val sozcuk1 = turkceText.text
        val sozcuk2 = ingilizceText.text

        sozlukBut.setOnClickListener {
            startActivity(Intent(this@SozlukActivity, SozlukVeriTabani::class.java))
        }

        yazBut.setOnClickListener {
            dao.veriEkle(vt,sozcuk1.toString(),sozcuk2.toString())
        }

        silBut.setOnClickListener {
            dao.veriSil(sozcuk1.toString())
        }


    }
}