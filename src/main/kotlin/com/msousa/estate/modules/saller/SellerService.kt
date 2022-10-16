package com.msousa.estate.modules.saller

import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.*

@Service
class SellerService(private val sellerRepository: SellerRepository) {

    fun findAll(): Flux<Seller> = sellerRepository.findAll()

    fun findById(id: UUID): Mono<Seller> = sellerRepository.findById(id)

    fun save(seller: Seller): Mono<Seller> = sellerRepository.save(seller)
}