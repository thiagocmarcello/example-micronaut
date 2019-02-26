package example.micronaut.service

import example.micronaut.domain.Home

import javax.inject.Singleton

@Singleton
class HomeService {

    def dizerOla(nome) {
        "Ola, meu nome e ${nome}"
    }

    def retornarPercentualDeValor(valor) {
        def home = new Home()
        home.calcularPercentual(valor)
    }
}
