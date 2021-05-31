package br.com.zup.autores

import io.micronaut.data.annotation.Query
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.*

@Repository
interface AutorRepository : JpaRepository<Autor, Long> {

    fun buscaPorEmail(email: String): Any

    @Query("SELECT a FROM Autor a where a.email = :email")
    fun findByEmail(email: String): Optional<Autor>
}