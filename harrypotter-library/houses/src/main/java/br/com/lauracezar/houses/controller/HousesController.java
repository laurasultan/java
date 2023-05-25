package br.com.lauracezar.houses.controller;

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

import br.com.lauracezar.houses.model.Houses;
import br.com.lauracezar.houses.service.HousesService;

@RestController
@RequestMapping("/api/houses")
public class HousesController {
    @Autowired
    private HousesService service;

    @GetMapping
    public List<Houses> findAll() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Houses houses, @RequestParam String token) {
        try{
            System.out.println("Token: " + token);
            return new ResponseEntity<>(service.save(houses), HttpStatus.CREATED);
        } catch (IllegalArgumentException iae) {
            return new ResponseEntity<>(iae.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>("Lamento, houve um erro inesperado em nossa aplicação.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping
    public ResponseEntity<Object> edit(@RequestBody Houses houses) {
        try {
            var result = service.findOne(houses.getCode());
            if(result.isPresent()) {
                return new ResponseEntity<>(service.save(houses), HttpStatus.CREATED);
            }
            return new ResponseEntity<>("Casa não localizada em nossa base de dados.", HttpStatus.NOT_FOUND);
        } catch(IllegalArgumentException iae) {
            return new ResponseEntity<>(iae.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Exception e) {
            return new ResponseEntity<>("Houve um erro inesperado em nossa aplicação, tente novamente mais tarde.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}