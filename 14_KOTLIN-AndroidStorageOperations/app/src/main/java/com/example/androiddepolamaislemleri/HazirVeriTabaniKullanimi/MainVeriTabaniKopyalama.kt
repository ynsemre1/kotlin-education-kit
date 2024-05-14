package com.example.androiddepolamaislemleri.HazirVeriTabaniKullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.androiddepolamaislemleri.R
import com.info.sqlitekullanimihazirveritabani.DatabaseCopyHelper
import java.lang.Exception
import java.lang.reflect.Executable

class MainVeriTabaniKopyalama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_veri_tabani_kopyalama2)

        veriTabaniKopyala()

        val vt = VeriTabaniYardimcisi(this)
        val liste = FilmlerDAO().tumFilmlerByKategoriID(vt,2)
        //val liste = KategorilerDAO().tumKategoriler(vt)

        for (i in liste){
            Log.e("Film Id", i.film_id.toString())
            Log.e("Film AD", i.film_ad)
            Log.e("Film Yil", (i.film_yil).toString())
            Log.e("Film Resim", i.film_resim)
            Log.e("Film Kategori ID", i.kategori.kategori_id.toString())
            Log.e("Film Kategori AD", i.kategori.kategori_ad)
            Log.e("Film Yonetmen ID", i.yonetmen.yonetmen_id.toString())
            Log.e("Film Yonetmen AD", i.yonetmen.yonetmen_ad)
        }
    }

    fun veriTabaniKopyala(){
        val db = DatabaseCopyHelper(this)

        try {
            db.createDataBase()
        }catch (e:Exception){
            e.printStackTrace()
        }

        try {
            db.openDataBase()
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
}