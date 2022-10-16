package com.msousa.estate.modules.saller

import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.*

@RestController
@RequestMapping("/sellers")
class SellerController(val sellerService: SellerService) {

    @GetMapping
    fun findAll(): Flux<Seller> = sellerService.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: UUID): Mono<Seller> = sellerService.findById(id)

    @Transactional
    @PostMapping
    fun create(@RequestBody seller: Seller): Mono<Seller> = sellerService.save(seller)
}