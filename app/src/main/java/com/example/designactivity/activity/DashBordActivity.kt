package com.example.designactivity.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import com.example.designactivity.databinding.ActivityDashBordBinding

class DashBordActivity : AppCompatActivity() {

    lateinit var binding: ActivityDashBordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashBordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        initView()
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
//                    Toast.makeText(this@DashBordActivity, "click button", Toast.LENGTH_SHORT).show()
                intentFunction()
            }
        })
    }

    private fun intentFunction() {

        var inte = Intent(this, ExitActivity::class.java)
        startActivity(inte)
    }


    private fun initView() {
        binding.imgAllVideoDownloader.setOnClickListener {

            var intent = Intent(this, AllVideoDownloaderActivity::class.java)
            startActivity(intent)

        }
    }


}