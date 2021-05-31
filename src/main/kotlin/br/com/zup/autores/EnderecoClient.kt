package br.com.zup.autores

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@Client(value = "\${cep.url}")
interface EnderecoClient {

    @Get("{cep}/json")
    fun consulta(cep: String) : HttpResponse<EnderecoResponse>

    @Get(
        "http://cep.republicavirtual.com.br/web_cep.php?cep={cep}&formato=xml",
        consumes = [MediaType.APPLICATION_XML]
    )
    fun consultaXml(cep: String): HttpResponse<EnderecoResponse>
}