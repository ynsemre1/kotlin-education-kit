package com.info.standartprogramlamayapilari

fun main(){

    for (i in 1..5){

        if (i==3){
            break  //Islemi Komple Bitiriyor
        }

        println("Dongu1: $i")
    } ; println("\n")

    for (i in 1..5){

        if (i==3){
            continue  // Sadece 3 sayisini pas geciyor.
        }

        println("Dongu2: $i")
    }

}