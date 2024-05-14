package com.info.standartprogramlamayapilari

import kotlin.math.*
import kotlin.random.Random

fun main(){

    //Bazi Rastgele Komutlar

    val rastgeleSayi = Random.nextInt(0,10) // 0 ile 9 arasinda rastgele bir sayi yazdirir.

    val c = ceil(6.5) // Girilen degeri yukari yuvarlar. Sonuc = 7
    val f = floor(6.5) // Girilen degeri assagi yuvarlar. Sonuc = 6

    val s = sqrt(4.0) // Girilen degerin karekokunu alir. Sonuc = 2

    val a = abs(-10) // Girilen degerin mutlak degerini alir. Sonuc = 10

    val max = max(100,200) // Girilen iki degerin maksimum degerini yazdirir. Sonuc = 200
    val min = min(100,200) // Girilen iki degerin minimum degerini yazdirir. Sonuc = 100

    val p = 2.0.pow(3.0) // Ustlu sayi kodu girilen 1. degerin 2. deger kadar ustunu alir. Ex: 2(Uzeri3) = 8

}