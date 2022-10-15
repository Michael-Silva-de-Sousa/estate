package com.msousa.estate.modules.saller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.UUID

@RestController
@RequestMapping("/sellers")
class SallerController(val sallerRepository: SallerRepository) {

    @GetMapping
    fun findAll(): Flux<Seller> = sallerRepository.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: UUID): Mono<Seller> = sallerRepository.findById(id)
}