package example.micronaut.service

import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification
import spock.lang.Unroll

import javax.inject.Inject

@MicronautTest
class MultiplicarServiceSpec extends Specification{

    @Inject
    MultiplicarService multiplicarService

    @Unroll
    void "deve multiplicar #numero por 4"() {
        when:
        def result = multiplicarService.multiplicar(numero)

        then:
        result == expected

        where:
        numero | expected
        2      | 8
        3      | 12
    }
}
