package com.info.kotlinodevlerim.D_KelimeHarfBulma

class Odev4 {

    fun harfBulma(kelime:String, harf:Char){
        var sonuc = 0
        for (k in kelime){
            if (k==harf){
                sonuc = sonuc + 1
            }
        }
        println("HarfAdeti: $sonuc")
    }
}