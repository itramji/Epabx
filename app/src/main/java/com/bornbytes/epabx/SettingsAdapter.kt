package com.bornbytes.epabx

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_home.view.*
import kotlinx.android.synthetic.main.item_settings.view.*

class SettingsAdapter(private val list: List<HomeDataItem>, private val onItemClick: (pos: Int) -> Unit) :
    RecyclerView.Adapter<SettingsAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_settings, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.settings_item_icon.setImageResource(list[position].resId)
        holder.itemView.settings_item_title.text = list[position].title
        if(position%2!=0) {
            holder.itemView.setBackgroundColor(holder.itemView.resources.getColor(R.color.colorAccentlight))
        }
        holder.itemView.setOnClickListener {
            onItemClick(position)
            Log.e("on", "item click")
        }
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}