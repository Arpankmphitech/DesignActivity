package com.example.designactivity.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.designactivity.R
import com.example.designactivity.adapter.MediaAdapter
import com.example.designactivity.databinding.ActivityMediaDownloaderBinding
import com.example.designactivity.model.MediaModel

class MediaDownloaderActivity : AppCompatActivity() {

    lateinit var binding: ActivityMediaDownloaderBinding
    val list = ArrayList<MediaModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMediaDownloaderBinding.inflate(layoutInflater)
        setContentView(binding.root)

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

        binding.rcvMediaItem.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        list.add(MediaModel("WhatsApp", R.drawable.whatsapp_icon, R.drawable.whatsapp_back))
        list.add(
            MediaModel(
                "WA Business",
                R.drawable.wa_business_icon,
                R.drawable.wa_business_back
            )
        )
        list.add(MediaModel("Twitter", R.drawable.twitter_icon, R.drawable.twitter_back))
        list.add(MediaModel("Josh", R.drawable.josh_icon, R.drawable.josh_back))
        list.add(MediaModel("Chingari", R.drawable.chingari_icon, R.drawable.chingari_back))
        list.add(MediaModel("Vimeo", R.drawable.vimeo_icon, R.drawable.vimeo_back))
        list.add(MediaModel("Rizzle", R.drawable.rizzle_icon, R.drawable.rizzle_back))
        list.add(MediaModel("Imgur", R.drawable.imgur_icon, R.drawable.imgur_back))
        list.add(MediaModel("Tiki", R.drawable.tiki_icon, R.drawable.tiki_back))

        val adapter = MediaAdapter(list) { applicationName ->

            var intent = Intent(this, AllAppActivty::class.java)
            intent.putExtra("Name",applicationName)
            startActivity(intent)

        }
        binding.rcvMediaItem.adapter = adapter


    }
}