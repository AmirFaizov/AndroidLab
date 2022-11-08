package com.example.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.databinding.FragmentABinding

class Fragment_A : Fragment(R.layout.fragment_a) {
    private var _binding: FragmentABinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentABinding.bind(view)
        with(binding) {
            button1.setOnClickListener{
                findNavController().navigate(R.id.action_fragment_A_to_fragment_A2)
            }

        }

    }
}