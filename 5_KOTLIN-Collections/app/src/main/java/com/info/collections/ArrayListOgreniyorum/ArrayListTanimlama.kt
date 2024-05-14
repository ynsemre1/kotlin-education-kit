package com.info.collections.ArrayListOgreniyorum

fun main(){

    val liste = ArrayList<String>()
    val liste2 : ArrayList<Int> = ArrayList<Int>() //Altarnatif

    val meyveler = ArrayList<String>()

    meyveler.add("Cilek") //Veri Ekleme
    meyveler.add("Muz") //Veri Ekleme
    meyveler.add("Elma") //Veri Ekleme
    meyveler.add("Kivi") //Veri Ekleme

    var veriAlma=meyveler.get(3) // Index numarasi ile veri alma
    println(veriAlma) //Kivi

    println(meyveler[2]) // Index numarasi ile veri alma 2. yontem (Elma)

    println(meyveler.toString()) //Butun Listeyi Yazdirir.

    meyveler.add("Mandalina") // Sonradan EKLEME islemi de yapilabiliyor.

    meyveler[2] = "Ananas" // Bir veri uzerine baska bir veri yazma. [Elma Yerine Ananas Yazdik]
    println(meyveler.toString())

    meyveler.add(3,"Portakal") // Sira aralarina veri ekleme. [3. indekse Portakal yazdirdik. 3. indeksdeki veriyi bir saga kaydirdik.]
    println(meyveler.toString())

    println(meyveler.isEmpty()) // Meyveler Listesi Bos Mu? // Cevap : false

    println(meyveler.count()) // Meyveler Listesi Kac Elemanli
    println(meyveler.size) // Meyveler Listesi Kac Elemanli Altarnatif

    println(meyveler.toString()) // Meyveler Listesini Yazdirir
    println(meyveler.first()) // Meyveler listesinin ilk verisini yazdirir.
    println(meyveler.last()) // Meyveler listesinin son verisini yazdirir.

    println(meyveler.max()) // Meyveler Listesini Harf veya Sayi olarak siralayip En buyuk Sayiyi veya En son Gelen harfin verisi yazdirir.
    println(meyveler.min()) // Meyveler Listesini Harf veya Sayi olarak siralayip En kucuk Sayiyi veya En basta Gelen harfin verisini yazdirir.

    println(meyveler.contains("Muz")) // Meyveler Listesinde Muz diye bir veri var mi kontrol eder. // true

    meyveler.sort() // Harf Sirasine gore veya Sayi sirasina gore buyukten kucuge siralar
    println(meyveler.toString())

    meyveler.reverse() // Meyveler listesini tersine cevirir.
    println(meyveler.toString())

    meyveler.removeAt(3) // 3. Indexdeki Veriyi siler.
    meyveler.remove("Cilek") // Cilek verisini siler.

    meyveler.clear() // Listede ki verileri komple siler.
    println(meyveler.toString())



}