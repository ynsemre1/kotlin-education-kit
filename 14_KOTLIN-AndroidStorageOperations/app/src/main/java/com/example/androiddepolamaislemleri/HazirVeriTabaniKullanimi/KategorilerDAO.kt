package com.example.androiddepolamaislemleri.HazirVeriTabaniKullanimi

class KategorilerDAO {

    fun tumKategoriler(vt: VeriTabaniYardimcisi): ArrayList<KategorilerTablo> {

        val kategoriListe = ArrayList<KategorilerTablo>()
        val yazmaYetkisi = vt.writableDatabase
        val cursor = yazmaYetkisi.rawQuery("SELECT * FROM kategoriler", null)

        while (cursor.moveToNext()) {

            val kategori = KategorilerTablo(
                cursor.getInt(cursor.getColumnIndex("kategori_id")),
                cursor.getString(cursor.getColumnIndex("kategori_ad"))
            )

            kategoriListe.add(kategori)
        }

        return kategoriListe

    }
}