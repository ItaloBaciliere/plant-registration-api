package br.com.groth.plantcatalog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PlantCatalogApiApplication

fun main(args: Array<String>) {
	runApplication<PlantCatalogApiApplication>(*args)
}
