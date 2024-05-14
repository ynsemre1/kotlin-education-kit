package com.info.collections.SetHatsetYapisiNesneTabanliCalisma

fun main(){

    val ogernciler = HashSet<Ogernci3>()
    val o1 = Ogernci3(1,"Yunus","10C")
    val o2 = Ogernci3(2,"Emre","10D")
    val o3 = Ogernci3(3,"Akyol","12B")
    val o4 = Ogernci3(4,"Yunus","12B") //Ayni Sinif ve Ayni Isim Kaydetti...
    val o5 = Ogernci3(4,"Yunus","12c") //Ayni NO, Ayni Isim, Ayni Sinif Kaydetti !!????????????
    ogernciler.add(o1)
    ogernciler.add(o2)
    ogernciler.add(o3)
    ogernciler.add(o4)
    ogernciler.add(o5)

    for (veri in ogernciler){
        println("OgrenciNo:${veri.ogNo}\nOgernciAd:${veri.ogAd}\nOgrenciSinif:${veri.sinif}")
        println("############")
    }

}