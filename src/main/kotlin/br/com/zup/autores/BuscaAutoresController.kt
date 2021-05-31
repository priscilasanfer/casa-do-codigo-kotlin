package br.com.zup.autores


import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.QueryValue
import io.netty.handler.codec.http.HttpResponseStatus
import javax.transaction.Transactional


@Controller("/autores")
class BuscaAutoresController(val repository: AutorRepository) {

    @Get
    @Transactional
    fun lista(@QueryValue(defaultValue = "") email: String): HttpResponse<Any> {

        if (email.isBlank()) {
            val autores = repository.findAll()
            val resposta = autores.map { autor -> DetalhesDoAutorResponse(autor) }
            return HttpResponse.ok(resposta)
        }

        val possivelAutor = repository.findByEmail(email)
        // val possivelAutor = repository.buscaPorEmail(email)


        if (possivelAutor.isEmpty) {
            return HttpResponse.notFound()
        }

        val autor = possivelAutor.get()
        return HttpResponse.ok(DetalhesDoAutorResponse(autor))


    }
}