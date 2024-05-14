package com.example.androidkullanicietkilesimi.AlertViewOlusturmaveOzellestirme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.androidkullanicietkilesimi.R

class AlertViewOlusturmaveOzellestirme : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_view_olusturmave_ozellestirme)

        val text:TextView = findViewById(R.id.helloWorld)

        val buttonNormal:Button=findViewById(R.id.buttonNormal)
        val buttonOzel:Button=findViewById(R.id.buttonOzel)

        buttonNormal.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this@AlertViewOlusturmaveOzellestirme)
            alertDialog.setMessage("Mesaj")
            alertDialog.setTitle("Baslik")
            alertDialog.setIcon(R.drawable.resimforalertview)

            alertDialog.setPositiveButton("Tamam"){ dialogInterface, i ->
                Toast.makeText(applicationContext, "Tamam Tiklandi", Toast.LENGTH_SHORT)
                    .show()
            }
            alertDialog.setNegativeButton("Iptal"){ dialogInterface, i ->
                Toast.makeText(applicationContext, "Iptal Tiklandi", Toast.LENGTH_SHORT)
                    .show()
            }
            alertDialog.create().show()
        }
        buttonOzel.setOnClickListener {
            val tasarim = layoutInflater.inflate(R.layout.alertview_tasarim,null)
            val editText:EditText = tasarim.findViewById(R.id.editText)
            val alertDialog = AlertDialog.Builder(this@AlertViewOlusturmaveOzellestirme)
            alertDialog.setMessage("Mesaj")
            alertDialog.setTitle("Baslik")
            alertDialog.setIcon(R.drawable.resimforalertview)

            alertDialog.setView(tasarim)

            alertDialog.setPositiveButton("Kaydet"){ dialogInterface, i ->
                val alininVeri = editText.text.toString()
                text.text=alininVeri
            }
            alertDialog.setNegativeButton("Iptal"){ dialogInterface, i ->
                Toast.makeText(applicationContext, "Iptal Tiklandi", Toast.LENGTH_SHORT)
                    .show()
            }
            alertDialog.create().show()
        }
    }
}