package com.info.standartprogramlamayapilari

import java.util.*

fun main(){

    val girdi = Scanner(System.`in`)

    println("Isim Giriniz")
    val isim = girdi.next()

    println("Tekrarlama Sayisini Giriniz")
    val sayac = girdi.nextInt()

    for (a in 1..sayac){ // "0 until sayac" da olur  "1..sayac" da olur
        println("$a. $isim")
    }



}