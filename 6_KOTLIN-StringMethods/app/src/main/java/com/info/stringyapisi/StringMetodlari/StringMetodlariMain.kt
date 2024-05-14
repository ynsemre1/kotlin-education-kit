package com.info.stringyapisi.StringMetodlari

fun main(){

    val str1 = "Merhaba" //M-0,e-1,r-2 ... Indeks numarasina sahip
    println(str1.subSequence(0,3)) //Ifadenin belirli bir kismini yazdirma. Cevap:Mer

    val str2= "Yunus"
    println(str2.contains("unus"))

    val str3= "Emre"
    println(str3.toUpperCase())
    println(str3.toLowerCase())

    val str4 = "Merhaba Nasilsin"
    val dizi = str4.split(" ")
    for (deger in dizi){
        println(deger)
    }

    val str5 = " Yunus Emre Akyol "
    println(str5.trim())


}