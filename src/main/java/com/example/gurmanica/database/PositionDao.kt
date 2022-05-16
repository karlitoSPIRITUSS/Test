package com.example.gurmanica.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.gurmanica.pojo.Menu
import com.example.gurmanica.pojo.Position

@Dao
interface PositionDao {
    @Query("SELECT * FROM full_data")
    fun getPositionList(): LiveData<List<Position>>

    @Query("SELECT * FROM abstract_data")
    fun getMenuList(): LiveData<Menu>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPositionList(priceList: List<Position>)
}