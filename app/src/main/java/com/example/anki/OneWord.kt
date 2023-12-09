package com.example.anki

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "temp")
data class OneWord (
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "word") val word: String,
    @ColumnInfo(name = "datas") val  name: String,
    @ColumnInfo(name = "actual") val actual: Int,
    @ColumnInfo(name = "delete") val delete: Int
)