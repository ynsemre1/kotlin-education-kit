package com.info.nesnetabanliprogramlama

fun main(){

    var str1:String? = null // ? Ifadenin null olabilcegini soyluyor

    str1?.trim() // Calistirinca sorun yok
    // str1!!.trim() Zorla Calistir demek ama hata veriyor.

    if (str1 != null){
        str1.trim()
    }

}