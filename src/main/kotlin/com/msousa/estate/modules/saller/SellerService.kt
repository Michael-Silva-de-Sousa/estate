package com.msousa.estate.modules.saller

import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.*

@Service
class SellerService(private val sellerRepository: SellerRepository) {

    fun findAll(): Flux<SellerDTO> {
        return sellerRepository.findAll().map { SellerDTO(it) }
    }

    fun findById(id: UUID): Mono<SellerDTO> {
        return sellerRepository.findById(id).map { SellerDTO(it) }
    }

    fun save(seller: Seller): Mono<SellerDTO> {
        return sellerRepository.save(seller)
            .map { SellerDTO(it) }
    }
}