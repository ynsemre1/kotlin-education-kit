package com.info.androidwidgets.SpinnerKullanimi

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.info.androidwidgets.R

class SpinnerKullanimi : AppCompatActivity() {

    private val ulkeler = ArrayList<String>()
    private lateinit var veriAdaptoru: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner_kullanimi)

        val spinner: Spinner = findViewById(R.id.spinner)
        val button: Button = findViewById(R.id.button15)

        ulkeler.add("Turkiye")
        ulkeler.add("Italya")
        ulkeler.add("Almanya")
        ulkeler.add("Japonya")
        ulkeler.add("Cin")
        ulkeler.add("Portekiz")
        ulkeler.add("Ispanya")

        veriAdaptoru = ArrayAdapter(
            this@SpinnerKullanimi,
            android.R.layout.simple_expandable_list_item_1,
            android.R.id.text1,
            ulkeler
        )
        spinner.adapter = veriAdaptoru

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int, //Indeks (Veri kumesinde sectigim verinin indeks numarasi)
                id: Long
            ) {
                Toast.makeText(
                    this@SpinnerKullanimi,
                    "Secilen Ulke: ${ulkeler[position]}",
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        button.setOnClickListener {
            Toast.makeText(
                this@SpinnerKullanimi,
                "SectiginizUlke: ${ulkeler[spinner.selectedItemPosition]}",
                Toast.LENGTH_SHORT
            ).show()
        }


    }
}