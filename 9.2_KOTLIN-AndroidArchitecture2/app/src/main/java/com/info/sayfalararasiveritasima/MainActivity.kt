package com.info.sayfalararasiveritasima

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.info.sayfalararasiveritasima.BackStackKontrolu.ASayfasi
import com.info.sayfalararasiveritasima.ContextOgreniyorum.ContextOgreniyorum
import com.info.sayfalararasiveritasima.FragmentOgreniyorum.Fragment
import com.info.sayfalararasiveritasima.SayfalarArasiVeriTasimaOrnegi.Kisiler
import com.info.sayfalararasiveritasima.SayfalarArasiVeriTasimaOrnegi.SayfaB
import com.info.sayfalararasiveritasima.SayfalarArasiVeriTasimaOrnek1.YaziSayfasi
import com.info.sayfalararasiveritasima.finishMetodu.BaslangicSayfasi
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_yazi_sayfasi.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sayfaGecisiButton.setOnClickListener {
            val kisi = Kisiler(
                100411119692,
                "Yunus",
                1.70
            ) // NesneTabanliCalisma icin olusturulan Class dan veri.

            val gecisIntent = Intent(this@MainActivity, SayfaB::class.java)
            gecisIntent.putExtra(
                "mesaj",
                "merhaba"
            ) //Teker Teker Veri Tasima (Kullanilmiyor cunku Nesne Tabanli Calisicaz)
            gecisIntent.putExtra(
                "yas",
                23
            ) //Teker Teker Veri Tasima (Kullanilmiyor cunku Nesne Tabanli Calisicaz)
            gecisIntent.putExtra(
                "boy",
                1.78
            ) //Teker Teker Veri Tasima (Kullanilmiyor cunku Nesne Tabanli Calisicaz)

            gecisIntent.putExtra("nesneTabanli", kisi) //Nesne Tabanli Veri Tasima

            startActivity(gecisIntent)
        }

        yaziSayfasiButton.setOnClickListener {
            val gecisIntent2 = Intent(this@MainActivity, YaziSayfasi::class.java)
            startActivity(gecisIntent2)
        }

        activity3Button.setOnClickListener {
            val gecisIntent3 = Intent(this@MainActivity, ASayfasi::class.java)
            startActivity(gecisIntent3)
        }

        finishButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, BaslangicSayfasi::class.java)) //Altarnatif Intent Kullanma Yolu eger veri aktarilmayacak ise.

        }

        contextButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, ContextOgreniyorum::class.java))
        }

        buttonListeGitme.setOnClickListener {
            startActivity(Intent(this@MainActivity, Liste::class.java))
        }

        buttonFragment.setOnClickListener {
            startActivity(Intent(this@MainActivity, Fragment::class.java))
        }




    }
}