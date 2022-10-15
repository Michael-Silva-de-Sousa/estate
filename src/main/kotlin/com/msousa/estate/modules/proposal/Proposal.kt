package com.msousa.estate.modules.proposal

import com.msousa.estate.modules.buyer.Buyer
import com.msousa.estate.modules.property.Property
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "proposal")
data class Proposal(

    @Id
    @GeneratedValue
    @Column(name = "proposal_id")
    val proposalId: UUID,

    @ManyToOne
    @JoinColumn(name = "student_id")
    val property: Property,

    @ManyToOne
    @JoinColumn(name = "course_id")
    val buyer: Buyer,

    @Column(name = "price_offers")
    val priceOffers: Double,

    @Column(name = "created_at")
    val createdAt: LocalDateTime
)
