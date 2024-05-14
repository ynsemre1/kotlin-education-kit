package com.info.nesnetabanliprogramlama.C_OtobusAnalojisi

fun main(){

    val kamilKoc=Otobus(50,"Bursa","Ankara", 10)
    println(kamilKoc.kapasite)
    println(kamilKoc.neredenGeliyor)
    println(kamilKoc.nereyeGidiyor)
    println(kamilKoc.mevcutYolcu); println("\n")

    kamilKoc.kapasite=100
    kamilKoc.neredenGeliyor="Izmir"
    kamilKoc.nereyeGidiyor="Istanbul"
    kamilKoc.mevcutYolcu=30
    kamilKoc.yolcuAl(50) // +50 yolcu aliyor. Class kodundan kontrol edilebilir.
    kamilKoc.yolcuIndir(40) // -40 yolcu indirir. Class kodundan kontrol edilebilir.
    kamilKoc.bilgiAl()


    val otobusFirmasi=Otobus(60,"Ankara","Bursa",5)
    otobusFirmasi.bilgiAl()


}