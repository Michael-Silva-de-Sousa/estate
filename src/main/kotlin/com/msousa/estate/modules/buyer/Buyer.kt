package com.msousa.estate.modules.buyer

import com.msousa.estate.modules.proposal.Proposal
import java.util.UUID
import javax.persistence.*

@Entity
@Table(name = "buyer")
data class Buyer(

    @Id
    @GeneratedValue
    @Column(name = "buyer_id")
    val buyerId: UUID,

    @Column(name = "name")
    val name: String,

    @Column(name = "cpf")
    val cpf: String,

    @Column(name = "email")
    val email: String,

    @Column(name = "telephone_1")
    val telephone1: String,

    @Column(name = "telephone_2")
    val telephone2: String,

    @OneToMany(mappedBy = "buyer")
    val proposals: Set<Proposal>
)