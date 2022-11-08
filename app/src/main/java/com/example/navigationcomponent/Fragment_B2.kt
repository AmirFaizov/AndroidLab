package com.example.navigationcomponent

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.navigationcomponent.databinding.FragmentB2Binding

class Fragment_B2 : Fragment(R.layout.fragment_b2) {
    private var _binding: FragmentB2Binding? = null
    private val binding get() = _binding!!

    companion object {
        const val FIRST_FRAGMENT_TAG = "FIRST_FRAGMENT_TAG"
        fun getInstance(): Fragment_B2 = Fragment_B2()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentB2Binding.bind(view)
        val textf = arguments?.getString("MyArg")
        with(binding){
            textView6.text = textf
        }
    }
}