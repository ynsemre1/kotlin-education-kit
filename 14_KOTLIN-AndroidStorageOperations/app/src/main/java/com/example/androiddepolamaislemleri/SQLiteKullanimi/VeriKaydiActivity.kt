package com.example.androiddepolamaislemleri.SQLiteKullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.androiddepolamaislemleri.R

class VeriKaydiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_veri_kaydi)

        val vt = VeriTabaniSinifiOlusturma(this)

        val dao = KisilerDataAccesObject()

        //dao.kisiEkle(vt,"Ahmet","99999999",18,1.69)
        //dao.kisiEkle(vt,"Yunus","99999999",20,1.70)
        //dao.kisiEkle(vt,"Nisa","99999999",21,1.66)
        //dao.kisiEkle(vt,"Yagmur","19191919",19,1.55)

        //dao.kisiGuncelle(vt,4,"Yeni Yagmur", "20202020",20,1.33)

        //dao.kisiSil(vt,3)

        //val kisiListe = dao.kisiArama(vt,"a")

        //val kisiListe = dao.rastgeleVeri(vt)

        //val sonuc = dao.kayitKontrol(vt,"Ahmet")
        //Log.e("KayitKontrol",sonuc.toString())

        /*val kisi = dao.kisiGetir(vt,3)
        if (kisi != null){
            Log.e("KisiNo4",kisi.kisi_no.toString())
            Log.e("KisiAd4",kisi.kisi_ad)
            Log.e("KisiTel4",kisi.kisi_tel)
            Log.e("KisiYas4",kisi.kisi_yas.toString())
            Log.e("KisiBoy4",kisi.kisi_boy.toString())
        }*/

        val kisiListe = KisilerDataAccesObject().kisiOkuma(vt)

        for (k in  kisiListe){
            Log.e("KisiNo",k.kisi_no.toString())
            Log.e("KisiAd",k.kisi_ad)
            Log.e("KisiTel",k.kisi_tel)
            Log.e("KisiYas",k.kisi_yas.toString())
            Log.e("KisiBoy",k.kisi_boy.toString())
        }
    }
}