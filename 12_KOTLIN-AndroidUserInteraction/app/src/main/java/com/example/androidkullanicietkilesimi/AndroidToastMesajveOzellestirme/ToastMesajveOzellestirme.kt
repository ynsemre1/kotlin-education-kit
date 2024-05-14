package com.example.androidkullanicietkilesimi.AndroidToastMesajveOzellestirme

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidkullanicietkilesimi.R

class ToastMesajveOzellestirme : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast_mesajve_ozellestirme)

        val buttonNormal: Button = findViewById(R.id.buttonNormal)
        val buttonOzel: Button = findViewById(R.id.buttonOzel)

        buttonNormal.setOnClickListener {
            Toast.makeText(applicationContext, "Merhaba", Toast.LENGTH_SHORT)
                .show()

        }

        buttonOzel.setOnClickListener {
            val tasarim = layoutInflater.inflate(R.layout.toastmesagetasarim, null)
            val textOzellestirilcek: TextView = tasarim.findViewById(R.id.ozellestirilcekText)
            textOzellestirilcek.text="Merhaba ozellestirilmis mesaj."
            val toastOzel = Toast(applicationContext)
            toastOzel.view = tasarim
            toastOzel.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.CENTER_VERTICAL, 0,0)
            toastOzel.duration = Toast.LENGTH_LONG
            toastOzel.show()
        }
    }
}