package com.msousa.estate.modules.property

import com.msousa.estate.enuns.SituationSaleType
import com.msousa.estate.modules.proposal.Proposal
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "property")
data class Property(

    @Id
    @GeneratedValue
    @Column(name = "property_id")
    val propertyId: UUID,

    @Column(name = "address")
    val address: String,

    @Column(name = "description")
    val description: String,

    @Column(name = "number_of_offers")
    val numberOffers: Int,

    @Enumerated(value = EnumType.STRING)
    @Column(name = "situation_sale")
    val situationSale: SituationSaleType,

    @Column(name = "area")
    val area: Double,

    @Column(name = "price")
    val price: Double,

    @OneToMany(mappedBy = "property")
    val proposals: Set<Proposal>
)