package com.example.annotations

import org.springframework.stereotype.Component

@Component
class Boda(private val pasteleria: Pasteleria, private val padrinoPastel: PadrinoPastel) {

  fun ceremoniaPastel() {
    padrinoPastel.discurso()
    val pastel = pasteleria.getPastel()
    padrinoPastel.reparte(pastel)
  }

}

interface Pasteleria {
  fun getPastel(): Pastel
}

@Component
class LaEsperanza : Pasteleria {
  override fun getPastel(): Pastel {
    return Pastel(sabor = "La esperanza tres leches")
  }

}

interface PadrinoPastel {
  fun discurso()

  fun reparte(pastel: Pastel)
}

@Component
class JuanPerez : PadrinoPastel {


  override fun discurso() {
    println("Soy juanito perez y digo un discurso muy comico")
  }

  override fun reparte(pastel: Pastel) {
    println("Repartiendo poquito del pastel sabor ${pastel.sabor} porque soy codo")
  }

}


data class Pastel(val sabor: String = "3 leches")