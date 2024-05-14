package com.info.standartprogramlamayapilari

import java.util.*

fun main() {

    val girdi = Scanner(System.`in`)

    val dersler = Array<String>(5) { "" }
    val notlar = Array<Int>(5) { 0 }

    for (i in 0 until dersler.count()) {
        println("${i+1}.Dersi Giriniz")
        val dersAdi = girdi.next()
        dersler[i] = dersAdi

        println("${i+1}.Notu Giriniz")
        val dersNotu = girdi.nextInt()
        notlar[i] = dersNotu
    }

    var toplam = 0

    for (i in 0 until dersler.count()){
        println("${dersler[i]}: ${notlar[i]}")

        toplam = toplam+notlar[i]
    }

    val ortalama = toplam / notlar.count()
    println("Ortlamaniz: $ortalama")
    if (ortalama>=50){
        println("Gectiniz")
    }else{
        println("Kaldiniz")
    }

}


