package com.info.nesnetabanliprogramlama.D_FonksiyonlaraClassIcerisindenErisim

fun main(){

    val m = Matematik()
    m.topla(100,200)

    val c = m.cikarma(300.0,50.0) // 300.0 ve 50.0 cunku class inda double ile tanimladik.
    println(c)

    m.carpma(59,5,"YunusEmreAkyol")

    val bolmeCevabi = m.bolme(50.0,4.0)
    println(bolmeCevabi)


}