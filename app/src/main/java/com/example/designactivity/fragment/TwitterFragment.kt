package com.example.designactivity.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.designactivity.R
import com.example.designactivity.databinding.FragmentTikiBinding
import com.example.designactivity.databinding.FragmentTwitterBinding

class TwitterFragment : Fragment() {

    lateinit var binding : FragmentTwitterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTwitterBinding.inflate(inflater, container, false)

        initView()

        return binding.root
    }

    private fun initView() {

    }

}