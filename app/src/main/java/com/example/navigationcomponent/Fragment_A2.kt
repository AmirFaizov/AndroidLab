package com.example.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.databinding.FragmentA2Binding

class Fragment_A2 : Fragment(R.layout.fragment_a2) {
    private var _binding: FragmentA2Binding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentA2Binding.bind(view)
        with(binding) {
            button2.setOnClickListener{
                findNavController().navigate(R.id.action_fragment_A2_to_fragment_A3)
            }
        }

    }
}