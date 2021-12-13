package com.example.annotations

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class AnnotationsApplication

fun main(args: Array<String>) {
  runApplication<AnnotationsApplication>(*args)

}

@RestController
class mainController {


  @GetMapping("/ceremonia-pastel")
  fun main() {
    println("yo mandaré a llamar el metodo comer pastel")
  }


}


