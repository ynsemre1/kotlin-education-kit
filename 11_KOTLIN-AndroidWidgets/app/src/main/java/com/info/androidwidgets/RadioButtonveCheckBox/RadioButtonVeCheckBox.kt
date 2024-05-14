package com.info.androidwidgets.RadioButtonveCheckBox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.info.androidwidgets.R

class RadioButtonVeCheckBox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button_ve_check_box)

        val text8:TextView=findViewById(R.id.text8)
        val text9:TextView=findViewById(R.id.text9)
        val text10:TextView=findViewById(R.id.text10)
        val button6:Button=findViewById(R.id.button6)

        val checkBoxJava:CheckBox=findViewById(R.id.checkBoxJava)
        val checkBoxKotlin:CheckBox=findViewById(R.id.checkBoxKotlin)

        val radioGroupTakimlar:RadioGroup=findViewById(R.id.radioGroupTakimlar)
        val radioButtonBarcelona:RadioButton=findViewById(R.id.radioButtonBarcelona)
        val radioButtonReal:RadioButton=findViewById(R.id.radioButtonReal)

        radioButtonBarcelona.setOnCheckedChangeListener { basilirsa, b ->
            if (b){
                Toast.makeText(applicationContext,"Barcelona Tusuna Basildi", Toast.LENGTH_SHORT).show()
            }
        }
        radioButtonReal.setOnCheckedChangeListener { basilirsa, b ->
            if (b){
                Toast.makeText(applicationContext,"RealMadrid Tusuna Basildi", Toast.LENGTH_SHORT).show()
            }
        }

        checkBoxJava.setOnCheckedChangeListener { basilirsa, b ->
            if (b){
                Toast.makeText(applicationContext,"Java Butonu Secildi",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"Java Butonu Secimden Cikarildi",Toast.LENGTH_SHORT).show()
            }
        }
        checkBoxKotlin.setOnCheckedChangeListener { basilirsa, b ->
            if (b){
                Toast.makeText(applicationContext,"Kotlin Butonu Secildi",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"Kotlin Butonu Secimden Cikarildi",Toast.LENGTH_SHORT).show()
            }
        }

        button6.setOnClickListener {
            val javaDurum = checkBoxJava.isChecked //true or false olarak giris yapar.
            val kotlinDurum = checkBoxKotlin.isChecked //true or false olarak giris yapar.

            val barcelonaDurum = radioButtonBarcelona.isChecked //true or false olarak giris yapar.
            val realDurum=radioButtonReal.isChecked //true or false olarak giris yapar.

            val Intent=Intent(this@RadioButtonVeCheckBox, RadioButtonVeCheckBoxIkinciSayfa::class.java)
            Intent.putExtra("javaDurum",javaDurum)
            Intent.putExtra("kotlinDurum",kotlinDurum)
            Intent.putExtra("barcelonaDurum",barcelonaDurum)
            Intent.putExtra("realDurum",realDurum)
            startActivity(Intent)

        }







    }
}