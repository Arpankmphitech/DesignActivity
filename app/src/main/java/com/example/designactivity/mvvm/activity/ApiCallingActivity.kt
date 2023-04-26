package com.example.designactivity.mvvm.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.designactivity.databinding.ActivityApiCallingBinding
import com.example.designactivity.mvvm.viewmodel.ImageRepository
import com.example.designactivity.mvvm.adapter.GridViewAdapter
import com.example.designactivity.mvvm.api.RetrofitAPI
import com.example.designactivity.mvvm.api.RetrofitHelper
import com.example.designactivity.mvvm.viewmodel.MainViewModel
import com.example.designactivity.mvvm.viewmodel.MainViewModelFactory
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class ApiCallingActivity : AppCompatActivity() {

    lateinit var binding: ActivityApiCallingBinding
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApiCallingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mvvm()

//        gridView()

//        initView()
    }

    private fun mvvm() {

        val retrofitAPI = RetrofitHelper.getInstance().create(RetrofitAPI::class.java)
        val repository = ImageRepository(retrofitAPI)

        mainViewModel =
            ViewModelProvider(this, MainViewModelFactory(repository)).get(MainViewModel::class.java)

        mainViewModel.data.observe(this, Observer {

            if (it.result!!.equals(true)) {
                runOnUiThread {
                    val courseAdapter =
                        GridViewAdapter(it.image, this@ApiCallingActivity)
                    binding.gridViewItem.adapter = courseAdapter
                }
            }

        })

    }

    private fun gridView() {

        val retrofitAPI = RetrofitHelper.getInstance().create(RetrofitAPI::class.java)
        GlobalScope.launch {
            val result = retrofitAPI.getWallpaper()
            runOnUiThread {
                val courseAdapter =
                    GridViewAdapter(result.body()!!.image, this@ApiCallingActivity)
                Log.e("12/04", result.body().toString())
                binding.gridViewItem.adapter = courseAdapter
            }
        }


    }

//    private fun initView() {
//
//
//        binding.rvMovies.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
//
//
//        val retrofitAPI = RetrofitHelper.getInstance().create(RetrofitAPI::class.java)
//        GlobalScope.launch {
//            val result = retrofitAPI.getWallpaper()
//            var adapter: ResponseAdapter
//            runOnUiThread {
//                adapter = ResponseAdapter(this@ApiCallingActivity,result.body()!!.image)
//                Log.e("12/04", result.body().toString())
//                binding.rvMovies.adapter = adapter
//            }
//
//        }
//
//
//    }
}