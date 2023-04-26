package com.example.draglinearlayoutdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.example.draglinearlayoutdemo.databinding.ActivityMainBinding
import hotchemi.android.rate.AppRate


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        DarkMode()

        rateFeature()


    }

    private fun rateFeature() {

        AppRate.with(this)
            .setInstallDays(1)
            .setLaunchTimes(3)
            .setRemindInterval(1)
            .monitor();

        AppRate
            .showRateDialogIfMeetsConditions(this);
    }

    private fun DarkMode() {


        binding.switch1.setOnCheckedChangeListener { _, isChecked ->

            if (binding.switch1.isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                binding.switch1.text = "Disable dark mode"
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                binding.switch1.text = "Enable dark mode"
            }
        }

    }
}