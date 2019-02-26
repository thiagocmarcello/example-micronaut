package example.micronaut.controller

import example.micronaut.service.HomeService
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

import javax.inject.Inject

@Controller("/home")
class HomeController {

    @Inject
    HomeService homeService
    @Get("/{nome}")
    @Produces(MediaType.TEXT_PLAIN)
    def get(nome) {
        homeService.dizerOla(nome)
    }

}
