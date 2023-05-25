package br.com.lauracezar.hogwarts.controller;

import java.util.List;

// import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.lauracezar.hogwarts.model.Character;
import br.com.lauracezar.hogwarts.service.CharacterService;

@RestController
@RequestMapping("/api/character")
public class CharacterController {
    @Autowired
    private CharacterService service;

    @GetMapping
    public List<Character> findAll() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Character character, @RequestParam String token) {
        try{
            System.out.println("Token: " + token);
            return new ResponseEntity<>(service.save(character), HttpStatus.CREATED);
        } catch (IllegalArgumentException iae) {
            return new ResponseEntity<>(iae.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            // return new ResponseEntity<>("Lamento, houve um erro inesperado em nossa aplicação.", HttpStatus.INTERNAL_SERVER_ERROR);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping
    public ResponseEntity<Object> edit(@RequestBody Character character) {
        try {
            var result = service.findOne(character.getCode());
            if(result.isPresent()) {
                return new ResponseEntity<>(service.save(character), HttpStatus.CREATED);
            }
            return new ResponseEntity<>("Personagem não localizado em nossa base de dados.", HttpStatus.NOT_FOUND);
        } catch(IllegalArgumentException iae) {
            return new ResponseEntity<>(iae.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Exception e) {
            return new ResponseEntity<>("Houve um erro inesperado em nossa aplicação, tente novamente mais tarde.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{code}")
    public ResponseEntity<String> delete(@PathVariable("code") Integer code) {
        service.delete(code);
        var result = service.findOne(code);

        if(result.isEmpty()) {
            return new ResponseEntity<>("Personagem removido com sucesso", HttpStatus.OK);
        }
        return new ResponseEntity<>("Lamento, não foi possível remover o personagem.", HttpStatus.OK);
    }
}