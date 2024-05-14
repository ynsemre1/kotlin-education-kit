package com.info.androidcalismayapisi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //YONTEM1
    /* private lateinit var benimTextView : TextView
    private lateinit var benimButton : Button */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //YONTEM1 DEVAMI
        /* benimTextView = findViewById(R.id.benimTextView)
        benimButton = findViewById(R.id.benimButton)*/

        //YONTEM2
        /*val buton: Button = findViewById(R.id.benimButton) //YONTEM2
        val yazi: TextView = findViewById(R.id.benimTextView) //YONTEM2
        buton.setOnClickListener {
            yazi.text = "C animAnam"*/

        //YONTEM3
        /*benimButton.setOnClickListener {  //import kotlinx.android.synthetic.main.activity_main. import eder ve tasarim uzerinde ki tum nesnelere direk erisebiliriz.
            benimTextView.text = "BEDEL ODENDI!!"
        }*/

        buttonGoToA.setOnClickListener {
            val yeniIntent =
                Intent(this@MainActivity, Sayfa2::class.java) //Sayfaya gecis yapma kodu.
            startActivity(yeniIntent)
        }
    }

    override fun onBackPressed() {
        val yeniIntent = Intent(Intent.ACTION_MAIN)
        yeniIntent.addCategory(Intent.CATEGORY_HOME)
        yeniIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(yeniIntent)
    }


}

