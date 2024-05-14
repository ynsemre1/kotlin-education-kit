package com.info.sayfalararasiveritasima.SayfalarArasiVeriTasimaOrnek1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.info.sayfalararasiveritasima.R
import kotlinx.android.synthetic.main.activity_yazi_sayfasi.*

class YaziSayfasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yazi_sayfasi)

        veriIsleyenButton.setOnClickListener {
            val gecisIntent2 = Intent(this@YaziSayfasi, YaziSayfasiVerininIslenmesi::class.java)
            val alinanVeri = veriIsliycekYazi.text.toString() //GirilenVeri bu veriyi .toSring komutu ile editable yapiyoruz.
            gecisIntent2.putExtra("islencekVeri", alinanVeri)
            startActivity(gecisIntent2)
        }
    }
}