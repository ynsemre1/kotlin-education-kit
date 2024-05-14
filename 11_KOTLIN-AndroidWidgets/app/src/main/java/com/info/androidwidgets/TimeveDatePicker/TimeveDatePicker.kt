package com.info.androidwidgets.TimeveDatePicker

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.info.androidwidgets.R
import java.util.*

class TimeveDatePicker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timeve_date_picker)

        val datePickerText: EditText = findViewById(R.id.datePickerText)
        val timePickerText: EditText = findViewById(R.id.timePickerText)

        timePickerText.setOnClickListener {
            val calendar =
                Calendar.getInstance() //Bunun Sayesinde Telefonda ki Saat ve Dakikaya erisip onu aliyoruz.
            val time = calendar.get(Calendar.HOUR_OF_DAY) //24 saat dilimde
            val minute = calendar.get(Calendar.MINUTE)// Dakikayi aldik.

            val timePicker = TimePickerDialog(
                this@TimeveDatePicker,
                TimePickerDialog.OnTimeSetListener { gorunus, saat, dk ->
                    timePickerText.setText("$saat : $dk")
                },
                time,
                minute,
                true,
            )

            timePicker.setTitle("Saat Seciniz")
            timePicker.setButton(DialogInterface.BUTTON_POSITIVE, "AYARLA", timePicker)
            timePicker.setButton(DialogInterface.BUTTON_NEGATIVE, "IPTAL", timePicker)
            timePicker.show()
        }

        datePickerText.setOnClickListener {
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            val datePicker = DatePickerDialog(
                this@TimeveDatePicker,
                DatePickerDialog.OnDateSetListener { gorunus, yil, ay, gun ->
                    datePickerText.setText("$gun/${ay + 1}/${yil}")
                },
                year,
                month,
                day
            )
            datePicker.setTitle("Saat Seciniz")
            datePicker.setButton(DialogInterface.BUTTON_POSITIVE, "AYARLA", datePicker)
            datePicker.setButton(DialogInterface.BUTTON_NEGATIVE, "IPTAL", datePicker)
            datePicker.show()
        }

    }
}