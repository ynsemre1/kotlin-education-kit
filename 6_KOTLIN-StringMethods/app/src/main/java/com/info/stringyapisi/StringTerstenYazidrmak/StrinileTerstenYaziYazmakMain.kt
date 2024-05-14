package com.info.stringyapisi.StringTerstenYazidrmak

import java.util.*

fun main(){

    val girdi = Scanner(System.`in`)
    println("KelimeGiriniz...")
    val str = girdi.next()

    for (harfler in str.length-1 downTo 0){
        print(str[harfler])
    }

}