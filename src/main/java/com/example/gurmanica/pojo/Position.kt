package com.example.gurmanica.pojo

import androidx.room.Entity
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "full_data")
class Position {
    @SerializedName("id")
    @Expose
    val id: String? = null
    @SerializedName ("name")
    @Expose
    val name: String? = null
    @SerializedName ("order")
    @Expose
    val order: Int? = null
    @SerializedName ("description")
    @Expose
    val description: String? = null
    @SerializedName ("weight")
    @Expose
    val weight: Int? = null
    @SerializedName ("fatAmount")
    @Expose
    val fatAmount: Int? = null
    @SerializedName ("proteinsAmount")
    @Expose
    val proteinsAmount: Int? = null
    @SerializedName ("carbohydratesAmount")
    @Expose
    val carbohydratesAmount: Int? = null
    @SerializedName ("energyAmount")
    @Expose
    val energyAmount: Int? = null
    @SerializedName ("cost")
    @Expose
    val cost: Int? = null
    @SerializedName ("image")
    @Expose
    val image: String? = null
    @SerializedName ("background")
    @Expose
    val background: String? = null
    @SerializedName ("backgroundId")
    @Expose
    val backgroundId: Int? = null
    @SerializedName ("transparent")
    @Expose
    val transparent: Any? = null
    @SerializedName ("transparentId")
    @Expose
    val transparentId: Any? = null
    @SerializedName ("fontColor")
    @Expose
    val fontColor: String? = null
    @SerializedName ("priceColor")
    @Expose
    val priceColor: String? = null
    @SerializedName ("priceBodyColor")
    @Expose
    val priceBodyColor: String? = null
    @SerializedName ("type")
    @Expose
    val type: String? = null
    @SerializedName ("tint")
    @Expose
    val tint: String? = null
    @SerializedName ("shadow")
    @Expose
    val shadow: Boolean? = null
    @SerializedName ("tags")
    @Expose
    val tags: String? = null
    @SerializedName ("maxAmount")
    @Expose
    val maxAmount: Int? = null


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

    fun getOrder(): Int? {
        return order
    }

    fun setOrder(order: Int?) {
        this.order = order
    }

    fun getDescription(): String? {
        return description
    }

    fun setDescription(description: String?) {
        this.description = description
    }

    fun getWeight(): Int? {
        return weight
    }

    fun setWeight(weight: Int?) {
        this.weight = weight
    }

    fun getFatAmount(): Int? {
        return fatAmount
    }

    fun setFatAmount(fatAmount: Int?) {
        this.fatAmount = fatAmount
    }

    fun getProteinsAmount(): Int? {
        return proteinsAmount
    }

    fun setProteinsAmount(proteinsAmount: Int?) {
        this.proteinsAmount = proteinsAmount
    }

    fun getCarbohydratesAmount(): Int? {
        return carbohydratesAmount
    }

    fun setCarbohydratesAmount(carbohydratesAmount: Int?) {
        this.carbohydratesAmount = carbohydratesAmount
    }

    fun getEnergyAmount(): Int? {
        return energyAmount
    }

    fun setEnergyAmount(energyAmount: Int?) {
        this.energyAmount = energyAmount
    }

    fun getCost(): Int? {
        return cost
    }

    fun setCost(cost: Int?) {
        this.cost = cost
    }

    fun getImage(): String? {
        return image
    }

    fun setImage(image: String?) {
        this.image = image
    }

    fun getBackground(): String? {
        return background
    }

    fun setBackground(background: String?) {
        this.background = background
    }

    fun getBackgroundId(): Int? {
        return backgroundId
    }

    fun setBackgroundId(backgroundId: Int?) {
        this.backgroundId = backgroundId
    }

    fun getTransparent(): Any? {
        return transparent
    }

    fun setTransparent(transparent: Any?) {
        this.transparent = transparent
    }

    fun getTransparentId(): Any? {
        return transparentId
    }

    fun setTransparentId(transparentId: Any?) {
        this.transparentId = transparentId
    }

    fun getFontColor(): String? {
        return fontColor
    }

    fun setFontColor(fontColor: String?) {
        this.fontColor = fontColor
    }

    fun getPriceColor(): String? {
        return priceColor
    }

    fun setPriceColor(priceColor: String?) {
        this.priceColor = priceColor
    }

    fun getPriceBodyColor(): String? {
        return priceBodyColor
    }

    fun setPriceBodyColor(priceBodyColor: String?) {
        this.priceBodyColor = priceBodyColor
    }

    fun getType(): String? {
        return type
    }

    fun setType(type: String?) {
        this.type = type
    }

    fun getTint(): String? {
        return tint
    }

    fun setTint(tint: String?) {
        this.tint = tint
    }

    fun getShadow(): Boolean? {
        return shadow
    }

    fun setShadow(shadow: Boolean?) {
        this.shadow = shadow
    }

    fun getTags(): String? {
        return tags
    }

    fun setTags(tags: String?) {
        this.tags = tags
    }

    fun getMaxAmount(): Int? {
        return maxAmount
    }

    fun setMaxAmount(maxAmount: Int?) {
        this.maxAmount = maxAmount
    }

     */
}