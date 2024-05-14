package com.info.collections.ArrayListOgreniyorum

fun main(){

    val meyveListesi = ArrayList<String>()

    meyveListesi.add("Elma")
    meyveListesi.add("Muz")
    meyveListesi.add("Cilek")
    meyveListesi.add("Karpuz")
    meyveListesi.add("Sosis")
    meyveListesi.add("Kiraz")

    for (veri in meyveListesi){  // For Donusu ile Yazdirma
        println("Bu gunki meyveniz: $veri")
    }

    println("\n")

    for ((veriIndeksi,veri2) in meyveListesi.withIndex()){ // Index ile birlikte yazdirma.
        var veriIndeksi = 1
        println("$veriIndeksi. Gunki meyveniz: $veri2")
    }


}