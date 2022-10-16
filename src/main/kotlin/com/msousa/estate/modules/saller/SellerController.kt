package com.msousa.estate.modules.saller


import org.springframework.http.MediaType
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.*

@RestController
@RequestMapping("/sellers")
class SellerController(val sellerService: SellerService) {

    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun findAll(): Flux<SellerDTO> = sellerService.findAll()

    @GetMapping("/{id}", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun findById(@PathVariable id: UUID): Mono<SellerDTO> = sellerService.findById(id)

    @Transactional
    @PostMapping(
        produces = [MediaType.APPLICATION_JSON_VALUE],
        consumes = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun save(@RequestBody seller: Seller): Mono<SellerDTO> = sellerService.save(seller)
}