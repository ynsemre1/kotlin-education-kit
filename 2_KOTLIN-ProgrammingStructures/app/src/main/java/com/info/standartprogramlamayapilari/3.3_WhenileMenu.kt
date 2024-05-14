package com.info.standartprogramlamayapilari

import java.util.*

fun main(){

    val girdi = Scanner(System.`in`)

    println("Sil(1)\nEkle(2)")

    val tercih = girdi.nextInt()

    when(tercih){
        1-> println("Veri Silindi")
        2-> println("Veri Eklendi")
        else-> println("Boyle bir deger mevcut degil.")
    }
}