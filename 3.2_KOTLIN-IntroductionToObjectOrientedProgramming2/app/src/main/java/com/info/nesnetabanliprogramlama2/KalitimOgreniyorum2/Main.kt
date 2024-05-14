package com.info.nesnetabanliprogramlama2.KalitimOgreniyorum2

fun main(){

    val saray = Saray(10,4)
    val villa = Villa(20,true)

    println("${saray.pencereSayisi}")
    println("${saray.kuleSayisi}")

    println("\n")

    println("${villa.garajVarmi}")
    println("${villa.pencereSayisi}")

    println("\n")

    val ev = Ev(10)
    println("${ev.pencereSayisi}")



}