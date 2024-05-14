package com.info.kotlinodevlerim.G_IntarnetUcreti

class Odev7 {

    fun kotaAsim(kota:Int):Int{
        var standartUcret = 100
        if (kota>50){
            standartUcret = (kota-50)*4 + standartUcret
        }
        return standartUcret

    }

}