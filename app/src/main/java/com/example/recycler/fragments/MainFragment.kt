package com.example.recycler.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.recycler.TaxiAdapter
import com.example.recycler.R
import com.example.recycler.databinding.FragmentMainBinding
import com.example.recycler.repository.Taxists


class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding by lazy { _binding!! }

    private val containerID = R.id.container

    private lateinit var adapter: TaxiAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = FragmentMainBinding.inflate(layoutInflater)
        initRecyclerView()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    private fun initRecyclerView() {
        with(binding) {
            adapter = TaxiAdapter(
                listOfTaxis = Taxists.listOfTaxis,
                glide = Glide.with(binding.root.context),
                onItemClick = ::onPlantItemWasClicked
            )

            rvTaxi.adapter = adapter

        }
    }


    private fun onPlantItemWasClicked(itemPosition: Int) {

        Taxists.listOfTaxis[itemPosition].colorID = R.color.teal_200

        adapter.notifyItemChanged(itemPosition)


        parentFragmentManager.beginTransaction()
            .setCustomAnimations(
                androidx.appcompat.R.anim.abc_slide_in_top,
                androidx.appcompat.R.anim.abc_fade_out,
                androidx.appcompat.R.anim.abc_fade_in,
                androidx.appcompat.R.anim.abc_slide_out_top
            )
            .replace(
                containerID,
                DescriptionFragment.newInstance(itemPosition = itemPosition),
                DescriptionFragment.DESCRIPTION_FRAGMENT_TAG
            )
            .addToBackStack(null)
            .commit()
    }

    companion object {
        const val MAIN_FRAGMENT_TAG = "MAIN_FRAGMENT_TAG"
        fun newInstance(bundle: Bundle) =
            MainFragment().apply {
                arguments = Bundle().apply {
                    putAll(bundle)
                }
            }
    }
}
