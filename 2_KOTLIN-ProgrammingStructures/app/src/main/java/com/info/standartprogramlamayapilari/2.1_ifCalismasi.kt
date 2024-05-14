package com.info.standartprogramlamayapilari

fun main(){

    var yas = 15
    var isim = "Yunus"

    //Ornek1
    if ( yas >= 18){
        println("Resitsiniz")
    }else {
        println("Resit degilsiniz.")
    }

    //Ornek2
    if (isim == "Yunus"){
        println("Merhaba Yunus")
    }else {
        println("Taninmayan kisi")
    }

    //Ornek3
    if (isim != "Yunus"){   // "!" koyduk kodu tersine cevirdi.
        println("Merhaba Yunus")
    }else if( isim == "Mehmet"){
        println("Selam Mehmet")
    }else{
        println("Taninmayan kisi")
    }

    //Ornek4
    var kullaniciAdi = "admin"
    var sifre = 12345

    if ( sifre == 12345 && kullaniciAdi == "admin" ){  // True and True. Sonuc: True
        println("Hos Geldiniz.")
    }else{
        println("Hatali Giris")
    }

    //Ornek5
    var sinif = 8

    if ( sinif == 9 || sinif == 10 || sinif == 11 || sinif == 12){
        println("AYT Sinavina Hazirlanabilirsiniz.")
    }else{
        println("AYT Sinavina Hazir Degilsiniz.")
    }

    //Ornek6 (Kisaltma)
    var a = 10
    var b = 10

    if (a==b) println("Esit") else println("Esit Degil")

}