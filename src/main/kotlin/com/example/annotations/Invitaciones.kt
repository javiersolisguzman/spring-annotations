package com.example.annotations

import java.util.UUID
import javax.persistence.Entity
import javax.persistence.Id
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class InvitacionesController(private val invitacionesService: InvitacionesService) {

  @PostMapping("/invitaciones")
  fun invitar(@RequestBody body: InvitacionDTO) {
    invitacionesService.invitar(body.nombre)
  }

  @GetMapping("invitaciones")
  fun verInvitaciones(): List<InvitacionDTO> {
    return invitacionesService.verInvitaciones()
  }

}

data class InvitacionDTO(val nombre: String)


interface InvitacionesService {
  fun invitar(nombre: String)
  fun verInvitaciones(): List<InvitacionDTO>
}

@Service
class InvitacionesServiceImpl(private val invitacionesRepository: InvitacionesRepository) : InvitacionesService {

  override fun invitar(nombre: String) {
    invitacionesRepository.save(Invitacion(nombre))
  }

  override fun verInvitaciones(): List<InvitacionDTO> {
    return invitacionesRepository.findAll().map { InvitacionDTO(it.getName()) }
  }

}

@Entity
data class Invitacion(
  @Id
  private val name: String
) {
  fun getName() = this.name
}

@Repository
interface InvitacionesRepository : JpaRepository<Invitacion, UUID> {

}