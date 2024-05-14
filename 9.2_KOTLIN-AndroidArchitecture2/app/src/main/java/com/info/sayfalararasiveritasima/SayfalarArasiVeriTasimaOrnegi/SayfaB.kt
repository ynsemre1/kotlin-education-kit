package com.info.sayfalararasiveritasima.SayfalarArasiVeriTasimaOrnegi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.info.sayfalararasiveritasima.R

class SayfaB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa_b)

        val gelenMesaj = intent.getStringExtra("mesaj")
        val gelenMesaj2 = intent.getIntExtra("yas",0)
        val gelenMesaj3 = intent.getDoubleExtra("boy",0.0)

        Log.e("MESAJ",gelenMesaj.toString())
        /* gelenMesaj?.let { yunus ->
            Log.e("MESAJ",yunus)
        } */ //ALTERNATIF NULL ISE BIR SEY YAPMIYOR DEGIL ISE LOGLARA YUNUS YAZDIRIR. GENELDE BUNLA KONTROL EDILIR.
        // Log.e("MESAJ","" + gelenMesaj) //ALTERNATIF2
        Log.e("YAS",gelenMesaj2.toString())
        Log.e("BOY",gelenMesaj3.toString()) 

        val gelenKisi = intent.getSerializableExtra("nesneTabanli") as Kisiler

        Log.e("Kisi TCNO", (gelenKisi.tcNo).toString())
        Log.e("Kisi Isim", gelenKisi.isim)
        Log.e("Kisi Boy", (gelenKisi.boy).toString())
    }
}