package com.msousa.estate.modules.saller

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import java.util.*
import javax.annotation.Generated

data class Seller(

    @Id
    @Column("seller_id")
    var sellerId: UUID? = null,

    @Column("name")
    val name: String,

    @Column("email")
    val email: String,

    @Column("telephone_1")
    val telephone1: String,

    @Column("telephone_2")
    val telephone2: String?
)
