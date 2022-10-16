package com.msousa.estate.modules.saller

import com.fasterxml.jackson.annotation.JsonProperty
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
    val telephone2: String?
) {
    constructor(seller: Seller) : this(
        seller.sellerId,
        seller.name,
        seller.email,
        seller.telephone1,
        seller.telephone2
    )
}
