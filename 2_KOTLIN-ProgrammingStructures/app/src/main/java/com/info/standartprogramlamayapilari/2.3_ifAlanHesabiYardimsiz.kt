package com.info.standartprogramlamayapilari

import java.util.*

fun main(){

    println("Ne Hesaplamak Istersiniz.\nDikdortgen (1), Cember (2)")
    var secim = Scanner(System.`in`)
    var secim2 = secim.nextInt()
    val pi = 3.14

    if (secim2 == 1){
        println("Dikdortgen Alan Hesabi Sectiniz (1)\nKisa Kenar Giriniz")
        var kisaKenar = Scanner(System.`in`)
        var kisaKenar2 = secim.nextInt()
        println("Uzun Kenar Giriniz")
        var uzunKenar = Scanner(System.`in`)
        var uzunKenar2 = secim.nextInt()

        var dikdortgenSonuc = uzunKenar2 * uzunKenar2
        println("Sonucunuz $dikdortgenSonuc")
    }else if (secim2 == 2){
        println("Daire Alan Hesabi Sectiniz (2)\nYari Cap Giriniz")
        var yariCap = Scanner(System.`in`)
        var yariCap2 = secim.nextInt()

        var daireSonuc = yariCap2 * pi
        println("Sonucunuz $daireSonuc")
    }else {
        println("Yanlis Secim")
    }


}