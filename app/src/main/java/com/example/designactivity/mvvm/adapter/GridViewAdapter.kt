package com.example.designactivity.mvvm.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import com.bumptech.glide.Glide
import com.example.designactivity.R
import com.example.designactivity.mvvm.api.ImageItem

internal class GridViewAdapter(
    private val imageItem: List<ImageItem>,
    private val context: Context?
) :
    BaseAdapter() {
    private var layoutInflater: LayoutInflater? = null
    private lateinit var imageUrl: ImageView
    private lateinit var created_at: TextView
    private lateinit var updated_at: TextView

    override fun getCount(): Int {
        return imageItem.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var convertView = convertView
        if (layoutInflater == null) {
            layoutInflater =
                context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        if (convertView == null) {
            convertView = layoutInflater!!.inflate(R.layout.wallpaper_item, null)
        }
        imageUrl = convertView!!.findViewById(R.id.imgWallpaper)
        created_at = convertView.findViewById(R.id.txt_created_at)
        updated_at = convertView.findViewById(R.id.txt_updated_at)

        Glide.with(context!!)
            .load(imageItem.get(position).name?.toUri()?.buildUpon()?.scheme("https")?.build())
            .into(imageUrl)

        created_at.setText(imageItem.get(position).createdAt)
        updated_at.setText(imageItem.get(position).updatedAt)
        return convertView
    }
}