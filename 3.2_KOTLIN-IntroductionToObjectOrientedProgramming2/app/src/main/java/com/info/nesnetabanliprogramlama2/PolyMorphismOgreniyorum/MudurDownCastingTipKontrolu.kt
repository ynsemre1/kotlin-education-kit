package com.info.nesnetabanliprogramlama2.PolyMorphismOgreniyorum

class MudurDownCastingTipKontrolu:Personel() {
    fun iseAl(p:Personel){
        p.iseAlindi()
    }

    fun terfiEttir(p:Personel){
        if (p is Ogretmen) { //Tip Kontrolu
            (p as Ogretmen).maasArttir() //DownCasting
        }
        if (p is Isci){ //Tip Kontrolu
            println("Isciler Terfi Ettirilemez.")
        }
    }
}