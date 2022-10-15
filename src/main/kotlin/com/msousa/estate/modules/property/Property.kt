package com.msousa.estate.modules.property

import com.msousa.estate.enuns.SituationSaleType
import com.msousa.estate.modules.proposal.Proposal
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import java.util.*

data class Property(

    @Id
    @Column("property_id")
    val propertyId: UUID,

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
)