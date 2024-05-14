package com.info.collections.MapHashMap

fun main(){

    val sayilar = mapOf<Int,String>(1 to "Bir", 2 to "Iki") // <Int,String> Kismi olmasada calisabilir.
    println(sayilar.toString()) //{1=Bir, 2=Iki}

    val oranlar = mutableMapOf<Double,String>(1.5 to "Oran1", 2.4 to "Oran2") // <Double,String> Kismi olmasada calisabilir.
    println(oranlar.toString()) // {1.5=Oran1, 2.4=Oran2}

    val iller = HashMap<Int,String>()
    iller.put(16,"Bursa") //VeriTanimlamasi
    iller.put(35,"Ankara") //VeriTanimlamasi
    iller.put(34,"Istanbul") //VeriTanimlamasi
    println(iller.toString())

    iller.put(16,"YeniBursa") //VeriUzerine yeni veri yazilabilir.
    println(iller.toString())

    println(iller.get(34))

    println(iller.containsKey(16)) //Veriler Icerisinde 16 var mi? Sonuc = true
    println(iller.containsValue("Ankara"))//Veriler Icerisinde Ankara var mi? Sonuc = true

    for ((anahtar,deger) in iller){
        println("$anahtar:$deger")
    }





}