package com.info.standartprogramlamayapilari

fun main(){

    // Tanimlama

    val dizi1 = Array<Int>(5){0} // [0,0,0,0,0]
    val dizi2 = arrayOf(1,10,7)
    val dizi3 = arrayOf<Int>(1,36,9)
    val dizi4 = arrayOf<String>("Cilek","Ahmet","Yunus")
    val dizi5 = arrayOf(3,8,"Elma","Bursa",'a',5.35)


    // Verilere Erisim
    val meyveler = arrayOf<String>("Cilek","Muz","Elma","Kivi","Kiraz")

    val str1 = meyveler[2]
    println(str1)

    val str2 = meyveler.get(3)
    println(str2)

    // Veri Uzerinde Islem Yapma

    meyveler[1] = "Yeni Muz"
    println(meyveler.contentToString())

    meyveler.set(2,"Eski Elma")
    println(meyveler.contentToString())

    // Array Islemleri

    println(meyveler.isEmpty()) // isEmpty=Dizinin ici bos mu hayir 'false' bos degil dolu. // false dolu demek , true bos demek

    println(meyveler.count()) // kac eleman oldugunu yazar

    println(meyveler.first()) // ilk elemani yazdirir

    println(meyveler.last()) // son elemani yazdirir

    println(meyveler.indexOf("Kivi")) // index numarasini yazdirir

    println(meyveler.contains("Muz")) // contains= Bu dizi icerisinde muz var mi? 'False' = Yok .. True = Var

    println(meyveler.max())
    println(meyveler.min())

    println(meyveler.sort()) // Duzenleme yapiyor ama ne hakkinda tam bilmiyorum
    println(meyveler.contentToString())

    println(meyveler.reverse()) // Duzenleme yapiyor usttekinin tam tersine
    println(meyveler.contentToString())




}