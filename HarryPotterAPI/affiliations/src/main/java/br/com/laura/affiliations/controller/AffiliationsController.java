package br.com.laura.affiliations.controller;

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

import br.com.laura.affiliations.model.Affiliations;
import br.com.laura.affiliations.service.AffiliationsService;

@RestController
@RequestMapping("/api/affiliations")
public class AffiliationsController {
    private AffiliationsService service = new AffiliationsService();
    @GetMapping
    public List<Affiliations> findAll() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Affiliations affiliations) {
        try {
            return new ResponseEntity<>(service.save(affiliations), HttpStatus.CREATED);
        } catch(IllegalArgumentException iae) {
            return new ResponseEntity<>(iae.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
            // Log para e.getMessage()
        }
    }

    @PutMapping
    public ResponseEntity<Object> edit(@RequestBody Affiliations affiliations) {
        try {
            return new ResponseEntity<>(service.edit(affiliations), HttpStatus.CREATED);
        } catch(IllegalArgumentException iae) {
            return new ResponseEntity<>(iae.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Exception e) {
            return new ResponseEntity<>("Lamento, houve um erro inesperado no sistema.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping
    public ResponseEntity<Object> delete(@RequestBody Affiliations affiliations) {
        try {
            return new ResponseEntity<>(service.delete(affiliations), HttpStatus.OK);
        } catch(IllegalArgumentException iae) {
            return new ResponseEntity<>(iae.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Exception e) {
            return new ResponseEntity<>("Lamento, houve um erro inesperado no sistema.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}