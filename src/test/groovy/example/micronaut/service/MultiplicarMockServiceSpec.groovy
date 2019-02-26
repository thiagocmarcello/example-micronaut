package example.micronaut.service


import spock.lang.Specification
import spock.lang.Unroll

class MultiplicarMockServiceSpec extends Specification {

    MultiplicarService multiplicarService

    def setup() {
        multiplicarService = Mock()
    }

    @Unroll
    void "deve multiplicar #num por 2 e resultar em #square"() {
        when:
        def result = multiplicarService.multiplicar(num)

        then:
        1 * multiplicarService.multiplicar(num) >> Math.multiplyExact(num, 2)
        result == square

        where:
        num | square
        2   | 4
        3   | 6
    }
}
