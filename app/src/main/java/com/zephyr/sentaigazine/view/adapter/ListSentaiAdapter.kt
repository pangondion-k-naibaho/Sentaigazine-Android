package com.zephyr.sentaigazine.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.zephyr.sentaigazine.R
import com.zephyr.sentaigazine.databinding.ItemDataLayoutBinding
import com.zephyr.sentaigazine.model.Sentai

class ListSentaiAdapter(
    var data: ArrayList<Sentai>,
    private val listener: ItemListener
): RecyclerView.Adapter<ListSentaiAdapter.SentaiItemHolder>() {
    interface ItemListener{
        fun onItemClicked(item: Sentai)
    }

    inner class SentaiItemHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(item: Sentai, listener: ItemListener) = with(itemView){
            val binding = ItemDataLayoutBinding.bind(itemView)
            binding.apply {
                tvSentaiName.text = item.name
                tvRating.text = String.format(itemView.context.getString(R.string.tv_ItemRating), item.rating)
                tvYearProd.text = item.productionYear
                tvStory.text = item.detailStory

                ivSentai.background = ContextCompat.getDrawable(itemView.context, item.sentaiPhoto)

                setOnClickListener {
                    listener.onItemClicked(item)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SentaiItemHolder =
        SentaiItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_data_layout, parent, false))

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: SentaiItemHolder, position: Int) {
        holder.bind(data.get(position), listener)
    }
}