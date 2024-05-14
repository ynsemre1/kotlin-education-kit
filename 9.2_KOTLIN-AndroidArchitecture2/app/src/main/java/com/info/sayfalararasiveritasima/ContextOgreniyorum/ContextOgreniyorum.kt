package com.info.sayfalararasiveritasima.ContextOgreniyorum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.info.sayfalararasiveritasima.R
import kotlinx.android.synthetic.main.activity_context_ogreniyorum.*

class ContextOgreniyorum : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context_ogreniyorum)

        contextYazisiButton.setOnClickListener {
            Toast.makeText(this,"MerhabaContextYazi",Toast.LENGTH_SHORT).show()
            // Toast.makeText(this@ContextOgreniyorum,"MerhabaContextYazi",Toast.LENGTH_SHORT).show() (ALTERNATIF)
            // Toast.makeText(applicationContext,"MerhabaContextYazi",Toast.LENGTH_SHORT).show() (ALTERNATIF)
        }
    }
}