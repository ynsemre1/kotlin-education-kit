package com.info.ilerikotlin

import java.lang.ArithmeticException

fun main(){

    val dizi = Array<Int>(2){0}
    // [0. indeksi 0 ,, ve 1. indexsi de 0 olan bir dizi] bu dizide biz 3. indexi degistirmek
    // istersek ArrayIndexOutOfBoundsException hatasi verir.

    val a = 10
    val b = 0 //b degeri 0 oldugu icin a/b degeri bize ArithmeticException hatasi verir.


    //1. Yontem 10un 0a bolunemedigi durum icin.
    /*try {
        println(a/b)
    }catch (e:Exception){
        println("Bu deger bu degere bolunemiyor.")
    }*/

    //2. Yontem hem 10un 0a bolunemedigi hemde dizinin verisini degistirmek istedigimiz icin.
    /*try {
        println("Sonuc:${a/b}")
        dizi[50]=1000
    }catch (e:Exception){
        if (e is ArrayIndexOutOfBoundsException){ //Eger Hata "ArrayIndexOutOfBoundsException" hatasi ise bunu yazdir.
            println("Dizinin Boyutu Asildi")
        }
        if (e is ArithmeticException){
            println("0 bolum kismina yazilamaz") //Eger Hata "ArithmeticException" hatasi ise bunu yazdir.
        }
    }*/

    //3. Yontem hem 10un 0 a bolunemedigi hemde dizinin verisini degistirmek istedigimiz icin.
     try {
        println("Sonuc:${a/b}")
        dizi[500]=1000

    }catch (e:ArrayIndexOutOfBoundsException){ //Eger Hata "ArrayIndexOutOfBoundsException" hatasi ise bunu yazdir.
        println("Dizinin boyutu asildi.")
    }catch (e:ArithmeticException){ //Eger Hata "ArithmeticException" hatasi ise bunu yazdir.
        println("0 bolum kismina yazilamaz.")
    }








}