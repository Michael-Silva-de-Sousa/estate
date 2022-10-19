package com.msousa.estate.modules.property


import com.msousa.estate.dto.PropertyDTO
import org.springframework.http.MediaType
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.*

@RestController
@RequestMapping("/properties")
class PropertyController(val propertyService: PropertyService) {

    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun findAll(): Flux<PropertyDTO> = propertyService.findAll()

    @GetMapping("/{id}", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun findById(@PathVariable id: UUID): Mono<PropertyDTO> = propertyService.findById(id)

    @Transactional
    @PostMapping(
        produces = [MediaType.APPLICATION_JSON_VALUE],
        consumes = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun save(@RequestBody propertyDTO: PropertyDTO): Mono<PropertyDTO> {
        return propertyService.save(propertyDTO)
    }
}