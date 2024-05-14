package com.info.standartprogramlamayapilari

fun main() {

    for (i in 3..5) { // 3;4;5
        println(i)
    }

    // 10 ile 20 arasinda 5er 5er artis
    var baslangic = 10
    var bitis = 20
    var artis = 5

    for (a in baslangic..bitis step artis) {
        println("a: $a")
    }

    // 20 ile 10 arasi (Terse) artis miktari 2ser [downTo kullanicaz (Baslangic bitise deger tanimlamadik)]
    for (b in 20 downTo 10 step 2){
        println("b: $b")
    }

    // Until kullanimi {Until son degeri dahil etmez 1 eksik yazdirir}
    for (c in 1 until 5){
        println("c: $c")
    }

    // While dongusu sayac olusturma
    var sayac = 1

    while (sayac < 4){
        println("sayac: $sayac")
        sayac = sayac + 1 // Kisaltmasi: sayac+=1
    }



    // For in ile "INDEX" ve "DEGERI" ayni anda alma [OGRETILMEDI]
    val dizi = listOf<Int>(10,20,30,40)

    for ((index,deger)in dizi.withIndex()){
        println("$index.indexin degeri= $deger")
    }
}