package com.example.ileriandroid_service_nonfications.BroadCastReceiver_SMSYakalama

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.telephony.SmsMessage
import android.widget.Toast

class SMSYakalayici : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        val sms = intent?.extras

        if (sms != null) {
            val pdusObj = sms.get("pdus") as Array<*>
            for (i in pdusObj.indices) { // "indicies" komutu bize pdusObj elemanlarin kactan baslayip kacta bitcegini bize veriyor.
                val guncelMesaj: SmsMessage

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    val format = sms.getString("format")
                    guncelMesaj = SmsMessage
                        .createFromPdu(pdusObj[i] as ByteArray, format)
                } else {
                    guncelMesaj = SmsMessage.createFromPdu(pdusObj[i] as ByteArray)
                }

                val telNo = guncelMesaj.displayOriginatingAddress
                val mesaj = guncelMesaj.displayMessageBody

                Toast.makeText(context, "$telNo - $mesaj", Toast.LENGTH_SHORT)
                    .show()

            }
        }
    }
}