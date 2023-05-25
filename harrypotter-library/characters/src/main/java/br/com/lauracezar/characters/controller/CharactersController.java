package br.com.lauracezar.characters.controller;

import java.util.List;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.lauracezar.characters.model.Characters;
import br.com.lauracezar.characters.service.CharactersService;

@RestController
@RequestMapping("/api/characters")
public class CharactersController {
    @Autowired
    private CharactersService service;

    @GetMapping
    public List<Characters> findAll() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Characters characters, @RequestParam String token) {
        try{
            System.out.println("Token: " + token);
            return new ResponseEntity<>(service.save(characters), HttpStatus.CREATED);
        } catch (IllegalArgumentException iae) {
            return new ResponseEntity<>(iae.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>("Lamento, houve um erro inesperado em nossa aplicação.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping
    public ResponseEntity<Object> edit(@RequestBody Characters characters) {
        try {
            var result = service.findOne(characters.getCode());
            if(result.isPresent()) {
                return new ResponseEntity<>(service.save(characters), HttpStatus.CREATED);
            }
            return new ResponseEntity<>("Personagem não localizado em nossa base de dados.", HttpStatus.NOT_FOUND);
        } catch(IllegalArgumentException iae) {
            return new ResponseEntity<>(iae.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Exception e) {
            return new ResponseEntity<>("Houve um erro inesperado em nossa aplicação, tente novamente mais tarde.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}