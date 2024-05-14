package com.info.degiskenveveritipiogrenme

fun main(){

    // Daire Alani Hesaplama
    val pi = 3.14

    var yariCap = 2.0

    var alan = pi * yariCap * yariCap

    println("Dairemizin Alani $alan dir.") // Cevap 12.56


    // F = m * a
    var m = 12.5
    var a = 10.0

    var f = m * a
    println("F : $f")

    // Delta X (Ax)
    var v = 12.7
    var v0 = 23.56
    var t = 3.5

    var x1 = ((v+v0)/2)*t

    println("x1 : $x1")

    var x2 = (v0*t) + (a*t*t)/2 //Burada ki "a" degiskenini videoda yanlis yapti.

    println("x2 : $x2")


    // Kisatlmalar // 

    var y = 10
    y = y + 2
    println(y)

    y += 2 // { y = y + 2 } Kisaltmasi Bu
    println(y)

    y -= 2 // { y = y - 2 } Kisaltmasi Bu 2
    println(y)

    y *= 2 // { y = y * 2 } Kisaltmasi Bu 3
    println(y)

    y /= 2 // { y = y / 2 } Kisaltmasi Bu 4
    println(y)

}