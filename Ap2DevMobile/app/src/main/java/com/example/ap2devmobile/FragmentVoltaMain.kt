package com.example.ap2devmobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FragmentVoltaMain : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_volta_main, container, false)

        val button: Button = view.findViewById(R.id.BotaoVoltar)
        button.setOnClickListener {
            activity?.finish()
        }

        return view
    }
}