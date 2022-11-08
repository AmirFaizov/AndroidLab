package com.example.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.databinding.FragmentCBinding

class Fragment_C : Fragment(R.layout.fragment_c) {
    private var _binding: FragmentCBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentCBinding.bind(view)
        (requireActivity() as? MainActivity)?.changeBottomNavigationVisibility(true)
        with(binding) {
            button4.setOnClickListener{
                findNavController().navigate(R.id.action_fragment_C_to_fragment_C2)
            }
        }

    }
}