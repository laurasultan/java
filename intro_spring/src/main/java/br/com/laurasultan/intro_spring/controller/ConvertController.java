package br.com.laurasultan.intro_spring.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConvertController {
    @PostMapping("/api/celsius/kelvin")
    public String kelvinConvert(@RequestBody String celsius) {
        short gCelsius = Short.parseShort(celsius);
        float gKelvin = gCelsius + 273.15f;
        return gKelvin + " K";
    }
}
