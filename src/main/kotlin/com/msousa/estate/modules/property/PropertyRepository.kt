package com.msousa.estate.modules.property

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import java.util.*

interface PropertyRepository: ReactiveCrudRepository<Property, UUID> {
}