package com.info.androidcalismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sayfa2.*
import kotlinx.android.synthetic.main.activity_sayfa4.*

class Sayfa4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa4)

        buttonBoyleGetirirler.setOnClickListener {
            textViewNasilGeldinAma.text = "Kopek Gibi Gelirsin Boyle"
        }
    }

    override fun onBackPressed() {
        val yeniIntent = Intent(this@Sayfa4, MainActivity::class.java)
        startActivity(yeniIntent)
    }
}