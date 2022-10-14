package com.msousa.estate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EstateApplication

fun main(args: Array<String>) {
	runApplication<EstateApplication>(*args)
}
