package com.info.nesnetabanliprogramlama2.CompositionOgreniyorum

fun main(){

    var kisiIlce = Ilce("Ankara","Kecioren")
    var kisiBilgi = Kisiler1("Yunus",19, kisiIlce)

    println("Kisi Adi: ${kisiBilgi.ad}")
    println("Kisi Yasi: ${kisiBilgi.yas}")
    println("Kisi Il: ${kisiBilgi.adres.il}")
    println("Kisi Ilce: ${kisiBilgi.adres.ilce}")
    


}