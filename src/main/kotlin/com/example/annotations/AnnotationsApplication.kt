package com.example.annotations

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AnnotationsApplication

	@Autowired
	private lateinit var boda: Boda

	fun main(args: Array<String>) {
		runApplication<AnnotationsApplication>(*args)
		boda.ceremoniaPastel()

	}


