package com.example.designactivity.activity

import android.content.Intent
import android.os.Build
import android.os.Build.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.designactivity.databinding.ActivityAllVideoDownloaderBinding

class AllVideoDownloaderActivity : AppCompatActivity() {

    lateinit var binding: ActivityAllVideoDownloaderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAllVideoDownloaderBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        getWindow().setFlags(
//            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
//            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
//        )

        initView()
    }

    private fun initView() {

        binding.layoutAllMedia.setOnClickListener {
            var intent = Intent(this, MediaDownloaderActivity::class.java)
            startActivity(intent)
        }

        binding.layoutMySaved.setOnClickListener {
            var intent = Intent(this, MySavedDownloadsActivity::class.java)
            startActivity(intent)
        }

        binding.imgBack.setOnClickListener {
            finish()
        }

    }
}