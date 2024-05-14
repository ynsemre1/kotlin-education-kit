package com.info.nesnetabanliprogramlama2.InterfaceOrnek

open class Elma:Squeezable,Eatable {
    override fun howToEat() {
        println("Dilimleyerek Yenilir")
    }
    override fun howToSqueeze() {
        println("Bilendir Ile Sikilabilir.")
    }
}