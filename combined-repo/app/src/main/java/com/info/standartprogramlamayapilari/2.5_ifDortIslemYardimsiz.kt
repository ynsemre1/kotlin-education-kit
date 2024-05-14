package com.info.standartprogramlamayapilari

import java.util.*

fun main(){
    val girdi = Scanner(System.`in`)
    println("Yapamak istediginiz islemi secin...\nToplama(1) Cikartma(2) Carpma(3) Bolme(4)")

    val islem = girdi.nextInt()

    if (islem==1){
        println("Toplanacak Sayi Giriniz")
        val toplanacakSayi1 = girdi.nextInt()
        println("Toplanacak Sayi Giriniz")
        val toplanacakSayi2 = girdi.nextInt()

        val sonuc1 = toplanacakSayi1 + toplanacakSayi2
        println("Toplama isleminizin sonucu $sonuc1")
    }

    if (islem==2){
        println("Sayi giriniz")
        val cikartilacakSayi1 = girdi.nextInt()
        println("Sayi giriniz")
        val cikartilacakSayi2 = girdi.nextInt()

        val sonuc2 = cikartilacakSayi1 - cikartilacakSayi2
        println("Cikartma isleminizin sonucu $sonuc2")
    }

    if (islem==3){
        println("Carpilcak sayi giriniz.")
        val carpilcakSayi1 = girdi.nextInt()
        println("Carpilcak sayi giriniz")
        val carpilcakSayi2 = girdi.nextInt()

        val sonuc3 = carpilcakSayi1 * carpilcakSayi2
        println("Carpma isleminizin sonucu $sonuc3")
    }

    if (islem==4){
        println("Sayi giriniz")
        val boluncekSayi1 = girdi.nextDouble()
        println("Sayi giriniz")
        val boluncekSayi2 = girdi.nextDouble()

        val sonuc4 = boluncekSayi1 / boluncekSayi2
        println("Bolme isleminizin sonucu $sonuc4")
    }

    if (islem>4){
        println("Bu deger tanimsizdir.")
    }else{}


}