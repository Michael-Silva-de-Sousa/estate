package com.msousa.estate.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.msousa.estate.enuns.SituationSaleType
import com.msousa.estate.modules.property.Property
import java.util.*

data class PropertyDTO(

    @JsonProperty("propertyId")
    val propertyId: UUID? = null,

    @JsonProperty("address")
    val address: String,

    @JsonProperty("description")
    val description: String,

    @JsonProperty("numberOffers")
    val numberOffers: Int,

    @JsonProperty("situationSale")
    val situationSale: SituationSaleType,

    @JsonProperty("area")
    val area: Double,

    @JsonProperty("price")
    val price: Double,

    @JsonProperty("seller_id")
    val sellerId: UUID,

    ) {
    constructor(property: Property) : this(
        property.propertyId,
        property.address,
        property.description,
        property.numberOffers,
        property.situationSale,
        property.area,
        property.price,
        property.sellerId
    )
}
