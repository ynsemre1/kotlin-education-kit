package com.info.standartprogramlamayapilari

fun main(){

    // 3 ile 6 arasinda calisan FOR ve WHILE dongusu
        // For Kismi
    for (i in 3..6){
        println("Dongu1: $i")
    }

        // While Kismi
    var sayac = 3

    while (sayac <= 6){ // <=6 veya 7 yazabiliriz
        println("Dongu2: $sayac")
        sayac+=1
    } ; println("\n")


    // 0 ile 8 arasinda 2 ser artan
        // For Kismi
    for (a in 0..8 step 2){
        println("Dongu3: $a")
    }

        // While Kismi
    var sayac2 = 0

    while (sayac2 < 9){
        println("Dongu4: $sayac2")
        sayac2 += 2
    } ; println("\n")


    // 8 den 0a kadar 2 Ser azalsin
        // For Kismi
    for (a in 8 downTo 0 step 2){
        println("Dongu5: $a")
    } ; 

        // While Kismi
    var sayac3 = 8

    while (sayac3 > -1){
        println("Dongu6: $sayac3")
        sayac3-=2
    }






}