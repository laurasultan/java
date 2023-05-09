package br.com.laurasultan.intro_spring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {
    @GetMapping
    public List<Resource> home() {
        return List.of(
            new Resource("Converter Celsius para Kelvin","http://localhost:8080/api/celsius/kelvin"),
            new Resource("Converter Celsius para Kelvin","http://localhost:8080/api/kelvin/celsius")
        );
    }

}

class Resource {
    private String description;
    private String route;

    public Resource(String description, String route) {
        this.description = description;
        this.route = route;
    }

    public String getDescription(){
        return this.description;
    }

    public String getRoute(){
        return this.route;
    }
}