package com.info.sayfalararasiveritasima.BackStackKontrolu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.info.sayfalararasiveritasima.R

class DSayfasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d_sayfasi)
    }

    override fun onBackPressed() {
        val intent = Intent(this@DSayfasi, BSayfasi::class.java)
        //Geri Tusunda ki BackPressleri silme yani B ve D sayfasi arasinda ki kisir donguyu kaldirma.
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)

        startActivity(intent)
    }
}