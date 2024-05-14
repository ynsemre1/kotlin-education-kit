package com.info.nesnetabanliprogramlama.D_FonksiyonlaraClassIcerisindenErisim

class Matematik {
    fun topla(sayi1:Int, sayi2:Int){
        val sonuc1=sayi1+sayi2
        println("Sonuc: $sonuc1")
    }

    fun cikarma(sayi1:Double,sayi2:Double):Double{
        return sayi1-sayi2
    }

    fun carpma(sayi1:Int,sayi2: Int,isim:String){
        val sonuc2 = sayi1*sayi2
        println("Carpma Yapan $isim Sonuc: $sonuc2")
    }

    fun bolme(sayi1:Double,sayi2:Double):String{
        return "Bolme: ${sayi1/sayi2}"
    }
}