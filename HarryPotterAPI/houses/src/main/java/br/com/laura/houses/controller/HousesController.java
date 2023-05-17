package br.com.laura.houses.controller;

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

import br.com.laura.houses.model.Houses;
import br.com.laura.houses.service.HousesService;

@RestController
@RequestMapping("/api/houses")
public class HousesController {
    private HousesService service = new HousesService();
    @GetMapping
    public List<Houses> findAll() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Houses houses) {
        try {
            return new ResponseEntity<>(service.save(houses), HttpStatus.CREATED);
        } catch(IllegalArgumentException iae) {
            return new ResponseEntity<>(iae.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
            // Log para e.getMessage()
        }
    }

    @PutMapping
    public ResponseEntity<Object> edit(@RequestBody Houses houses) {
        try {
            return new ResponseEntity<>(service.edit(houses), HttpStatus.CREATED);
        } catch(IllegalArgumentException iae) {
            return new ResponseEntity<>(iae.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Exception e) {
            return new ResponseEntity<>("Lamento, houve um erro inesperado no sistema.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping
    public ResponseEntity<Object> delete(@RequestBody Houses houses) {
        try {
            return new ResponseEntity<>(service.delete(houses), HttpStatus.OK);
        } catch(IllegalArgumentException iae) {
            return new ResponseEntity<>(iae.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Exception e) {
            return new ResponseEntity<>("Lamento, houve um erro inesperado no sistema.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}