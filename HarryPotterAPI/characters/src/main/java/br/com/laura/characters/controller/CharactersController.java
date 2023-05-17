package br.com.laura.characters.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.laura.characters.model.Characters;
import br.com.laura.characters.service.CharactersService;

@RestController
@RequestMapping("/api/characters")
public class CharactersController {
    private CharactersService service = new CharactersService();
    @GetMapping
    public List<Characters> findAll() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Characters characters) {
        try {
            return new ResponseEntity<>(service.save(characters), HttpStatus.CREATED);
        } catch(IllegalArgumentException iae) {
            return new ResponseEntity<>(iae.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
            // Log para e.getMessage()
        }
    }

    @PutMapping
    public ResponseEntity<Object> edit(@RequestBody Characters characters) {
        try {
            return new ResponseEntity<>(service.edit(characters), HttpStatus.CREATED);
        } catch(IllegalArgumentException iae) {
            return new ResponseEntity<>(iae.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Exception e) {
            return new ResponseEntity<>("Lamento, houve um erro inesperado no sistema.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping
    public ResponseEntity<Object> delete(@RequestBody Characters characters) {
        try {
            return new ResponseEntity<>(service.delete(characters), HttpStatus.OK);
        } catch(IllegalArgumentException iae) {
            return new ResponseEntity<>(iae.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Exception e) {
            return new ResponseEntity<>("Lamento, houve um erro inesperado no sistema.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}