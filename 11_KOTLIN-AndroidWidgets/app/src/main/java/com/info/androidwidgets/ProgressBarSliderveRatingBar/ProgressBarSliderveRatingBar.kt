package com.info.androidwidgets.ProgressBarSliderveRatingBar

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.info.androidwidgets.R

class ProgressBarSliderveRatingBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar_sliderve_rating_bar)

        val button1: Button = findViewById(R.id.button)
        val button3: Button = findViewById(R.id.button11)
        val text1: TextView = findViewById(R.id.text10)
        val text2: TextView = findViewById(R.id.text9)
        val text3: TextView = findViewById(R.id.text11)

        val progressBar: ProgressBar = findViewById(R.id.progressBar)
        val seekBar: SeekBar = findViewById(R.id.seekBarSlider)
        val ratingBar: RatingBar = findViewById(R.id.ratingBar)
        var aktif = false

        button1.setOnClickListener {
            if (!aktif) {
                aktif = true
                button1.text = "DUR"
                progressBar.visibility = View.VISIBLE
            } else {
                aktif = false
                button1.text = "BASLA"
                progressBar.visibility = View.INVISIBLE
            }
        }

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(
                seekBar: SeekBar?,
                progress: Int,
                fromUser: Boolean
            ) { //Anlik olarak degistirdigimizde calisir.
                text1.text = "Sonuc: $progress"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) { //Dokunmaya basladigim zaman calisir.

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) { //Dokunmayi bitirdigim zaman calisir.

            }
        })

        button3.setOnClickListener {
            val gelenIlerleme = seekBar.progress
            val gelenOylama = ratingBar.rating
            text3.text = "Verdiginiz Oylama Sonucu:$gelenOylama\nBarIlerlemesi: $gelenIlerleme"
        }

    }


}