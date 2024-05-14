package com.info.sayfalararasiveritasima.BackStackKontrolu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.info.sayfalararasiveritasima.R
import kotlinx.android.synthetic.main.activity_b_sayfasi.*
import kotlinx.android.synthetic.main.activity_c_sayfasi.*

class CSayfasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c_sayfasi)

        goToDButton.setOnClickListener {
            startActivity(Intent(this@CSayfasi, DSayfasi::class.java))
        }
    }
}