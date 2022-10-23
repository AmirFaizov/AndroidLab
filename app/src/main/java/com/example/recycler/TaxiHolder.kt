package com.example.recycler

import android.graphics.drawable.Drawable
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.example.recycler.databinding.TaxiItemBinding
import com.example.recycler.repository.Taxi

class TaxiHolder(
    private val binding: TaxiItemBinding,
    val onItemClick: (Int) -> Unit,
    private val glide: RequestManager,
) : RecyclerView.ViewHolder(binding.layoutItem) {

    init {
        with(binding) {
            root.setOnClickListener {
                onItemClick(adapterPosition)
            }
        }
    }

    fun bind(taxi: Taxi) {

        with(binding) {
            tvTaxiName.text = taxi.name
            this.taxi = taxi

            if (taxi.colorID != 0) {
                layoutItem.setBackgroundColor(
                    ContextCompat.getColor(
                        root.context,
                        taxi.colorID
                    )
                )
            }


            glide
                .load(taxi.imageUrl)
                .listener(object:RequestListener<Drawable> {
                    override fun onLoadFailed(
                        e: GlideException?,
                        model: Any?,
                        target: Target<Drawable>?,
                        isFirstResource: Boolean
                    ): Boolean {

                        return false
                    }

                    override fun onResourceReady(
                        resource: Drawable?,
                        model: Any?,
                        target: Target<Drawable>?,
                        dataSource: DataSource?,
                        isFirstResource: Boolean
                    ): Boolean {
                        progressCircular.visibility = ViewGroup.INVISIBLE
                        return false
                    }

                } )

                .into(ivTaxi)
        }
    }
}