package com.msousa.estate.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.msousa.estate.modules.saller.Seller
import java.util.*

data class SellerDTO(

    @JsonProperty("sellerId")
    val sellerId: UUID?,

    @JsonProperty("name")
    val name: String,

    @JsonProperty("email")
    val email: String,

    @JsonProperty("telephone1")
    val telephone1: String,

    @JsonProperty("telephone2")
    val telephone2: String?,

    @JsonProperty("properties")
    val properties: List<PropertyDTO>
) {
    constructor(seller: Seller, properties: List<PropertyDTO>) : this(
        seller.sellerId,
        seller.name,
        seller.email,
        seller.telephone1,
        seller.telephone2,
        properties
    )
}
