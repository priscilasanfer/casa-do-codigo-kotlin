package br.com.zup.autores

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@Client(value = "\${cep.url}")
interface EnderecoClient {

    @Get("{cep}/json")
    fun consulta(cep: String) : HttpResponse<EnderecoResponse>
}