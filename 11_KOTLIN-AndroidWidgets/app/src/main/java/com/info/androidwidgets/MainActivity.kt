package com.info.androidwidgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import com.info.androidwidgets.ButonTextViewEditText.ButonTextViewEditText
import com.info.androidwidgets.ImageViewKullanimi.ImageViewKullanimi
import com.info.androidwidgets.ProgressBarSliderveRatingBar.ProgressBarSliderveRatingBar
import com.info.androidwidgets.RadioButtonveCheckBox.RadioButtonVeCheckBox
import com.info.androidwidgets.ScrollViewKullanimi.ScrollViewKullanimi
import com.info.androidwidgets.SpinnerKullanimi.SpinnerKullanimi
import com.info.androidwidgets.TimeveDatePicker.TimeveDatePicker
import com.info.androidwidgets.ToggleButtonveSwitch.ToggleButtonveSwitch
import com.info.androidwidgets.VideoViewKullanimi.VideoViewKullanimi
import com.info.androidwidgets.WebView.WebViewKullanimi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val yaziAndroidWidgets: TextView = findViewById(R.id.androidWidgets)

        val buton1: Button = findViewById(R.id.button1)
        buton1.setOnClickListener {
            startActivity(Intent(this@MainActivity, ButonTextViewEditText::class.java))
        }

        val buton3: Button = findViewById(R.id.button3)
        buton3.setOnClickListener {
            startActivity(Intent(this@MainActivity, ToggleButtonveSwitch::class.java))
        }

        val buton5:Button = findViewById(R.id.button5)
        buton5.setOnClickListener {
            startActivity(Intent(this@MainActivity, RadioButtonVeCheckBox::class.java))
        }

        val button7:Button = findViewById(R.id.button7)
        button7.setOnClickListener {
            startActivity(Intent(this@MainActivity, ProgressBarSliderveRatingBar::class.java))
        }

        val button8:Button = findViewById(R.id.button8)
        button8.setOnClickListener{
            startActivity(Intent(this@MainActivity, WebViewKullanimi::class.java))
        }

        val button9:Button = findViewById(R.id.button9)
        button9.setOnClickListener{
            startActivity(Intent(this@MainActivity, ImageViewKullanimi::class.java))
        }

        val button10:Button = findViewById(R.id.button10)
        button10.setOnClickListener {
            startActivity(Intent(this@MainActivity, VideoViewKullanimi::class.java))
        }

        val button11:Button = findViewById(R.id.button11)
        button11.setOnClickListener {
            startActivity(Intent(this@MainActivity, ScrollViewKullanimi::class.java))
        }

        val button12:Button = findViewById(R.id.button12)
        button12.setOnClickListener {
            startActivity(Intent(this@MainActivity, TimeveDatePicker::class.java))
        }

        val button13:Button = findViewById(R.id.button13)
        button13.setOnClickListener {
            startActivity(Intent(this@MainActivity, SpinnerKullanimi::class.java))
        }
    }

    override fun onBackPressed() {
        finish()
    }
}