package br.com.laurasultan.todo.service;

import java.time.LocalDate;
import java.util.List;

import br.com.laurasultan.todo.model.ToDo;
import br.com.laurasultan.todo.repository.ToDoRepository;

public class ToDoService {
    private ToDoRepository repository = new ToDoRepository();

    public List<ToDo> findAll() {
        return repository.findAll();
    }

    public ToDo save(ToDo todo) throws IllegalArgumentException {
        if(todo.getDescription().trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição não pode ficar vazia.");
        }
        if(todo.getDate().isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("A data não pode ser inferior a data atual.");
        }
        if(todo.isDone() == null) {
            throw new IllegalArgumentException("O status da tarefa não pode ficar vazio.");
        }
        return repository.save(todo);
    }
}