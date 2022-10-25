package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class InfoAdapter0: RecyclerView.Adapter<InfoAdapter0.ViewHolder>(){ class ViewHolder( view: View) : RecyclerView.ViewHolder(view){
    val infoImage=view.findViewById<ImageView>(R.id.image_item_info)
    val infoText= view.findViewById<TextView>(R.id.text_item_info)
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater
            .from (parent.context)
            .inflate(R.layout.item_info,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    override fun getItemCount(): Int = 6
}