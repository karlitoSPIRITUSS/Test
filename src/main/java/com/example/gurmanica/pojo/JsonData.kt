package com.example.gurmanica.pojo

import com.google.gson.JsonObject
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class JsonData (
    @SerializedName ("jsonData")
    @Expose
    val dataJsonObject: JsonObject? = null


    )

