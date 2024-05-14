package com.info.androidcalismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sayfa2.*
import kotlinx.android.synthetic.main.activity_sayfa3.*

class Sayfa3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa3)

        buttonGoToC.setOnClickListener {
            val yeniIntent = Intent(this@Sayfa3,Sayfa4::class.java)
            startActivity(yeniIntent)
        }
    }

    override fun onBackPressed() {
        val yeniIntent = Intent(Intent.ACTION_MAIN)
        yeniIntent.addCategory(Intent.CATEGORY_HOME)
        yeniIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(yeniIntent)
    }
}