package com.bornbytes.epabx

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_home.view.*

class HomeAdapter(private val list: List<HomeDataItem>,private val onItemClick: (pos: Int) -> Unit) :
    RecyclerView.Adapter<HomeAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.home_item_icon.setImageResource(list[position].resId)
        holder.itemView.item_title.text = list[position].title
        holder.itemView.setOnClickListener {
            onItemClick(position)
            Log.e("on", "item click")
        }
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}