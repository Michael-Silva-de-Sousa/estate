package com.msousa.estate.modules.saller

import com.msousa.estate.modules.property.Property
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import java.util.*

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
    val telephone2: String?,

    @Transient
    val properties: List<Property> = emptyList()
)
