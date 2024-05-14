package com.example.ileriandroid_service_nonfications.Bildirim_DurumaBagli

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.NotificationCompat
import com.example.ileriandroid_service_nonfications.R

class DurumaBagliBildirim : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_duruma_bagli_bildirim)

        val bildirimYoneticisi =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val intent = Intent(this, DurumaBagliBildirim::class.java)
        val gidilecekIntent =
            PendingIntent.getActivity(this, 1, intent, PendingIntent.FLAG_UPDATE_CURRENT)

        val bildirimBut: Button = findViewById(R.id.bildirimBut)
        bildirimBut.setOnClickListener {

            val builder: NotificationCompat.Builder

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

                val kanalID = "kanalId"
                val kanalAD = "kanalAd"
                val kanalTanitim = "kanalTanitim"
                val kanalOnceligi = NotificationManager.IMPORTANCE_HIGH

                var kanal: NotificationChannel? = bildirimYoneticisi.getNotificationChannel(kanalID)
                if (kanal == null) {
                    kanal = NotificationChannel(kanalID, kanalAD, kanalOnceligi)
                    kanal.description = kanalTanitim
                    bildirimYoneticisi.createNotificationChannel(kanal)
                }
                builder = NotificationCompat.Builder(this, kanalID)
                builder
                    .setContentTitle("Baslik") //Bildirim basligi
                    .setContentText("Icerik") //Bildirim icerigi
                    .setSmallIcon(R.drawable.bildirimresim) //Bildirim iconu
                    .setContentIntent(gidilecekIntent) //Gidilecek activity intenti
                    .setAutoCancel(true) //Bildirime tiklayinca otomatik kaybolur
            } else {
                builder = NotificationCompat.Builder(this)
                builder
                    .setContentTitle("Baslik") //Bildirim basligi
                    .setContentText("Icerik") //Bildirim icerigi
                    .setSmallIcon(R.drawable.bildirimresim) //Bildirim iconu
                    .setContentIntent(gidilecekIntent) //Gidilecek activity intenti
                    .setAutoCancel(true) //Bildirime tiklayinca otomatik kaybolur
                    .priority = Notification.PRIORITY_HIGH //Oncelik belirleme

            }

            bildirimYoneticisi.notify(1, builder.build())

        }
    }
}