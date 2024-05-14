package com.info.nesnetabanliprogramlama.E_OverloadingMetodlarinAsiriYuklenmesi

class HesaplayiciOverLoading {

    fun topla(sayi1:Int, sayi2:Int){ //Aynisindan bir tane daha yazamiyoruz parametreyi degistirince yaziliyor.
        println("Toplam: ${sayi1+sayi2}")
    }

    fun topla(sayi1:Double, sayi2:Int){
        println("Toplam: ${sayi1+sayi2}")
    }

    fun topla(sayi1:Int, sayi2:Double){
        println("Toplam: ${sayi1+sayi2}")
    }

    fun topla(sayi1:Int, sayi2:Int, ad:String){
        println("Toplam: $ad Sonuc: ${sayi1+sayi2}")
    }

}