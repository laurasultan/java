package br.com.laurasultan.todo.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.laurasultan.todo.model.ToDo;

public class ToDoRepository {
    private static List<ToDo> tasks = new ArrayList<>();

    public List<ToDo> findAll() {
        return tasks;
    }

    public ToDo save(ToDo todo) {
        // Adicionar um id
        tasks.add(todo);
        return todo;
    }
}