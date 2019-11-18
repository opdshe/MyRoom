package com.example.myroom.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.myroom.R

class Frag_Gyeonggi(private val destination: String?, private val rushHour: Int?) : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_gyeonggi, container, false)
        val textView = view.findViewById(R.id.txt_test) as TextView
        textView.text = destination
        return view
    }
}
