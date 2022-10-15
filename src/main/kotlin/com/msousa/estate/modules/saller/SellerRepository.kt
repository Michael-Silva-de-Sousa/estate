package com.msousa.estate.modules.saller

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import java.util.UUID

interface SellerRepository: ReactiveCrudRepository<Seller, UUID> {
}