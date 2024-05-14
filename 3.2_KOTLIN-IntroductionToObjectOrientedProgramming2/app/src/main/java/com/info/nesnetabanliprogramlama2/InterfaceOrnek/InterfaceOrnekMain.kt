package com.info.nesnetabanliprogramlama2.InterfaceOrnek

fun main(){

    val aslan = Aslan()
    val amasyaElmasi:Elma = AmasyaElmasi()
    val elma = Elma()
    val tavuk:Eatable = Tavuk()


    val nesneler = arrayOf(aslan,amasyaElmasi,elma,tavuk)

    for (nesne in nesneler){
        if (nesne is Eatable){
            nesne.howToEat()
        }
        if (nesne is Squeezable){
            nesne.howToSqueeze()
        }
    }

}