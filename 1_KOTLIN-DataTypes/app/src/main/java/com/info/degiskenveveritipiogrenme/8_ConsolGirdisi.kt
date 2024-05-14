package com.info.degiskenveveritipiogrenme

import java.util.*

fun main(){

    println("Adinizi giriniz")

    val girdi = Scanner(System.`in`)

    val ad = girdi.next() // String olarak girdi tanimliyor veya soruyor.

    println("Yasinizi Giriniz")

    val girdi2 = Scanner(System.`in`)

    val yas = girdi.nextInt() // Int olarak girdi tanimliyor veya soruyor.

    println("Isminiz: $ad")
    println("Yasiniz: $yas")

}