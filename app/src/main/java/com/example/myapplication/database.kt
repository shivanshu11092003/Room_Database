package com.example.myapplication

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = [dataclass::class], version = 1)
abstract class database : RoomDatabase() {
    abstract fun studentdao():  DAO
    companion object {

        @Volatile
        private var INSTANCE: database? = null

        fun getDatabase(context: Context): database {

            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    database::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                return instance
            }


        }
    }
}