package com.info.sayfalararasiveritasima.SayfalarArasiVeriTasimaOrnek1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.info.sayfalararasiveritasima.R
import kotlinx.android.synthetic.main.activity_yazi_sayfasi_verinin_islenmesi.*

class YaziSayfasiVerininIslenmesi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yazi_sayfasi_verinin_islenmesi)

        val gelenMesaj = intent.getStringExtra("islencekVeri")
        verininIslendigiText.text = gelenMesaj
    }
}