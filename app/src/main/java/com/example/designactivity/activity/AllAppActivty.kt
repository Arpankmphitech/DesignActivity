package com.example.designactivity.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.designactivity.adapter.AllScreenViewPagerAdapter
import com.example.designactivity.databinding.ActivityAllAppBinding

class AllAppActivty : AppCompatActivity() {

    lateinit var binding: ActivityAllAppBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAllAppBinding.inflate(layoutInflater)
        setContentView(binding.root)
//
//        getWindow().setFlags(
//            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
//            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
//        )

        initView()

    }

    private fun initView() {

        binding.imgBack.setOnClickListener {
            finish()
        }

        val appName = intent.getStringExtra("Name")

        binding.txtApplicationName.setText(appName)

        setFragment(appName)
    }

    private fun setFragment(appName: String?) {
        var allScreenViewPagerAdapter = AllScreenViewPagerAdapter(getSupportFragmentManager(),appName)
        binding.viwPager.setAdapter(allScreenViewPagerAdapter)
    }
}