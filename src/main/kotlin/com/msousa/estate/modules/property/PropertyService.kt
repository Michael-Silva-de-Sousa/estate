package com.msousa.estate.modules.property

import com.msousa.estate.dto.PropertyDTO
import com.msousa.estate.modules.saller.SellerRepository
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.*

@Service
class PropertyService(
    private val propertyRepository: PropertyRepository,
    private val sellerRepository: SellerRepository
) {

    fun findAll(): Flux<PropertyDTO> {
        return propertyRepository.findAll().map { PropertyDTO(it) }
    }

    fun findById(id: UUID): Mono<PropertyDTO> {
        return propertyRepository.findById(id).map { PropertyDTO(it) }
    }

    fun save(propertyDTO: PropertyDTO): Mono<PropertyDTO> {
        return propertyRepository.save(Property(propertyDTO))
                .map { PropertyDTO(it) }
                .doOnError { ResponseStatusException(HttpStatus.BAD_REQUEST, it.message) }
    }
}