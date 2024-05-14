package com.info.collections.ArrayListKarneUygulamasi

import java.util.*
import kotlin.collections.ArrayList

fun main(){

    val girdi = Scanner(System.`in`)

    val dersNot = ArrayList<Karne>()

    while (true){
        println("Ders Giriniz")
        val ders = girdi.next()
        println("Not Giriniz")
        val not = girdi.nextInt()

        val yeniNotlar = Karne(ders,not)
        dersNot.add(yeniNotlar)

        println("CikmakIcin (1) - DevamEtmekIcinBaskaSayi")

        val cikis = girdi.nextInt()
        if (cikis == 1){
            var notlarinToplami = 0
            for (veri in dersNot){
                println("${veri.ders}: ${veri.not}")
                println("########")
                notlarinToplami = notlarinToplami + veri.not
            }
            val ortalama = notlarinToplami / dersNot.size
            println("Ortlamaniz: $ortalama")
            if (ortalama>=50){
                println("**Gectinizz :)**")
            }else{
                println("**Kaldinizz :(**")
            }
            println("CikisYapildi")
            break
        }
    }
}