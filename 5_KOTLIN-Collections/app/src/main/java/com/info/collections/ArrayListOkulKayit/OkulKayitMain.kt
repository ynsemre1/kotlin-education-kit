package com.info.collections.ArrayListOkulKayit

import java.util.*
import kotlin.collections.ArrayList

fun main(){

    val girdi = Scanner(System.`in`)
    var sayac = 1
    val ogrenciListesi = ArrayList<Ogrenci>()

    while (true){
        println("IsimGiriniz")
        val ogAdi = girdi.next()
        println("OgernciSinifiGiriniz")
        val ogSinif = girdi.next()

        val yeniOg = Ogrenci(sayac,ogAdi,ogSinif)
        sayac++

        ogrenciListesi.add(yeniOg)

        println("CikmakIcin(1)-DevamEtmekIcinDigerSayilar")
        val cikis = girdi.nextInt()
        if (cikis==1){
            for (ogrenci in ogrenciListesi){
                println("OgrenciNo: ${ogrenci.ogNo}")
                println("OgrenciAdi: ${ogrenci.ogAd}")
                println("OgrenciSinif: ${ogrenci.ogSinif}")
                println("##############")
            }
            println("CikisYapildi")
            break
        }
    }



}