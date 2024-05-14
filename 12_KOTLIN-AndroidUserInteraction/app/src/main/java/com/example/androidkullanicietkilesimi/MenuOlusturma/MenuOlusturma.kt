package com.example.androidkullanicietkilesimi.MenuOlusturma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import com.example.androidkullanicietkilesimi.R

class MenuOlusturma : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_olusturma)

        val buttonMenuAc:Button=findViewById(R.id.buttonMenuAc)
        buttonMenuAc.setOnClickListener {
            val popup = PopupMenu(this@MenuOlusturma,buttonMenuAc)
            popup.menuInflater.inflate(R.menu.popupmenu,popup.menu)

            popup.setOnMenuItemClickListener { item ->
                when(item.itemId){
                    R.id.action_sil -> {
                        Toast.makeText(applicationContext,"Sil Secildi",Toast.LENGTH_LONG).show()
                        true
                    }
                    R.id.action_duzenle -> {
                        Toast.makeText(applicationContext,"Duzenle Secildi",Toast.LENGTH_LONG).show()
                        true
                    }
                    else -> false
                }
            }
            popup.show()
        }
    }
}