package com.example.androiddepolamaislemleri.HazirVeriTabaniKullanimi

data class FilmlerTablo(
    var film_id: Int,
    var film_ad: String,
    var film_yil: Int,
    var film_resim: String,
    var kategori: KategorilerTablo,
    var yonetmen: YonetmenlerTablo
) {
}