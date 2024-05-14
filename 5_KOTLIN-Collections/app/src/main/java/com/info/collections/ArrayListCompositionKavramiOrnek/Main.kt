package com.info.collections.ArrayListCompositionKavramiOrnek

import java.util.*
import kotlin.collections.ArrayList

fun main(){

    val girdi = Scanner(System.`in`)
    val personelList = ArrayList<Personel>()

    for (i in 1..3){ //1,2,3,4,5
        println("$i. PersonelAd:")
        val personelAd = girdi.next()
        println("$i. Personel adres(il)")
        val il = girdi.next()
        println("$i Personel adres(ilce) ")
        val ilce = girdi.next()

        val adres = Adres(il,ilce)
        val personel = Personel(i,personelAd, adres)

        personelList.add(personel)
    }

    for (p in personelList){
        println("PersonelNo:${p.no}")
        println("PersonelAd:${p.isim}")
        println("PersonelAdresIl:${p.adres.il}")
        println("PersonelAdresIlce:${p.adres.ilce}")
        println("#######################")
    }

}