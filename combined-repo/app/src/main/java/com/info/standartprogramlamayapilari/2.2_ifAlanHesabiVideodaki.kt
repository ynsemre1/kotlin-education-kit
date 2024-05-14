package com.info.standartprogramlamayapilari

import java.util.*

fun main(){

    val girdi = Scanner(System.`in`)
    println("Dikdortgen Alani(1)\nCember Alani(2)")

    val secim = girdi.nextInt()
    println("Seciminiz: $secim")

    if (secim==1){
        println("Kisa Kenar Giriniz")
        val kisaKenar = girdi.nextInt()
        println("Uzun Kenar Giriniz")
        val uzunKenar = girdi.nextInt()

        if (uzunKenar>=kisaKenar) {         // Uzun Kenar Kisa Kenardan Kucuk Olamazi Ben Ekledim.
            val dikdortgenAlani = kisaKenar * uzunKenar
            println("Dikdortgen Alani $dikdortgenAlani")
        }else{
            println("Uzun Kenar Kisa Kenardan Kucuk Olamaz.")
        }
    }

    if (secim==2){
        println("Yari Cap Giriniz")
        val yariCap = girdi.nextInt()

        println("Cember Alani")
        val cemberAlani = 3.14 * yariCap * yariCap
        println("Sonuc $cemberAlani")
    }

    if (secim>2){           // Boyle bir secim mevcut degili ben ekledim.
        println("Boyle Bir Secim Mevcut Degil")
    }else{}
}


