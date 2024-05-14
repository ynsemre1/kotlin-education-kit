package com.info.nesnetabanliprogramlama2.CompositionPratik

fun main(){

    var kategoriler1 = Kategori(1,"Dram")
    var kategoriler2 = Kategori(2,"Komedi")
    var kategoriler3 = Kategori(3,"Kurgu")

    var yonetmenler1 = Yonetmenler(1,"NuriBilgeCeylan")
    var yonetmenler2 = Yonetmenler(2,"QuentinTarantino")
    var yonetmenler3 = Yonetmenler(3,"2013")

    var filmler1 = Filmler(1,"Django",2013, kategoriler1, yonetmenler2)
    var filmler2 = Filmler(2,"Inception",2006,kategoriler3,yonetmenler3)

    println("FilmID: ${filmler1.filmId}")
    println("FilmAD: ${filmler1.filmAd}")
    println("FilmYIL: ${filmler1.filmYil}")
    println("FilmKategoriID: ${filmler1.filmKategoriId.kategoriAd}")
    println("FilmYonetmeniAd: ${filmler1.filmYonetmen.yonetmenAD}")

}
