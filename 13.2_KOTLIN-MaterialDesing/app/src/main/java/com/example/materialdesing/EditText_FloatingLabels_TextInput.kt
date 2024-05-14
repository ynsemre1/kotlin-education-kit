package com.example.materialdesing

import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class EditText_FloatingLabels_TextInput : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text_floating_labels_text_input)

        val kullaniciAdi: EditText = findViewById(R.id.text1)
        val sifre: EditText = findViewById(R.id.text2)

        val baslik: TextView = findViewById(R.id.editTextFloatingLabels)

        val veriButton: Button = findViewById(R.id.buttonVeri)
        veriButton.setOnClickListener {
            val girilenKullaniciAdi = kullaniciAdi.text.toString().trim()
            val girilenSifre = sifre.text.toString()

            if (TextUtils.isEmpty(girilenKullaniciAdi)) {
                Toast.makeText(applicationContext, "Kullanici Adi Bos Olamaz", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            if (girilenKullaniciAdi.length < 2) {
                Toast.makeText(applicationContext, "Kullanici Adi 2 haften kucuk olamaz.", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            if (girilenSifre == "123" && girilenKullaniciAdi == "root") {
                baslik.text = "Bilgiler Dogru"
            } else {
                Toast.makeText(applicationContext, "Girilen Bilgiler Yanlis", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}