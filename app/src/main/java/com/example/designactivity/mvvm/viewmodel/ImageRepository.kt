package com.example.designactivity.mvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.designactivity.mvvm.api.RetrofitAPI
import com.example.designactivity.mvvm.api.WallpaperResponse

class ImageRepository(private val retrofitAPI: RetrofitAPI) {

    private val imageLiveData = MutableLiveData<WallpaperResponse>()

    val data : LiveData<WallpaperResponse>
    get() = imageLiveData

    suspend fun getWallpaper() {
        val result = retrofitAPI.getWallpaper()
        if (result.body() != null) {

            imageLiveData.postValue(result.body())

        }
    }

}