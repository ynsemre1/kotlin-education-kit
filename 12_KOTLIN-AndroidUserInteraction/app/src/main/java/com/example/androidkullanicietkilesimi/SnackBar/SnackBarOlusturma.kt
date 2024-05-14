package com.example.androidkullanicietkilesimi.SnackBar

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.androidkullanicietkilesimi.R
import com.google.android.material.snackbar.Snackbar

class SnackBarOlusturma : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_bar_olusturma)

        val buttonNormal: Button = findViewById(R.id.buttonNormal)
        val buttonGeriDonus: Button = findViewById(R.id.buttonGeriDonus)
        val buttonOzel: Button = findViewById(R.id.buttonOzel)

        buttonNormal.setOnClickListener { view ->
            Snackbar.make(view, "Merhaba", Snackbar.LENGTH_SHORT)
                .show()
        }

        buttonGeriDonus.setOnClickListener { nesne ->
            Snackbar.make(nesne, "Mesaj silinsin mi?", Snackbar.LENGTH_SHORT)
                .setAction("EVET") { y ->

                    Snackbar.make(y, "Mesaj Silindi", Snackbar.LENGTH_SHORT)
                        .show()

                }
                .show()

        }

        buttonOzel.setOnClickListener { x ->
            val sb = Snackbar.make(x, "Ozellestirilmis Snack Bar", Snackbar.LENGTH_LONG)
            sb.setAction("Tekrar Dene") {
            }
            sb.setActionTextColor(Color.RED)
            sb.setTextColor(Color.BLUE)
            sb.setBackgroundTint(Color.YELLOW)
            sb.show()
        }
    }
}