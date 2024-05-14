package com.info.sayfalararasiveritasima.ContextOgreniyorum

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class ContextFragment:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Toast.makeText(activity,"MerhabaContextYazi", Toast.LENGTH_SHORT).show()

        return super.onCreateView(inflater, container, savedInstanceState)
    }
}