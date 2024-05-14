package com.info.ilerikotlin

class BirinceThread:Thread() {
    override fun run() {

        for (i in 100..199){
            println("BirinciThread: $i")
            Thread.sleep(100)
        }

    }
}