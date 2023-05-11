package br.com.laurasultan.todo.model;

import java.time.LocalDate;

public class ToDo {
    private String description;
    private LocalDate date;
    private Boolean isDone;

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public Boolean isDone() {
        return isDone;
    }
    public void setDone(Boolean isDone) {
        this.isDone = isDone;
    }
}