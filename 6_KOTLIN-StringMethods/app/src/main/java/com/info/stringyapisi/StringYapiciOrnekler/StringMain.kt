package com.info.stringyapisi.StringYapiciOrnekler

fun main(){

    var str1 = String() //Bu Sekilde String Nesnesi Olusturulabilir.
    var str2 = "" //Bu Sekilde String Nesnesi Olusturulabilir.

    val str3 = """ 
        Merhaba
        Nasilsin
    """.trimIndent() //Bu sekilde alt satira gectigimiz yazilari yazdirabiliriz.
    println(str3)

    val str4 = ""
    val str5 = String()

    if (str4.isEmpty()){ //STR4 Bos Oldugu Icin Cevap Bu Nesne Bos
        println("BuNesneBos")
    }else{
        println("BuNesneDolu")
    }

    if (str5.isEmpty()){ //STR5 Bos Oldugu Icin Cevap Bu Nesne Bos
        println("BuNesneBos")
    }else{
        println("BuNesneDolu")
    }

    val str6 = "Merhaba"
    val str7 = " Dunya"
    println(str6+str7) //Bu sekilde iki string nesneyi birlestirebiliyoruz.

    val str8 = "BurdaKacHarfVar"
    println("$str8 boyutu: ${str8.length}") // length komutu kac harfden oldugunu yazdirir. (Bosluklar dahil)

    val str9 = "Merhaba"
    val str10 = "Selam"
    if (str9 == str10){
        println("Bu iki ifade birbirine esit")
    }else{
        println("Bu iki ifade birbirine esit degil.")
    }

    val str11 = "BuHarfleriTekerTeker Yazdir" //For dongusu ile yazdirabiliriz. (Bosluklar Dahil)
    for (harfler in str11){
        println(harfler)
    }






}