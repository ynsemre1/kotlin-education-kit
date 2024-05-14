package com.info.androidwidgets.ToggleButtonveSwitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import com.info.androidwidgets.R

class ToggleButtonveSwitch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggle_buttonve_switch)

        val text3:TextView = findViewById(R.id.text3)
        val text4:TextView = findViewById(R.id.text4)
        val text5:TextView = findViewById(R.id.text5)
        val button4:Button = findViewById(R.id.button4)
        val text6:TextView = findViewById(R.id.text6)
        val text7:TextView = findViewById(R.id.text7)

        val switch1:Switch = findViewById(R.id.switch1)
        val toogleButton:ToggleButton = findViewById(R.id.toggleButton)

        switch1.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                Toast.makeText(applicationContext,"SwitchButton Acik",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"SwitchButton Kapali",Toast.LENGTH_SHORT).show()
            }
        }

        toogleButton.setOnCheckedChangeListener { compoundButton, b ->
            val toogleButtonAcik = "Toogle Button Acildi"
            val toogleButtonKapali = "Toogle Button Kapandi"

            if (b){
                text5.text = toogleButtonAcik.toString()
            }else{
                text5.text = toogleButtonKapali.toString()
            }
        }

        toogleButton.setOnCheckedChangeListener { _, b ->  }

        button4.setOnClickListener {
            val toogleButtonAcik = "Suan Toogle Button Acik"
            val toogleButtonKapali = "Suan Toogle Button Kapali"
            val switchButtonAcik = "Suan Switch Button Acik"
            val switchButtonKapali = "Suan Switch Button Kapali"

            val switchDurum = switch1.isChecked
            val toggleButtonDurum = toogleButton.isChecked

            if (toggleButtonDurum){
                text7.text = toogleButtonAcik.toString()
            }else{
                text7.text = toogleButtonKapali.toString()
            }

            if (switchDurum){
                text6.text = switchButtonAcik.toString()
            }else{
                text6.text = switchButtonKapali.toString()
            }

        }


    }
}