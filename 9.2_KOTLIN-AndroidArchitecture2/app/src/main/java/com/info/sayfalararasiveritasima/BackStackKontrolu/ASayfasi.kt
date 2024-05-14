package com.info.sayfalararasiveritasima.BackStackKontrolu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.info.sayfalararasiveritasima.R
import kotlinx.android.synthetic.main.activity_a_sayfasi.*

class ASayfasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_sayfasi)

        goToBButton.setOnClickListener {
            val bIntent = Intent(this@ASayfasi, BSayfasi::class.java)
            startActivity(bIntent)
        }
    }
}