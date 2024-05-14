package com.info.kotlinodevlerim.F_MaasHesaplama

class Odev6 {

    fun maas(gun:Int):Int{
        val calisabilicegiSaat = gun*8
        var calismaMaasi=calisabilicegiSaat*10
        if (calisabilicegiSaat>160){
            var mesaiMaasi=(calisabilicegiSaat-160)*20
            calismaMaasi+mesaiMaasi
        }
        return calismaMaasi
    }

}