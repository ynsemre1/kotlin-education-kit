package com.info.sayfalararasiveritasima.finishMetodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.info.sayfalararasiveritasima.R
import kotlinx.android.synthetic.main.activity_oyun_ekrani.*
import java.time.Instant

class OyunEkrani : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oyun_ekrani)

        bitirButton.setOnClickListener {
            val intent = Intent(this@OyunEkrani, SonucEkrani::class.java)
            finish() // 
            startActivity(intent)
        }
    }
}