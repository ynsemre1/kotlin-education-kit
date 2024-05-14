package com.info.androidwidgets.ButonTextViewEditText

import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.info.androidwidgets.R

class ButonTextViewEditText : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buton_text_view_edit_text)

        val text1: TextView = findViewById(R.id.text1)
        val editText1: EditText = findViewById(R.id.editText1)
        val button2: Button = findViewById(R.id.button2)
        val text2: TextView = findViewById(R.id.text2)

        button2.setOnClickListener {
            val alinacakVeri =
                editText1.text.toString() //EditText'e girilecek veriyi almak icin bir tanimlama yapiyoruz.
            text2.text = alinacakVeri

            Handler().postDelayed({
                text2.text = "Heran Degisebilir Demistim.."
            }, 3000)
        }

    }
}