package com.info.nesnetabanliprogramlama

fun main(){
    fun selamla(){ //Geri donusu olmayan bir fonksiyon
        var sonuc="Merhaba Yunus"
        println(sonuc)
    }
    selamla()

    fun selamla1():String{ //Geri donusu olan bir fonksiyon
        val sonuc="Merhaba YunusEmre"
        return sonuc
    }
    val gelenSonuc=selamla1()
    println(gelenSonuc)

    fun selamla2(isim:String){
        val sonuc="Merhaba $isim"
        println(sonuc)
    }
    selamla2("Yunus Emre Akyol")

    // Ornekler

    fun toplama(){
        val toplam = 30 + 40
        println("Toplam: $toplam")
    }
    toplama()

    fun toplama1():Int{
        val toplam=30+90
        return toplam
    }
    val t1=toplama1()

    fun toplama2(sayi1:Int,sayi2:Int): Int {
        val toplam=sayi1+sayi2
        return toplam
    }
    val t2 = toplama2(60,40)
    println("Toplam2:$t2")



}