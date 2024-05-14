package com.info.nesnetabanliprogramlama.C_OtobusAnalojisi

class Otobus(var kapasite:Int, var neredenGeliyor:String, var nereyeGidiyor:String, var mevcutYolcu:Int) {
    fun yolcuAl(yolcu:Int){
        mevcutYolcu = mevcutYolcu + yolcu
    }
    fun yolcuIndir(yolcu: Int){
        mevcutYolcu = mevcutYolcu - yolcu
    }

    fun bilgiAl(){
        println("Kapasite: $kapasite")
        println("NeredenGeliyor: $neredenGeliyor")
        println("NereyeGidiyor: $nereyeGidiyor")
        println("YolcuSayisi: $mevcutYolcu")
    }
}