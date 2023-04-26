package com.example.designactivity.mvvm.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.designactivity.R
import com.example.designactivity.mvvm.api.ImageItem
import com.example.designactivity.mvvm.activity.ApiCallingActivity


class ResponseAdapter(var context: ApiCallingActivity, var image: List<ImageItem>) :
    RecyclerView.Adapter<ResponseAdapter.MyViewHolder>() {
    class MyViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val imageUrl = ItemView.findViewById<ImageView>(R.id.imgWallpaper)
        val created_at = ItemView.findViewById<TextView>(R.id.txt_created_at)
        val updated_at = ItemView.findViewById<TextView>(R.id.txt_updated_at)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.wallpaper_item, parent, false)

        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return image.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Glide.with(context).load(image[position].name?.toUri()?.buildUpon()?.scheme("https")?.build())
            .into(holder.imageUrl)

        holder.created_at.text = image[position].createdAt
        holder.updated_at.text = image[position].updatedAt

    }
}