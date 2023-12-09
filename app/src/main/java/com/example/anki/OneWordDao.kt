package com.example.anki

import androidx.room.Dao
import androidx.room.Query

@Dao
interface OneWordDao {

    @Query("SELECT * FROM 'temp'")
    suspend fun getAll(): List<OneWord>
}