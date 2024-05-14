package com.info.androidwidgets.WebView

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.info.androidwidgets.R

class WebViewKullanimi : AppCompatActivity() { //Uygulama Icerisinde Web Site Acabiliriz.
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_kullanimi)

        val webView:WebView = findViewById(R.id.webwiew)
        webView.settings.javaScriptEnabled = true

        webView.loadUrl("https://steamcommunity.com/id/ipreviii")

    }
}