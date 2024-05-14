package com.info.standartprogramlamayapilari

import java.util.*

fun main(){

    val girdi = Scanner(System.`in`)

    println("Bir Deger Giriniz")
    var sayac = girdi.nextInt()

    while (sayac > 0) {
        println("$sayac. Veri")
        sayac-=1
    }


}

