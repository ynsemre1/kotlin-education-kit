package com.info.degiskenveveritipiogrenme

import java.lang.Exception

fun main(){

    //Sayisaldan Sayisala Donusum

    var i : Int = 42
    var d : Double = 42.95
    var f : Float = 42.89f
    println(i) ; println(d) ; println(f)

    var sonuc1 : Double = i.toDouble()
    var sonuc2 : Int = d.toInt()
    var sonuc3 : Int = f.toInt()
    println(sonuc1) ; println(sonuc2) ;  println(sonuc3)


    // Sayisaldan Metine Donusum

    var str1 = i.toString()
    var str2 = d.toString()
    var str3 = f.toString()
    println(str1) ; println(str2) ; println(str3)

    // Metinden Sayisala Donusturme (3 Onemli Yontemli)

                //Yontem 1 (catch Yontemi)

    var yazi1 = "34"

    try {
        var x = yazi1.toInt()
        println("\n$x") // \n Assagi Satira Inmesi Icin
    }catch (e:Exception){
        println("Donusumde Hata var.")
    }

                // Yontem 2 (if-else Yontemi)

    var yazi2 = "48.56" // String olarak tanimladik.

    var y = yazi2.toDoubleOrNull()

    if (y != null){
        println(y)
    }else{ // yazi2 String(Metin) olarak tanimlandi daha sonra Double(Sayisal) a donusturuldu. Test etmek istersen ("48.56" kismina metin yaz.)
        println("Donusumde Hata Var.")
    }

            // Yontem3 (let Yontemi) (Eger hata var ise hic bir sey yazmaz uygulamada cokmez.)
  
    var yazi3 = "67"

    var z = yazi3.toIntOrNull()

    z?.let {
        println("z : $z")
    }

}