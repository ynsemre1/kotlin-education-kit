package com.info.collections.ArrayListTekCiftAyirma

fun main() {

    val sayilar = ArrayList<Int>()
    sayilar.add(23)
    sayilar.add(32)
    sayilar.add(47)
    sayilar.add(59)
    sayilar.add(100)
    sayilar.add(18)
    sayilar.add(54)

    val tekSayilar = ArrayList<Int>()
    val ciftSayilar = ArrayList<Int>()


    for (veri in sayilar) {
        val sonuc = veri % 2
        if (sonuc == 0) {
            ciftSayilar.add(veri)
        }
        if (sonuc == 1){
            tekSayilar.add(veri)
        }
    }

    for (veri in tekSayilar) {
        println(veri)
    }; println("\n")
    for (veri in ciftSayilar) {
        println(veri)
    }

}
