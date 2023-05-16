package br.com.laurasultan.todo.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ToDo {
    private String description;
    @JsonFormat(pattern = "dd/MM/yyyy")
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