package com.info.collections.OrtalamaHesaplamaOrnek

fun main(){
    val sayilar = ArrayList<Int>()

    sayilar.add(30)
    sayilar.add(40)
    sayilar.add(50)
    sayilar.add(70)
    sayilar.add(100)
    sayilar.add(60)

    var toplam = 0
    for (veri in sayilar){
        toplam = toplam + veri
    }

    println("Sonuc: ${toplam / sayilar.size}")
}