package com.example.basicrxjavasample.persistence

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

/**
 * 表实体类
 */
@Entity(tableName = "USERS")
data class User(@PrimaryKey @ColumnInfo(name="userid")
                val id:String = UUID.randomUUID().toString(),
                @ColumnInfo(name="username") val userName:String)