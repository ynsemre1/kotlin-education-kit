package com.info.standartprogramlamayapilari

import java.util.*

fun main(){

    val girdi = Scanner(System.`in`)

    println("Bir Deger Giriniz.")
    val gun = girdi.nextInt()

    when( gun ){
        1 -> println("Pazartesi")
        2 -> println("Sali")
        3 -> println("Carsamba")
        4 -> println("Persembe")
        5 -> println("Cuma")
        6 -> println("Cumartesi")
        7 -> println("Pazar")
        else -> println("Boyle bir gun yok")

    }

}