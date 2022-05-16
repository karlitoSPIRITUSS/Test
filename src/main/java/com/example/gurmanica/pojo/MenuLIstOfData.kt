package com.example.gurmanica.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MenuLIstOfData (
    @SerializedName("data")
    @Expose
    val data: List<Datum>? = null

)