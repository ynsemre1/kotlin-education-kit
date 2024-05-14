package com.example.androidkullanicietkilesimi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.example.androidkullanicietkilesimi.AlertViewOlusturmaveOzellestirme.AlertViewOlusturmaveOzellestirme
import com.example.androidkullanicietkilesimi.AndroidToastMesajveOzellestirme.ToastMesajveOzellestirme
import com.example.androidkullanicietkilesimi.MenuOlusturma.MenuOlusturma
import com.example.androidkullanicietkilesimi.SnackBar.SnackBarOlusturma

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var deger = true

        val sayfa1: Button = findViewById(R.id.sayfa1Button)
        sayfa1.setOnClickListener {
            startActivity(Intent(this@MainActivity, ToastMesajveOzellestirme::class.java))
        }

        val sayfa2: Button = findViewById(R.id.sayfa2Button)
        sayfa2.setOnClickListener {
            startActivity(Intent(applicationContext, MenuOlusturma::class.java))
        }

        val sayfa3: Button = findViewById(R.id.sayfa3Button)
        sayfa3.setOnClickListener {
            startActivity(Intent(applicationContext, AlertViewOlusturmaveOzellestirme::class.java))
        }

        val sayfa4: Button = findViewById(R.id.sayfa4Button)
        sayfa4.setOnClickListener {
            startActivity(Intent(applicationContext, SnackBarOlusturma::class.java))
        }

        val darkMode: Button = findViewById(R.id.buttonDarkMode)
        darkMode.setOnClickListener {
            if (deger) {
                deger = false
                delegate.localNightMode = AppCompatDelegate.MODE_NIGHT_NO
            }else {
                deger = true
                delegate.localNightMode = AppCompatDelegate.MODE_NIGHT_YES
            }

        }

        /*val switch:Switch = findViewById(R.id.switchDarkMode)
        switch.setOnCheckedChangeListener { _ , isChecked ->
            if (isChecked){
                switch.text = "KaranlikMod"
                delegate.localNightMode = AppCompatDelegate.MODE_NIGHT_YES
            }else{
                switch.text = "AydinlikMod"
                delegate.localNightMode = AppCompatDelegate.MODE_NIGHT_NO
            }
        }*/

    }


}