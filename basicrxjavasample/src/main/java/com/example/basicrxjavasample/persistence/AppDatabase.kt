package com.example.basicrxjavasample.persistence

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(User::class),version = 1)
abstract class AppDatabase:RoomDatabase(){




    companion object{






    }
}