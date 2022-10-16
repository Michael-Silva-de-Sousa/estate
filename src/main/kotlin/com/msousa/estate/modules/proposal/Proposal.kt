package com.msousa.estate.modules.proposal

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import java.time.LocalDateTime
import java.util.*

data class Proposal(

    @Id
    @Column("proposal_id")
    val proposalId: UUID? = null,

    @Column("price_offers")
    val priceOffers: Double,

    @Column("created_at")
    val createdAt: LocalDateTime
)
