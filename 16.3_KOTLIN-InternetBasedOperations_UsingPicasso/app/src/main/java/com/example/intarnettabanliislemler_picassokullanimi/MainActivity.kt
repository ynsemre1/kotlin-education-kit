package com.example.intarnettabanliislemler_picassokullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "https://i.pinimg.com/564x/c3/5e/02/c35e027aae04559a66f0c1829957c49b.jpg"

        val resimButton:Button=findViewById(R.id.resmiDegistir)
        val imageView:ImageView=findViewById(R.id.degisecekResim)
        resimButton.setOnClickListener {
            Picasso
                .get()
                .load(url)
                // .resize(400,400) //Resime yeni boyut verir
                // .rotate(90f) //Resmi verilen derece kadar dondurur
                .placeholder(R.drawable.ic_baseline_accessible_24) //Herhangi bir yavaslik durumunda gozukecek resim
                .error(R.drawable.ic_baseline_accessibility_24) //Herhangi bir hatada gozukecek resim
                .into(imageView)
        }
    }
}