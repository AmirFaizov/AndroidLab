package com.example.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.databinding.FragmentBBinding

class Fragment_B : Fragment(R.layout.fragment_b) {
    private var _binding: FragmentBBinding? = null
    private val binding get() = _binding!!

    companion object {
        const val FIRST_FRAGMENT_TAG = "FIRST_FRAGMENT_TAG"
        fun getInstance(): Fragment_B = Fragment_B()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentBBinding.bind(view)
        with(binding) {
            val bundle = Bundle()
            button3.setOnClickListener{
                val count = editText.text
                bundle.putString("MyArg", count.toString())
                val screenFragment = Fragment_B2.getInstance()
                screenFragment.arguments = bundle
                findNavController().navigate(R.id.action_fragment_B_to_fragment_B2)
                parentFragmentManager
                    .beginTransaction()
                    .addToBackStack(null)
                    .replace(R.id.containerView, screenFragment)
                    .commit()


            }

        }
    }


}