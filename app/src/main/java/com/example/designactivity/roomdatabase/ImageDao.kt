package com.example.designactivity.roomdatabase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ImageDao {
    @Insert
    suspend fun  addImage(data : List<ImageEntity>)

    @Query("SELECT * FROM image_data")
    suspend fun getImage() : List<ImageEntity>

}