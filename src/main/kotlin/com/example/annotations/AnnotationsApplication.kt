package com.example.annotations

import java.util.Arrays
import javax.annotation.PostConstruct
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@SpringBootApplication
class AnnotationsApplication

fun main(args: Array<String>) {
  runApplication<AnnotationsApplication>(*args)

}

@RestController
class mainController {
  @Autowired
  private lateinit var boda: Boda

  @Autowired
  private lateinit var ctx: ApplicationContext

  @GetMapping("/ceremonia-pastel")
  fun main() {
    println("yo mandaré a llamar el metodo comer pastel")
    boda.ceremoniaPastel()
  }


}


