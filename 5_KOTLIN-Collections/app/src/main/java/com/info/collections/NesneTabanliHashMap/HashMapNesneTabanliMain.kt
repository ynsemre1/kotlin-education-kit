package com.info.collections.NesneTabanliHashMap

import com.info.collections.SetHatsetYapisiNesneTabanliCalisma.Ogernci3

fun main(){

    val o1 = Ogrenci4(1,"Yunus","10C")
    val o2 = Ogrenci4(2,"Emre","10D")
    val o3 = Ogrenci4(3,"Akyol","12B")
    val o4 = Ogrenci4(4,"Yunus","12B")
    val o5 = Ogrenci4(4,"Yunus","12B")

    val ogrenciler = HashMap<Int,Ogrenci4>()
    ogrenciler.put(o1.ogNo,o1)
    ogrenciler.put(o2.ogNo,o2)
    ogrenciler.put(o3.ogNo,o3)
    ogrenciler.put(o4.ogNo,o4)
    ogrenciler.put(o5.ogNo,o5)

    for ((ogrenciNo,nesne)in ogrenciler){
        println("OgrenciNo:${ogrenciNo}\nOgrenciAd:${nesne.ogAd}\nOgrenciSinif:${nesne.ogSinif}")
        println("##############")
    }


}