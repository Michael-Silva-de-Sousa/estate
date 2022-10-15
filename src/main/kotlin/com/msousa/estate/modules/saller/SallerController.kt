package com.msousa.estate.modules.saller

import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.*

@RestController
@RequestMapping("/sellers")
class SallerController(val sellerRepository: SellerRepository) {

    @GetMapping
    fun findAll(): Flux<Seller> = sellerRepository.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: UUID): Mono<Seller> = sellerRepository.findById(id)

    @Transactional
    @PostMapping
    fun create(@RequestBody saller: Seller): Mono<Seller> = sellerRepository.save(saller)
}