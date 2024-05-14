package com.info.nesnetabanliprogramlama

import com.info.nesnetabanliprogramlama.B_ArabaAnalojisi.Araba

fun main(){

    val bmw = Araba("kirmizi", 10, false)
    bmw.bilgiAl()

    // Verileri degistirme
    bmw.renk="mavi"
    bmw.calisiyorMu=true
    bmw.hiz=90

    bmw.bilgiAl(); println("\n")

    bmw.calistir()
    bmw.bilgiAl()

    bmw.durdur()
    bmw.bilgiAl(); println("\n")

    bmw.hizlan(100)
    bmw.bilgiAl()
    bmw.yavasla(80)
    bmw.bilgiAl(); println("\n")


    val sahin = Araba("sari", 50, true)
    sahin.bilgiAl(); println("\n")

    sahin.calistir()
    sahin.bilgiAl()

}