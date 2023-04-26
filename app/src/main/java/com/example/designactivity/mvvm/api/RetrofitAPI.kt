package com.example.designactivity.mvvm.api

import retrofit2.Response
import retrofit2.http.GET


interface RetrofitAPI {

    @GET("getwallpaper")

    suspend fun getWallpaper(): Response<WallpaperResponse>

}