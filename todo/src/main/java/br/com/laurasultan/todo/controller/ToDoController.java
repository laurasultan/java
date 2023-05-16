package br.com.laurasultan.todo.controller;

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

import br.com.laurasultan.todo.model.ToDo;
import br.com.laurasultan.todo.service.ToDoService;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {
    private ToDoService service = new ToDoService();
    @GetMapping
    public List<ToDo> findAll() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody ToDo todo) {
        try {
            return new ResponseEntity<>(service.save(todo), HttpStatus.CREATED);
        } catch(IllegalArgumentException iae) {
            return new ResponseEntity<>(iae.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
            // Log para e.getMessage()
        }
    }

    @PutMapping
    public ResponseEntity<Object> edit(@RequestBody ToDo todo) {
        try {
            return new ResponseEntity<>(service.edit(todo), HttpStatus.CREATED);
        } catch(IllegalArgumentException iae) {
            return new ResponseEntity<>(iae.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Exception e) {
            return new ResponseEntity<>("Lamento, houve um erro inesperado no sistema.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping
    public ResponseEntity<Object> delete(@RequestBody ToDo todo) {
        try {
            return new ResponseEntity<>(service.delete(todo), HttpStatus.OK);
        } catch(IllegalArgumentException iae) {
            return new ResponseEntity<>(iae.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Exception e) {
            return new ResponseEntity<>("Lamento, houve um erro inesperado no sistema.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
