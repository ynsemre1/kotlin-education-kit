package com.info.standartprogramlamayapilari

import java.util.*

fun main(){

    val girdi = Scanner(System.`in`)
    println("Yapamak istediginiz islemi secin...\nToplama(1) Cikartma(2) Carpma(3) Bolme(4)")
    val tercih = girdi.nextInt()

    if (tercih>4){
        println("Deger Gecersiz")
    }else {
        println("Birinci sayiyi gir..")
        val sayi1 = girdi.nextInt()
        println("Ikinci sayiyi gir..")
        val sayi2 = girdi.nextInt()

        if (tercih == 1) {
            println("Toplama: ${sayi1 + sayi2}")
        } else if (tercih == 2) {
            println("Cikartma: ${sayi1 - sayi2}")
        } else if (tercih == 3) {
            println("Carpma: ${sayi1 * sayi2}")
        } else if (tercih == 4) {
            println("Bolme: ${sayi1 / sayi2}")
        }
    }
}