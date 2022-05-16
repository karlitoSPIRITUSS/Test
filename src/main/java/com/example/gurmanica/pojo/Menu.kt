package com.example.gurmanica.pojo

import androidx.room.Entity
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "abstract_data")
data class Menu (
    @SerializedName ("id")
    @Expose
    val id: String? = null,
    @SerializedName ("name")
    @Expose
    val name: String? = null,
    @SerializedName ("tint")
    @Expose
    val tint: String? = null,
    @SerializedName ("type")
    @Expose
    val type: String? = null,
    @SerializedName ("positions")
    @Expose
    val positions: List<Position> = ArrayList<Position>()

)

    /*
    fun getId(): String? {
        return id
    }

    fun setId(id: String?) {
        this.id = id
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getTint(): String? {
        return tint
    }

    fun setTint(tint: String?) {
        this.tint = tint
    }

    fun getType(): String? {
        return type
    }

    fun setType(type: String?) {
        this.type = type
    }

    fun getPositions(): List<Position>? {
        return positions
    }

    fun setPositions(positions: List<Position>) {
        this.positions = positions
    }

     */
