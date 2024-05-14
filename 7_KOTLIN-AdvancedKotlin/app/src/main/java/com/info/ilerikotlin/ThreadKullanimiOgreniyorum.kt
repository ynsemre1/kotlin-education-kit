package com.info.ilerikotlin

fun main(){
    val birinciThread = BirinceThread()
    birinciThread.start()

    val ikinciThread = Thread(IkinciThread())
    ikinciThread.start()

    for (i in 900..999){
        println("MainThread: $i")
        Thread.sleep(100)
    }

}