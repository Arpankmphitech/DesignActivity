package com.example.designactivity.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import com.example.designactivity.R
import com.example.designactivity.model.ImageModel

class WaImageAdapter(context: Context?, var list: ArrayList<ImageModel>) :
    ArrayAdapter<ImageModel>(context!!, 0, list) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var listitemView = convertView
        if (listitemView == null) {

            listitemView = LayoutInflater.from(context).inflate(R.layout.image_item, parent, false)
        }

        val courseIV = listitemView!!.findViewById<ImageView>(R.id.imgWhatsappImage)
        courseIV.setImageResource(list[position].img)

        return listitemView
    }
}