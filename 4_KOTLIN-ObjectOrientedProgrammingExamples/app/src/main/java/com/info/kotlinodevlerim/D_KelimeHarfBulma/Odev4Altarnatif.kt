package com.info.kotlinodevlerim.D_KelimeHarfBulma

class Odev4Altarnatif {
    fun harfBulma2(kelime:String, harf:Char):Int{
        var sonuc = 0
        var sayac = 0
        var bittiMi=true
        while (bittiMi){
            if (kelime[sayac]==harf) {
                sonuc++
            }
            // println(kelime[sayac]) // Indeks deki degerleri yazdiriyor.
            sayac++
            if (kelime.length==sayac){
                bittiMi=false
            }
        }
        return sonuc
    }

}