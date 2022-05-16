package com.example.gurmanica.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Datum (

    @SerializedName ("Position")
    @Expose
    val position: Position? = null

)


    /*
    fun getMenu(): List<Menu>? {
        return menu
    }

    fun setMenu(menu: List<Menu>) {
        this.menu = menu
    }

    fun getMaxCutlery(): Int? {
        return maxCutlery
    }

    fun setMaxCutlery(maxCutlery: Int?) {
        this.maxCutlery = maxCutlery
    }

     */

