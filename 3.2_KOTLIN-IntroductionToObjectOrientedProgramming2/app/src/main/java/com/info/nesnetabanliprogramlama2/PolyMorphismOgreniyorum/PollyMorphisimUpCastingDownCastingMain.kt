package com.info.nesnetabanliprogramlama2.PolyMorphismOgreniyorum

fun main(){
    val ogretmen:Personel=Ogretmen()
    val isci:Personel=Isci()

    val mudur=MudurDownCastingTipKontrolu()
    mudur.terfiEttir(ogretmen)
    mudur.terfiEttir(isci)

    }





