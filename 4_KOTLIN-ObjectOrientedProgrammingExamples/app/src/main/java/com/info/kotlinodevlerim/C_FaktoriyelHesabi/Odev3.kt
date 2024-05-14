package com.info.kotlinodevlerim.C_FaktoriyelHesabi

class Odev3 {

    fun faktoriyelHesaplama(sayi:Int): Int {
        var sonuc = 1
        for (i in 1..sayi) { // i nin temsil ettigi degerler sirayla: 1,2,3,4,5
            sonuc *= i
        }
        return sonuc
    }

}