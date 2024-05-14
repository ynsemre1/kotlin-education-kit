package com.info.collections.ArrayListIcerikDegistirme

fun main(){

    val sayilar = ArrayList<Int>() // [1,2,3,4,5] elemanlarini [2,4,6,8,10] a ceviricez.
    sayilar.add(1)
    sayilar.add(2)
    sayilar.add(3)
    sayilar.add(4)
    sayilar.add(5)

    for ((indeks,veri) in sayilar.withIndex()){
        val sonuc = veri * 2
        sayilar[indeks] = sonuc //Indeks icindeki veriyi 2 ile carp ve o indekse yaz.
    }

    for (veri in sayilar){
        println(veri)
    }

}