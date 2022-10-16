package com.msousa.estate.modules.buyer

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import java.util.*

data class Buyer(

    @Id
    @Column("buyer_id")
    val buyerId: UUID? = null,

    @Column("name")
    val name: String,

    @Column("cpf")
    val cpf: String,

    @Column("email")
    val email: String,

    @Column("telephone_1")
    val telephone1: String,

    @Column("telephone_2")
    val telephone2: String,
)