package com.msousa.estate.modules.property

import com.msousa.estate.dto.PropertyDTO
import com.msousa.estate.enuns.SituationSaleType
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import java.util.*

data class Property(

    @Id
    @Column("property_id")
    val propertyId: UUID? = null,

    @Column("address")
    val address: String,

    @Column("description")
    val description: String,

    @Column("number_of_offers")
    val numberOffers: Int,

    @Column("situation_sale")
    val situationSale: SituationSaleType,

    @Column("area")
    val area: Double,

    @Column("price")
    val price: Double,

    @Column("seller_id")
    val sellerId: UUID,
) {
    constructor(propertyDTO: PropertyDTO) : this(
        propertyDTO.propertyId,
        propertyDTO.address,
        propertyDTO.description,
        propertyDTO.numberOffers,
        propertyDTO.situationSale,
        propertyDTO.area,
        propertyDTO.price,
        propertyDTO.sellerId
    )
}