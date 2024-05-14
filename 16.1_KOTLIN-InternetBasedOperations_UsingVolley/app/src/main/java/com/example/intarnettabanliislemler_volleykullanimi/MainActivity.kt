package com.example.intarnettabanliislemler_volleykullanimi

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONException
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val veriEkleme: Button = findViewById(R.id.veriEkleme)
        veriEkleme.setOnClickListener {
            insert()
        }
        val veriGuncelleme: Button = findViewById(R.id.veriGuncelleme)
        veriGuncelleme.setOnClickListener {
            update()
        }
        val veriOkuma: Button = findViewById(R.id.veriOkuma)
        veriOkuma.setOnClickListener {
            tumKisiler()
        }
        val veriSilme: Button = findViewById(R.id.veriSilme)
        veriSilme.setOnClickListener {
            delete()
        }
    }

    fun update() {
        val veriOkucu: EditText = findViewById(R.id.veriOkuyucu)
        val alinanVeri = veriOkucu.text.toString()
        val sonuclarText: TextView = findViewById(R.id.sonuclarKismi)

        val url = "http://androideneme.tr.ht/dbconfig/update_kisiler.php"
        val istek = object : StringRequest(Method.POST, url, Response.Listener { cevap ->
            sonuclarText.text = "Veri Basariyla Guncellendi"
        }, Response.ErrorListener { e -> e.printStackTrace() }) {
            override fun getParams(): MutableMap<String, String> {
                val params = HashMap<String, String>()

                params["kisi_id"] = alinanVeri
                params["kisi_ad"] = "Guncellenecek Isim"
                params["kisi_tel"] = "1000000000"
                return params
            }
        }
        Volley.newRequestQueue(this@MainActivity).add(istek)
    }

    fun insert() {
        val veriOkucu: EditText = findViewById(R.id.veriOkuyucu)
        val alinanVeri = veriOkucu.text.toString()
        val sonuclarText: TextView = findViewById(R.id.sonuclarKismi)

        val url = "http://androideneme.tr.ht/dbconfig/insert_kisiler.php"
        val istek = object : StringRequest(Method.POST, url, Response.Listener { cevap ->
            sonuclarText.text = "Veri Basariyla Eklendi"
        }, Response.ErrorListener { e -> e.printStackTrace() }) {
            override fun getParams(): MutableMap<String, String> {
                val params = HashMap<String, String>()

                params["kisi_ad"] = alinanVeri
                params["kisi_tel"] = alinanVeri
                return params
            }
        }
        Volley.newRequestQueue(this@MainActivity).add(istek)
    }


    fun delete() {
        val veriOkucu: EditText = findViewById(R.id.veriOkuyucu)
        val alinanVeri = veriOkucu.text.toString()
        val sonuclarText: TextView = findViewById(R.id.sonuclarKismi)

        val url = "http://androideneme.tr.ht/dbconfig/delete_kisiler.php"
        val istek = object : StringRequest(Method.POST, url, Response.Listener { cevap ->
            sonuclarText.text = "Veri Basariyla Silindi"
        }, Response.ErrorListener { e -> e.printStackTrace() }) {
            override fun getParams(): MutableMap<String, String> {
                val params = HashMap<String, String>()
                params["kisi_id"] = alinanVeri
                return params
            }
        }
        Volley.newRequestQueue(this@MainActivity).add(istek)
    }

    fun tumKisiler() {
        val sonuclarText: TextView = findViewById(R.id.sonuclarKismi)

        val url = "http://androideneme.tr.ht/dbconfig/tum_kisiler.php"
        val istek = StringRequest(Request.Method.GET, url, { cevap ->
                sonuclarText.text = "Verileriniz Logcat`a yollanmistir."
            try {
                val jsonObject = JSONObject(cevap)
                val kisilerListe = jsonObject.getJSONArray("kisiler")

                for (i in 0 until kisilerListe.length()) {
                    val k = kisilerListe.getJSONObject(i)

                    val kisi_id = k.getInt("kisi_id")
                    val kisi_ad = k.getString("kisi_ad")
                    val kisi_tel = k.getString("kisi_tel")

                    Log.e("kisi_id", kisi_id.toString())
                    Log.e("kisi_ad", kisi_ad)
                    Log.e("kisi_tel", kisi_tel)
                    Log.e("*********", "**********")
                }
            } catch (e: JSONException) {
                e.printStackTrace()
            }
        }, { e -> e.printStackTrace() })
        Volley.newRequestQueue(this@MainActivity).add(istek)
    }
}
