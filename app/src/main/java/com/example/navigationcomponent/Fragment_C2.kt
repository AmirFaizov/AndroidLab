package com.example.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.core.view.isInvisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.databinding.FragmentC2Binding


class Fragment_C2 : Fragment(R.layout.fragment_c2) {
    private var _binding: FragmentC2Binding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentC2Binding.bind(view)
        (requireActivity() as? MainActivity)?.changeBottomNavigationVisibility(false)
        with(binding) {
            button5.setOnClickListener{
                findNavController().navigate(R.id.action_fragment_C2_to_fragment_C3)
            }

        }
    }
}