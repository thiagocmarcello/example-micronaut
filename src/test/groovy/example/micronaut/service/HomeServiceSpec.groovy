package example.micronaut.service


import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification
import spock.lang.Unroll

import javax.inject.Inject

@MicronautTest
class HomeServiceSpec extends Specification {

    @Inject
    HomeService homeService

    @Unroll
    void "deve dizer Ola, meu nome e #nome"() {
        when:
        def result = homeService.dizerOla(nome)

        then:
        result == expected

        where:
        nome       | expected
        'Thiago'   | "Ola, meu nome e ${nome}"
        'Marcello' | "Ola, meu nome e ${nome}"
    }

    @Unroll
    void "deve retornaro calculo do percentual"() {
        when:
        def result = homeService.retornarPercentualDeValor(valor)

        then:
        result == expected

        where:
        valor | expected
        100   | 33
        150   | 49.5
    }
}
