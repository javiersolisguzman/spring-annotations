package com.example.annotations

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "invitacion")
data class InvitacionConfiguracion(
  val remitente: String,
  val mensajeFinal: String
)