package com.info.androidwidgets.VideoViewKullanimi

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView
import com.info.androidwidgets.R

class VideoViewKullanimi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_view_kullanimi)

        val button13:Button = findViewById(R.id.button13)
        val button14:Button = findViewById(R.id.button14)

        val videoView:VideoView = findViewById(R.id.videoView)

        button13.setOnClickListener {
            val adres = Uri.parse("android.resource://"+packageName+"/"+R.raw.video)
            videoView.setVideoURI(adres)
            videoView.start()
        }
        button14.setOnClickListener {
            videoView.stopPlayback()
        }
    }
}