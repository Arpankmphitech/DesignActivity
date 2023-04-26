package com.example.designactivity.fragment

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.example.designactivity.R
import com.example.designactivity.adapter.ViewPagerAdapter
import com.example.designactivity.databinding.FragmentWhatsappBinding
import androidx.fragment.app.Fragment as Fragment1


class WhatsappFragment : Fragment1() {

    lateinit var binding: FragmentWhatsappBinding
    private var list = arrayListOf("Images", "Videos")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWhatsappBinding.inflate(inflater, container, false)

        initView()

        return binding.root
    }

    private fun initView() {


        val adapter = ViewPagerAdapter(childFragmentManager)

        adapter?.addFragment(ImagesFragment(), "Image")
        adapter?.addFragment(VideosFragment(), "Video")
        binding.viwPager.adapter = adapter
        binding.tab.setupWithViewPager(binding.viwPager)

        binding.tab.getTabAt(0)!!.setIcon(R.drawable.images_icon)
        binding.tab.getTabAt(1)!!.setIcon(R.drawable.video_icon)

//
//        var viewPagerAdapter = ViewPagerAdapter(childFragmentManager)
//        binding.viwPager.setAdapter(viewPagerAdapter)
//        binding.tab.setupWithViewPager(binding.viwPager)

    }

}