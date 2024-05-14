package com.info.collections.ArrayListFilterOgreniyorum

fun main(){

    val ogrenciList = ArrayList<Ogrenci>()

    val ogrenci1 = Ogrenci(1,"Ahmet","11F")
    val ogrenci2= Ogrenci(2,"Yunus","10D")
    val ogrenci3 = Ogrenci(3,"Burak", "12C")
    val ogrenci4 = Ogrenci(4,"Sila","11F")
    val ogrenci5 = Ogrenci(5,"Emre","12A")

    ogrenciList.add(ogrenci1)
    ogrenciList.add(ogrenci2)
    ogrenciList.add(ogrenci3)
    ogrenciList.add(ogrenci4)
    ogrenciList.add(ogrenci5)

    val filtreliList = ogrenciList.filter { it.ogrenciNo>2 } //OgrenciNumarasi 2 den buyuk olan nesneleri yazdirir.
    val filtreliList2 = ogrenciList.filter { it.ogrenciNo<2 } //OgerenciNumarasi 2 den kucuk olan nesneleri yazdirir.
    val filtreliList3 = ogrenciList.filter { it.ogrenciNo==2 } //OgernciNumarasi 2 ye esit olan nesneyi yazdirir.

    val filtreliList4 = ogrenciList.filter { (it.ad).contains("a") } //OgrenciAdlarinda "a" olan nesneleri yazdirir.
    val filtreliList5 = ogrenciList.filter { it.sinif=="11F" } //OgrenciSinifi sadece "11F" olanlari yazdirir.bv


    for (o in filtreliList5){
        println("OgrenciNo: ${o.ogrenciNo}")
        println("OgrenciAd: ${o.ad}")
        println("OgrenciSinif: ${o.sinif}")
        println("#############")
    }



}