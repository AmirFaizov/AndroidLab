package com.example.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.recycler.databinding.TaxiItemBinding
import com.example.recycler.repository.Taxi


class TaxiAdapter(
    val listOfTaxis: List<Taxi>,
    private val glide: RequestManager,
    private val onItemClick: (Int) -> Unit,
) : RecyclerView.Adapter<TaxiHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaxiHolder =
        TaxiHolder(
            TaxiItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            ),
            onItemClick = onItemClick,
            glide = glide
        )

    override fun onBindViewHolder(holder: TaxiHolder, position: Int) {
        holder.bind(listOfTaxis[position])
    }
    override fun getItemCount(): Int = listOfTaxis.size

}