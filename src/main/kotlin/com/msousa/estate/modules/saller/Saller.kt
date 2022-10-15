package com.msousa.estate.modules.saller

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "saller")
data class Saller(

    @Id
    @GeneratedValue
    @Column(name = "saller_id")
    val sallerId: UUID,

    @Column(name = "name")
    val name: String,

    @Column(name = "email")
    val email: String,

    @Column(name = "telephone_1")
    val telephone1: String,

    @Column(name = "telephone_2")
    val telephone2: String
)
