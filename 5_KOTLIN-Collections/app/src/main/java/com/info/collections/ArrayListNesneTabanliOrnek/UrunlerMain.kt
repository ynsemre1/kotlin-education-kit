package com.info.collections.ArrayListNesneTabanliOrnek

fun main(){

    val urun1 = Urunler(1,"Telefon", 4555.0)
    val urun2 = Urunler(2, "Televizyon", 6775.0)
    val urun3 = Urunler(3, "Saat", 185.0)

    val satisTablosu = ArrayList<Urunler>()
    satisTablosu.add(urun1)
    satisTablosu.add(urun2)
    satisTablosu.add(urun3)

    for (veri in satisTablosu){
        println("UrunNumarasi: ${veri.urunNo}")
        println("UrunIsmi: ${veri.urunName}")
        println("UrunFiyati: ${veri.urunFiyat}")
        println("*****")
    }

}