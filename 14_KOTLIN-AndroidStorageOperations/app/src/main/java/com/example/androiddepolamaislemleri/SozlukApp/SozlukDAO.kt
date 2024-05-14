package com.example.androiddepolamaislemleri.SozlukApp

import android.content.ContentValues

class SozlukDAO(
    val vt: VeriTabaniSinifi
) {
    fun veriEkle(
        vta: VeriTabaniSinifi,
        sozcuk_Turkce: String,
        sozcuk_Ingilizce: String
    ) {
        val db = vta.writableDatabase
        val values = ContentValues()

        values.put("sozcuk_Turkce", sozcuk_Turkce)
        values.put("sozcuk_Ingilizce", sozcuk_Ingilizce)

        db.insertOrThrow("sozluk", null, values)
        db.close()
    }

    fun veriGetirme(): ArrayList<Sozluk> {

        val sozcuklerArrayList = ArrayList<Sozluk>()

        val db = vt.writableDatabase
        val cursor = db.rawQuery("SELECT * FROM sozluk", null)

        while (cursor.moveToNext()) {
            val kisi = Sozluk(
                cursor.getInt(cursor.getColumnIndex("sozcuk_No")),
                cursor.getString(cursor.getColumnIndex("sozcuk_Turkce")),
                cursor.getString(cursor.getColumnIndex("sozcuk_Ingilizce")),
            )

            sozcuklerArrayList.add(kisi)
        }
        return sozcuklerArrayList
    }

    fun veriSil(sozcuk_Turkce:String) {
        val dbx = vt.writableDatabase
        dbx.delete("sozluk","sozcuk_Turkce=?", arrayOf(sozcuk_Turkce))
        dbx.close()
    }

}