package com.example.designactivity.roomdatabase

import androidx.room.Entity
import com.example.designactivity.mvvm.api.ImageItem


@Entity(tableName = "image_data")
data class ImageEntity(
    val image: List<ImageItem>
)