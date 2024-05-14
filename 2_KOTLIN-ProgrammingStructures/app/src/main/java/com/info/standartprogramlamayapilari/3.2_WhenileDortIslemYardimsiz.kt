package com.info.standartprogramlamayapilari

import java.util.*

fun main(){

    val girdi = Scanner(System.`in`)

    println("Toplama(1)\nCikartma(2)\nCarpma(3)\nBolme(4)")
    val islem = girdi.nextInt()

    if (islem>4){
        println("Boyle bir deger mevcut degil.")
    }else{
        println("Ilk sayiyi giriniz.")
        val sayi1 = girdi.nextInt()
        println("Ikinci sayiyi giriniz")
        val sayi2 = girdi.nextInt()

        when(islem){
        1 -> println("Toplama isleminizin sonucu ${sayi1+sayi2}")
        2 -> println("Cikartma isleminizin sonucu ${sayi1-sayi2}")
        3 -> println("Carpma isleminizin sonucu ${sayi1*sayi2}")
        4 -> println("Bolme isleminizin sonucu ${sayi1/sayi2}")
        else -> println("Bu deger mevcut degil.") }
    }
}