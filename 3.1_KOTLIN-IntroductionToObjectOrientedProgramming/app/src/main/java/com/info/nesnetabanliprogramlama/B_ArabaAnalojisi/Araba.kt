package com.info.nesnetabanliprogramlama.B_ArabaAnalojisi

class Araba(var renk:String, var hiz:Int, var calisiyorMu:Boolean) {

    fun calistir(){
        calisiyorMu=true
        hiz=1
    }
    fun durdur(){
        calisiyorMu=false
        hiz=0
    }

    fun hizlan(kacKm:Int){
        hiz = hiz+kacKm
    }
    fun yavasla(kacKm:Int){
        hiz = hiz-kacKm
    }

    fun bilgiAl(){
        println("Renk: $renk")
        println("Hiziniz: $hiz")
        println("Calisiyor mu?: $calisiyorMu")
    }

}


