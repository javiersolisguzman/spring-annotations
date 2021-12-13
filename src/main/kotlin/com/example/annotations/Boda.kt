package com.example.annotations

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

interface PadrinoPastel {
  fun discurso()

  fun reparte(pastel: Pastel)
}

data class Pastel(val sabor: String = "3 leches")