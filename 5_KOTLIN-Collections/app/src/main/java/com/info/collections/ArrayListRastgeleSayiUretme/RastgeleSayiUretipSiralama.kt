package com.info.collections.ArrayListRastgeleSayiUretme

import kotlin.random.Random

fun main(){

    val rastgeleSayi = ArrayList<Int>()

    for (veri in 1..100){
        val rastgeleSayi2 = Random.nextInt(0,101)
        rastgeleSayi.add(rastgeleSayi2)
    }

    rastgeleSayi.sort()

    for (veri in rastgeleSayi){
        println(veri)
    }



}