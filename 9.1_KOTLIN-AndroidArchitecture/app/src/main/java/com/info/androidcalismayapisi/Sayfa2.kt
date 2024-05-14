package com.info.androidcalismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sayfa2.*

class Sayfa2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa2)

        buttonGoToB.setOnClickListener {
            val yeniIntent = Intent(this@Sayfa2,Sayfa3::class.java)
            startActivity(yeniIntent)
        }
    }
}