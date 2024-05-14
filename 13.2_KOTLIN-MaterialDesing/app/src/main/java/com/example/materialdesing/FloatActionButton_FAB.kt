package com.example.materialdesing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FloatActionButton_FAB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_float_action_button_fab)

        val fab:FloatingActionButton=findViewById(R.id.floatingActionButton)
        fab.setOnClickListener {
            Toast.makeText(applicationContext, "Calismiyor amk", Toast.LENGTH_SHORT)
                .show()
        }

    }
}