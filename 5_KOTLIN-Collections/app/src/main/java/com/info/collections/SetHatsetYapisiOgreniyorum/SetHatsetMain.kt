package com.info.collections.SetHatsetYapisiOgreniyorum

fun main(){

    val setlist = setOf("Cilek","Muz","Elma","Sogan") //Icindeki verileri karisik yazdirir.
    println(setlist.toString())
    // setlist.add("Salam") icine daha sonradan veri yuklenemez.

    val iller = mutableSetOf("Ankara","Zonguldak","Kayseri","Trabzon")
    iller.add("Mus") ////Mutable degistirilebilir demek. O yuzden sonradan icine veride eklenebilir.
    iller.add("Ankara") //Ayni verileri tekrar yazmaz.
    println(iller.toString())

    val sayilar = HashSet<Int>() //Verileri karisik yazdirir.
    sayilar.add(1)
    sayilar.add(5)
    sayilar.add(3)
    sayilar.add(15)
    sayilar.add(10)
    sayilar.add(100)
    sayilar.add(10)
    println(sayilar.toString())
    println(sayilar.elementAt(1)) //IndeksNumarasi ile veri alma.



}