package com.info.sayfalararasiveritasima.finishMetodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.info.sayfalararasiveritasima.R
import kotlinx.android.synthetic.main.activity_baslangic_sayfasi.*

class BaslangicSayfasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baslangic_sayfasi)

        oynaButton.setOnClickListener {
            startActivity(Intent(this@BaslangicSayfasi, OyunEkrani::class.java))
        }
    }
}