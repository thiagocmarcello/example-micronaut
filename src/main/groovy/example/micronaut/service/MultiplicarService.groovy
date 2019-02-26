package example.micronaut.service

import javax.inject.Singleton

@Singleton
class MultiplicarService {

    def multiplicar(numero) {
        return numero * 4
    }
}
