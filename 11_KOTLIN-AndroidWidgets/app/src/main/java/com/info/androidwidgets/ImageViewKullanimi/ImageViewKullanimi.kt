package com.info.androidwidgets.ImageViewKullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.info.androidwidgets.R

class ImageViewKullanimi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view_kullanimi)

        val textView : TextView = findViewById(R.id.text9)
        val button1 : Button = findViewById(R.id.button10)
        val button2 : Button = findViewById(R.id.button12)

        val imageViewAdi : ImageView = findViewById(R.id.imageView)

        button1.setOnClickListener{
            imageViewAdi.setImageResource(R.drawable.instangram)
        }
        button2.setOnClickListener{
            imageViewAdi.setImageResource(resources.getIdentifier("instangram2","drawable",packageName))
        }
    }
}