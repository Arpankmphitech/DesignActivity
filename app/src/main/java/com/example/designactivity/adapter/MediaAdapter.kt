package com.example.designactivity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.designactivity.R
import com.example.designactivity.model.MediaModel


class MediaAdapter(
    var list: ArrayList<MediaModel>, val onItemClicked: (String) -> Unit
) : RecyclerView.Adapter<MediaAdapter.MyViewHolder>() {

    class MyViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val appIcon = ItemView.findViewById<ImageView>(R.id.imgIcon)
        val appName = ItemView.findViewById<TextView>(R.id.txtAppName)
        val layout = ItemView.findViewById<RelativeLayout>(R.id.relativeBackground)
        val next = ItemView.findViewById<ImageView>(R.id.imgNext)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.media_item, parent, false)

        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.appIcon.setImageResource(list[position].icon)
        holder.appName.text = list[position].name
        holder.layout.setBackgroundResource(list[position].back)

        holder.layout.setOnClickListener {
            var applicationName = list[position].name
            onItemClicked.invoke(applicationName)

        }

    }
}