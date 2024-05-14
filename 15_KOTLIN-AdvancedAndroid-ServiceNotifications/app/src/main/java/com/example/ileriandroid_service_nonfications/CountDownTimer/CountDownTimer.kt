package com.example.ileriandroid_service_nonfications.CountDownTimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView
import com.example.ileriandroid_service_nonfications.R
import org.w3c.dom.Text

class CountDownTimer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count_down_timer)

        var sayac = 0
        val geriSayac:TextView=findViewById(R.id.countdownTimer)

        val baslaButton:Button=findViewById(R.id.baslaButton2)

            baslaButton.setOnClickListener {
                sayac++
                val sayici = object : CountDownTimer(30000,1000){

                    override fun onTick(millisUntilFinished: Long) {
                        if (sayac == 1){
                            geriSayac.text = "Kalan Sure : ${millisUntilFinished/1000} saniye"
                        }else{
                            geriSayac.text = "Fazla Giris"
                        }

                    }

                    override fun onFinish() {
                        if (sayac == 1){
                            geriSayac.text = "Bitti"
                        }else{
                            geriSayac.text = "Fazla Giris"
                        }

                    }
                }
                sayici.start()
            }
    }
}