package com.info.nesnetabanliprogramlama2.EnumarationOgreniyorum

fun main(){
    fun ucretAl(boyut: EnumarationOgreniyorum){ //Boyut atadigimiz Class ismi.
        when(boyut){
            EnumarationOgreniyorum.Buyuk -> println("BuyukBoyKonservemiz: ${10*3}")
            EnumarationOgreniyorum.Orta -> println("OrtaBoyKonservemiz: ${10*2}")
            EnumarationOgreniyorum.Kucuk -> println("KucukBoyKonservemiz: ${10*1}")
        }
    }

    ucretAl(EnumarationOgreniyorum.Kucuk)
    ucretAl(EnumarationOgreniyorum.Orta)
    ucretAl(EnumarationOgreniyorum.Buyuk)

}