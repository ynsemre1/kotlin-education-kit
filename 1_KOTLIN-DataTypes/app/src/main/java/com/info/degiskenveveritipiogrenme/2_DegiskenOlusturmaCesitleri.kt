package com.info.degiskenveveritipiogrenme

fun main() {

    //Ornek 1

    var sayi = 10

    //Ornek 2

    var fiyat = 12.99

    println(fiyat)

    fiyat = 10.99

    println(fiyat)

    //Ornek 3

    var s1 = 80
    var s2 = 70

    var toplam = s1 + 50
    var toplam2 = s1 + s2

    println(toplam); println(toplam2)

    //Ornek 4 ( Type-Safety Tur Korumasi)

    var sonuc = 100

    sonuc = 50 // Bi tur aktarabilirsin bunu (int) hali iken double veya float haline ceviremezsin.
    
}