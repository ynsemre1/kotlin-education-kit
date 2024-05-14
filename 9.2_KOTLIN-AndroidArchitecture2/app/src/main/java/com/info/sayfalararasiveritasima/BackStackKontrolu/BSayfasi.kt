package com.info.sayfalararasiveritasima.BackStackKontrolu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.info.sayfalararasiveritasima.R
import kotlinx.android.synthetic.main.activity_b_sayfasi.*

class BSayfasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_sayfasi)

        goToCButton.setOnClickListener {
            startActivity(Intent(this@BSayfasi, CSayfasi::class.java))
        }
    }
}