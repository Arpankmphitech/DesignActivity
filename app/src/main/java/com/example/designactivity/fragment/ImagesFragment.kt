package com.example.designactivity.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.designactivity.R
import com.example.designactivity.adapter.WaImageAdapter
import com.example.designactivity.databinding.FragmentImagesBinding
import com.example.designactivity.model.ImageModel

class ImagesFragment : Fragment() {

    lateinit var binding: FragmentImagesBinding
    val list: ArrayList<ImageModel> = ArrayList()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        binding = FragmentImagesBinding.inflate(inflater, container, false)

        initView()

        return binding.root

    }

    private fun initView() {

        list.add(ImageModel(R.drawable.a))
        list.add(ImageModel(R.drawable.b))
        list.add(ImageModel(R.drawable.c))
        list.add(ImageModel(R.drawable.d))
        list.add(ImageModel(R.drawable.e))
        list.add(ImageModel(R.drawable.f))
        list.add(ImageModel(R.drawable.g))
        list.add(ImageModel(R.drawable.h))
        list.add(ImageModel(R.drawable.i))
        list.add(ImageModel(R.drawable.j))

        val adapter = WaImageAdapter(context, list)
        binding.gridViewData.adapter = adapter


    }

}