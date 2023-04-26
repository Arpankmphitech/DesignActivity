package com.example.designactivity.mvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.designactivity.mvvm.api.WallpaperResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val imageRepository: ImageRepository) : ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO) {

            imageRepository.getWallpaper()

        }
    }

    val data : LiveData<WallpaperResponse>
    get() = imageRepository.data

}