package com.info.degiskenveveritipiogrenme

class `3_GlobalLocalDegiskenOgreniyorum` {
    var x = 10 // Global Degisken
    var y = 20 // Global Degisken

    fun topla(){

        var x = 40 // Local Degisken (Suslu Parantez icinde global degiskenden daha baskin)

        var z = x + y // 'x' Icerden Local Degisken olarak aliniyor,
        // fakat 'y' disardan Global degisken olarak aliniyor.

        println(z)
    }
}