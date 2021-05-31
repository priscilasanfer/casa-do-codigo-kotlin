package br.com.zup.autores

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Put
import javax.transaction.Transactional


@Controller("/autores/{id}")
class AtualizaAutorController(val repository: AutorRepository) {

    @Put
    @Transactional
    fun atualiza(@PathVariable id: Long, descricao: String): HttpResponse<Any> {
        val possivelAutor = repository.findById(id)

        if (possivelAutor.isEmpty) {
            return HttpResponse.notFound()
        }

        val autor = possivelAutor.get()
        autor.descricao = descricao

        // repository.update(autor) Não precisa mais pois qdo faz a busca a entidade ja esta em modo gerenciado e
        // alteração feita no final vai ser atualizado
        return HttpResponse.ok(DetalhesDoAutorResponse(autor))
    }

}