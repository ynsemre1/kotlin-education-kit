package com.info.nesnetabanliprogramlama

fun main(){

    fun toplam(vararg sayilar:Int):Int{
        var sonuc = 0

        for (i in sayilar){
            sonuc = sonuc + i
            println(i)
        }
        return sonuc
    }

    val t1 = toplam(1,2,3,4,5)
}