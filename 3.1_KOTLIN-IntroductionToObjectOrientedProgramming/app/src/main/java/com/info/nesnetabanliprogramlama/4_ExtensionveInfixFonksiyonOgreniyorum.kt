package com.info.nesnetabanliprogramlama

import java.util.*


fun main(){

    fun Int.carpi(sayi:Int):Int{
        return this * sayi
    }
    val sonuc = 5.carpi(10)
    println(sonuc)

    // Yukardaki Fonksiyonu infix hale getiriyorum.

    infix fun Int.carpi2(sayi:Int):Int{
        return this * sayi
    }
    var sonuc2 = 10 carpi2  10
    println(sonuc2)



}