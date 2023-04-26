package com.example.designactivity.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.designactivity.databinding.ActivityDashBordBinding
import com.example.designactivity.databinding.ActivityExitSplashScreenBinding

class ExitSplashScreenActivity : AppCompatActivity() {

    lateinit var binding: ActivityExitSplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExitSplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        initView()
    }


    private fun initView() {

        Handler(Looper.getMainLooper()).postDelayed({
            finishAffinity()
        }, 1000)

    }
}