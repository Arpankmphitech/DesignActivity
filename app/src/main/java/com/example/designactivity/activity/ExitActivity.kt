package com.example.designactivity.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.designactivity.databinding.ActivityExitBinding

class ExitActivity : AppCompatActivity() {

    lateinit var binding: ActivityExitBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExitBinding.inflate(layoutInflater)
        setContentView(binding.root)


        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        initView()

    }

    private fun initView() {

        binding.layoutNo.setOnClickListener {
            onBackPressed()
            finish()
        }

        binding.layoutYes.setOnClickListener {

            val intent = Intent(this, ExitSplashScreenActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}