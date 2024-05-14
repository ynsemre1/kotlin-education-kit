package com.info.collections.ArrayListVeriArama

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val girdi = Scanner(System.`in`)

    val isimler = ArrayList<String>()
    isimler.add("Yunus")
    isimler.add("Emre")
    isimler.add("Akyol")
    isimler.add("Nisa")
    isimler.add("Nur")
    isimler.add("Arzu")
    isimler.add("Mikayil")

    println("Aratmak Istediginiz Ismi Giriniz")
    val istenilenisim = girdi.next()

    for (isim in isimler) {
        if (isim == istenilenisim) {
            println("Girdiniz Isim Mevcut")
            break
        }
    }
}

