package br.com.zup.autores

import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.annotation.MockBean
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import javax.inject.Inject

@MicronautTest
internal class CadastraAutorCotrollerTest{

    @field:Inject
    lateinit var autorRepository: AutorRepository

    @field:Inject
    @field:Client("/")
    lateinit var client: HttpClient

    @field:Inject
    lateinit var enderecoClient: EnderecoClient

    @Test
    internal fun `deve cadastrar um novo autor`() {
        //Cenario
        val novoAutorRequest = NovoAutorRequest("Random", "teste@email.com", "uma descrição legal aqui", "05716090", "37")
        val enderecoResponse = EnderecoResponse(
            "Rua Um",
            "São Paulo",
            "SP",
        )

        Mockito.`when`(enderecoClient.consulta(novoAutorRequest.cep)).thenReturn(HttpResponse.ok(enderecoResponse))

        val request = HttpRequest.POST("/autores", novoAutorRequest)

        // Ação
        val response = client.toBlocking().exchange(request, Any::class.java)

        // Corretude
        assertEquals(HttpStatus.CREATED, response.status)
        assertTrue(response.headers.contains("location"))
        assertTrue(response.header("Location")!!.matches("/autores/\\d".toRegex()))
    }

    @MockBean(EnderecoClient::class)
    fun enderecoMock(): EnderecoClient {
        return Mockito.mock(EnderecoClient::class.java)
    }
}