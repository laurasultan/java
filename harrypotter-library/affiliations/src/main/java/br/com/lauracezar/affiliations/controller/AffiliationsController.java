package br.com.lauracezar.affiliations.controller;

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

import br.com.lauracezar.affiliations.model.Affiliations;
import br.com.lauracezar.affiliations.service.AffiliationsService;

@RestController
@RequestMapping("/api/affiliations")
public class AffiliationsController {
    @Autowired
    private AffiliationsService service;

    @GetMapping
    public List<Affiliations> findAll() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Affiliations affiliations, @RequestParam String token) {
        try{
            System.out.println("Token: " + token);
            return new ResponseEntity<>(service.save(affiliations), HttpStatus.CREATED);
        } catch (IllegalArgumentException iae) {
            return new ResponseEntity<>(iae.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>("Lamento, houve um erro inesperado em nossa aplicação.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping
    public ResponseEntity<Object> edit(@RequestBody Affiliations affiliations) {
        try {
            var result = service.findOne(affiliations.getCode());
            if(result.isPresent()) {
                return new ResponseEntity<>(service.save(affiliations), HttpStatus.CREATED);
            }
            return new ResponseEntity<>("Filiação não localizada em nossa base de dados.", HttpStatus.NOT_FOUND);
        } catch(IllegalArgumentException iae) {
            return new ResponseEntity<>(iae.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Exception e) {
            return new ResponseEntity<>("Houve um erro inesperado em nossa aplicação, tente novamente mais tarde.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}