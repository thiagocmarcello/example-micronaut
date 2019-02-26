package example.micronaut.controller

import io.micronaut.http.HttpRequest
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification
import spock.lang.Unroll

import javax.inject.Inject

@MicronautTest
class HomeControllerSpec extends Specification{

    @Inject
    @Client('/home')
    RxHttpClient client

    @Unroll
    void "deve obter a frase Ola, meu nome e #nome"() {
        when:
        def result = client.toBlocking().retrieve(HttpRequest.GET("/${nome}"))

        then:
        result == square

        where:
        nome        | square
        'Thiago'    | 'Ola, meu nome e Thiago'
        'Marcello'  | 'Ola, meu nome e Marcello'
    }
}
