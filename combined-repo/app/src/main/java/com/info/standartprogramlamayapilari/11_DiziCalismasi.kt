package com.info.standartprogramlamayapilari

import java.util.*

fun main(){

    val girdi = Scanner(System.`in`)

    val isimler = Array<String>(5){""} // ["","","","",""]

    for (i in 0 until isimler.count()){ //0,1,2,3,4
        println("${i+1}. Isim Giriniz")
        val girilenIsim = girdi.next()
        isimler[i] = girilenIsim
    }

    for ((index,girilenIsim) in isimler.withIndex()){
        println("${index+1}.isim: $girilenIsim")
    }

}