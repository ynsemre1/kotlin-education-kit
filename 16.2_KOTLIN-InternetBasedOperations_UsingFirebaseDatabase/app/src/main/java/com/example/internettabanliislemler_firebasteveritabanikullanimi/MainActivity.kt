package com.example.internettabanliislemler_firebasteveritabanikullanimi

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextKisiAd: EditText = findViewById(R.id.editKisiAd)
        val alinanVeriKisiAd = editTextKisiAd.text

        val butInsert: Button = findViewById(R.id.butInsert)
        val butDelete: Button = findViewById(R.id.butDelete)
        val butUpdate: Button = findViewById(R.id.butUpdate)
        val butVeriOkuma: Button = findViewById(R.id.butVeriOkuma)
        val butVeriSorgu: Button = findViewById(R.id.butVeriSorgu)

        val database = FirebaseDatabase.getInstance()
        val refKisiler = database.getReference("kisiler")

        butInsert.setOnClickListener {
            //Eklenicek Veri Bilgileri
            val kisi = Kisiler(alinanVeriKisiAd.toString(), 20)

            //Veri Ekleme
            refKisiler.push().setValue(kisi)
        }



        butDelete.setOnClickListener {
            //Veri Silme
            refKisiler.child("-MigoFSHPE2nY6v-wPHg")
                .removeValue() //Verinin Firebase uzerinde ki keyi ile silme islemi gerceklesiyor.
        }


        butUpdate.setOnClickListener {//
            // Veri Guncelleme
            val updateInfo = HashMap<String, Any>()
            updateInfo["kisi_ad"] = alinanVeriKisiAd.toString()
            updateInfo["kisi_yas"] = 20
            refKisiler.child("-Migo78CrDZVRHrM8Bhp")
                .updateChildren(updateInfo) //Verinin Firebase uzerinde ki keyi ile guncelleme gerceklesiyor.
        }

        butVeriOkuma.setOnClickListener {
            Toast.makeText(this,"Veriler Logcat'e yollanmistir",Toast.LENGTH_SHORT).show()
            //Veri Okuma
            refKisiler.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    for (p in snapshot.children) {
                        val kisi = p.getValue(Kisiler::class.java)

                        if (kisi != null) {
                            val key = p.key //Veri Tabanimizdaki Keyi Alir EX: -MigKehRtKSpL9kAbF0l

                            Log.e("*******", "*******")
                            Log.e("KisiKey", key.toString())
                            Log.e("KisiAd", kisi.kisi_ad.toString())
                            Log.e("KisiYas", kisi.kisi_yas.toString())
                            Log.e("*******", "*******")
                        }
                    }
                }
                override fun onCancelled(error: DatabaseError) {
                }
            })
        }

        butVeriSorgu.setOnClickListener{
            Toast.makeText(this,"Veriler Logcat'e yollanmistir",Toast.LENGTH_SHORT).show()

            val sorgu = refKisiler.orderByChild("kisi_ad").equalTo("Ahmet") // Kelime ile sorgu Yapma
            val sorgu2 = refKisiler.limitToFirst(2) //Ilk 2 veriyi sorgulama
            val sorgu3 = refKisiler.limitToLast(2) //Son 2 veriyi sorgulama
            val sorgu4 = refKisiler.orderByChild("kisi_yas").startAt(10.0).endAt(50.00) //kisi_yas verisinde aralik belirterek sorgu yapma


            //Veri Okuma
            sorgu3.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    for (p in snapshot.children) {
                        val kisi = p.getValue(Kisiler::class.java)

                        if (kisi != null) {
                            val key = p.key //Veri Tabanimizdaki Keyi Alir EX: -MigKehRtKSpL9kAbF0l

                            Log.e("*******", "*******")
                            Log.e("KisiKey", key.toString())
                            Log.e("KisiAd", kisi.kisi_ad.toString())
                            Log.e("KisiYas", kisi.kisi_yas.toString())
                            Log.e("*******", "*******")
                        }
                    }
                }
                override fun onCancelled(error: DatabaseError) {
                }
            })
        }
    }
}