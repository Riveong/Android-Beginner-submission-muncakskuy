package com.dicoding.submission

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListMountAdapter(private val listMount: ArrayList<Mount>) : RecyclerView.Adapter<ListMountAdapter.ListViewHolder>(){
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto:ImageView = itemView.findViewById(R.id.img_item_photo)
        val tvName:TextView = itemView.findViewById(R.id.tv_item_name)
        val tvDesc:TextView = itemView.findViewById(R.id.tv_item_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_mount, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listMount.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name,desc, photo) = listMount[position]
        holder.imgPhoto.setImageResource(photo)
        holder.tvName.text = name
        holder.tvDesc.text = desc
    }


}