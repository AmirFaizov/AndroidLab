package com.example.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.navigationcomponent.databinding.FragmentC3Binding

class Fragment_C3 : Fragment(R.layout.fragment_c3) {
    private var _binding: FragmentC3Binding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentC3Binding.bind(view)
        (requireActivity() as? MainActivity)?.changeBottomNavigationVisibility(true)
    }
}