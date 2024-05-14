package com.info.standartprogramlamayapilari

import java.util.*

fun main(){

    val girdi = Scanner(System.`in`)

    while (true){
        println("Bir Sayi Giriniz")
        var girilenSayi = girdi.nextInt()

        if (girilenSayi % 2 == 0){
            println("GirilenSayi Cifttir")
        }
        if (girilenSayi % 2 == 1){
            println("GirilenSayi Tektir")
        }

        println("CikisYapmakIcin(1) - Devam Etmek Icin Diger Sayilar")
        val cikis = girdi.nextInt()
        if (cikis==1){
            println("Cikis Yapildi")
            break
        }
    }


}