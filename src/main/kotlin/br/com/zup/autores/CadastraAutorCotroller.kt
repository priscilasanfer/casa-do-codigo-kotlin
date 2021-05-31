package br.com.zup.autores

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated
import javax.validation.Valid

@Validated
@Controller("/autores")
class CadastraAutorCotroller (val repository: AutorRepository){

    @Post
    fun cadastra(@Body @Valid request: NovoAutorRequest) {

        val autor = request.paraAutor()
        repository.save(autor)

    }
}