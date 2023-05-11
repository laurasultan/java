package br.com.laurasultan.todo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
            return new ResponseEntity<>("Nova tarefa cadastrada", HttpStatus.CREATED);
        } catch(IllegalArgumentException iae) {
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}
