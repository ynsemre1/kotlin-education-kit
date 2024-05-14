package com.example.androiddepolamaislemleri.HazirVeriTabaniKullanimi

class FilmlerDAO {

    fun tumFilmlerByKategoriID(
        vt: VeriTabaniYardimcisi,
        kategori_id: Int
    ): ArrayList<FilmlerTablo> {

        val filmlerListe = ArrayList<FilmlerTablo>()
        val yazmaYetkisi = vt.writableDatabase
        val cursor = yazmaYetkisi.rawQuery(
            "SELECT * FROM filmler, kategoriler,yonetmenler WHERE filmler.kategori_id=kategoriler.kategori_id AND filmler.yonetmen_id = yonetmenler.yonetmen_id AND filmler.kategori_id = $kategori_id",
            null
        )

        while (cursor.moveToNext()) {

            val kategori = KategorilerTablo(
                cursor.getInt(cursor.getColumnIndex("kategori_id")),
                cursor.getString(cursor.getColumnIndex("kategori_ad"))
            )

            val yonetmen = YonetmenlerTablo(
                cursor.getInt(cursor.getColumnIndex("yonetmen_id")),
                cursor.getString(cursor.getColumnIndex("yonetmen_ad"))
            )


            val film = FilmlerTablo(
                cursor.getInt(cursor.getColumnIndex("film_id")),
                cursor.getString(cursor.getColumnIndex("film_ad")),
                cursor.getInt(cursor.getColumnIndex("film_yil")),
                cursor.getString(cursor.getColumnIndex("film_resim")),kategori,yonetmen)

            filmlerListe.add(film)
        }

        return filmlerListe

    }
}