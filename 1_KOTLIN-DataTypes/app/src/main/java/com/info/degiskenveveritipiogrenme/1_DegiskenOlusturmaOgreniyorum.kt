package com.info.degiskenveveritipiogrenme

fun main(){

    var ogrenciAdi = "ahmet"
    var ogrenciYas = 23
    var ogrenciBoy = 1.98
    var ogrenciBasHarf = 'a'

    println(ogrenciAdi)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasHarf)

    var urun_id : Int = 3416
    var urun_adi : String = "Kol Saati"
    var urun_adet : Int =  100
    var urun_fiyat : Double = 149.99
    var urun_tedarikci : String = "rolex"

    println(urun_id)
    println(urun_adi)
    println(urun_adet)
    println(urun_fiyat)
    println(urun_tedarikci)

    println("$urun_tedarikci marka $urun_adi $urun_fiyat fiyat ile satilmaktadir. " +
            "Stokta $urun_adet adet kalmistir.")

    var a = 10
    var b = 20

    println("$a ve $b sayilarinin toplami : ${ a+b } dir")

    var dene = 40

    println("dene merhaba naber")
    println("$dene merhaba naber")

    println(dene)
    println("$dene")

    print(dene) ; println("merhaba naber")
}
