package com.example.gurmanica.database

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.gurmanica.pojo.Menu
import com.example.gurmanica.pojo.Position

@Database(entities = [Position::class], version = 1, exportSchema = false)
//@Database(entities = [Menu::class], version = 1, exportSchema = false)
abstract class AppDatabase() : RoomDatabase(), Parcelable {
    companion object {

        private var db: AppDatabase? = null
        private const val DB_NAME = "main.db"
        private val LOCK = Any()

        fun getInstance(context: Context): AppDatabase {
            synchronized(LOCK) {
                db?.let { return it }
                val instance =
                    Room.databaseBuilder(
                        context,
                        AppDatabase::class.java,
                        DB_NAME
                    ).build()
                db = instance
                return instance
            }
        }
    }

    constructor(parcel: Parcel) : this() {
    }

    abstract fun positionDao(): PositionDao
    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }
/*
    companion object CREATOR : Parcelable.Creator<AppDatabase> {
        override fun createFromParcel(parcel: Parcel): AppDatabase {
            return AppDatabase(parcel)
        }

        override fun newArray(size: Int): Array<AppDatabase?> {
            return arrayOfNulls(size)
        }
    }

 */
}