package br.com.zup.carros

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated
import javax.validation.Valid

@Validated
@Controller
class CarrosController {

    @Post("/api/carros")
    fun criar(@Body @Valid carroRequest: CarroRequest): io.micronaut.http.HttpResponse<Any> {
        return HttpResponse.ok(carroRequest)
    }
}