package com.info.standartprogramlamayapilari

fun main(){

    val meyveler = arrayOf<String>("Cilek","Muz","Elma","Kivi","Kiraz")

    for (meyve in meyveler){
        println("Sonuc: $meyve")
    }

    // INDEX numarasi ile veri alma

    for ((index,meyve) in meyveler.withIndex()){
        println("Sonuc $index: $meyve")
    }

}