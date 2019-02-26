package example.micronaut.domain

class Home {

    int percentual = 33.00

    def calcularPercentual(valor) {
        (percentual * valor) / 100
    }
}
