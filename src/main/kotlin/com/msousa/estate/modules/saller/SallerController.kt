package com.msousa.estate.modules.saller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/sellers")
class SallerController(val sallerRepository: SallerRepository) {

    @GetMapping
    fun list(): Flux<Seller> = sallerRepository.findAll()
}