package com.info.sayfalararasiveritasima.FragmentOgreniyorum

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.info.sayfalararasiveritasima.R
import kotlinx.android.synthetic.main.fragmentikinci.view.*

class FragmentIkinci : Fragment( ) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView2 = inflater.inflate(R.layout.fragmentikinci,container,false)
        rootView2.button3.setOnClickListener {
            rootView2.buttonatiklayincagelcek.text = "GuzelOlduGibi"
        }

        return rootView2
    }
}