package com.info.collections.ArrayListSiralamaOgreniyorum

fun main(){

    val ogrenci1 = OgerncilerClass(1, "Yunus")
    val ogrenci2 = OgerncilerClass(2,"Mustafa")
    val ogrenci3 = OgerncilerClass(3,"Baran")
    val ogrenci4 = OgerncilerClass(4,"Ahmet")
    val ogrenci5 = OgerncilerClass(5,"Burak")

    val duzHali = ArrayList<OgerncilerClass>()

    duzHali.add(ogrenci1)
    duzHali.add(ogrenci3)
    duzHali.add(ogrenci5)
    duzHali.add(ogrenci2)
    duzHali.add(ogrenci4)

    //Listemizin Ilk Hali
    for (veri in duzHali){
        println("${veri.ogrenciNo}-${veri.ogrenciAd}")
    }

    //Sayisal olarak kucukten buyuge siraliyoruz.
    println("\nSayisal Kucukten Buyuge Siralanmis Hali")

    val kucuktenBuyugeList1 = duzHali.sortedWith(compareBy { it.ogrenciNo })
    for (veri in kucuktenBuyugeList1){
        println("${veri.ogrenciNo}-${veri.ogrenciAd}")
    }

    //Sayisal olarak buyukten kucuge siraliyoruz.
    println("\nSayisal Buyukten Kucuge Siralanmis Hali")

    val buyuktenKucugeList2 = duzHali.sortedWith(compareByDescending { it.ogrenciNo })
    for (veri in buyuktenKucugeList2){
        println("${veri.ogrenciNo}-${veri.ogrenciAd}")
    }

    //Harfsel olarak siralanmis hali.
    println("\nHarfsel Siralanmis Hali")

    val harfselList3 = duzHali.sortedWith(compareBy { it.ogrenciAd })
    for (veri in harfselList3){
        println("${veri.ogrenciNo}-${veri.ogrenciAd}")
    }

    //Harfsel olarak tersten siralanmis hali.
    println("\nHarfsel Olarak Tersten Siralanmis Hali")

    val terstenHarfselList3 = duzHali.sortedWith(compareByDescending { it.ogrenciAd })
    for (veri in terstenHarfselList3){
        println("${veri.ogrenciNo}-${veri.ogrenciAd}")
    }


}