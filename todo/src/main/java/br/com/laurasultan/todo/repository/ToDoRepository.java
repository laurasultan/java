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

    public ToDo edit(ToDo todo) {
        for(int i = 0; i < tasks.size(); i++) {
            ToDo element = tasks.get(i);
            if(element.getDescription().equals(todo.getDescription())) {
                tasks.set(i, todo);
                break;
            }
        }
        return todo;
    }

    public ToDo delete(ToDo todo) {
        for(int i = 0; i < tasks.size(); i++) {
            ToDo element = tasks.get(i);
            if(element.getDescription().equals(todo.getDescription())) {
                tasks.remove(i);
            }
        }
        return todo;
    }
}