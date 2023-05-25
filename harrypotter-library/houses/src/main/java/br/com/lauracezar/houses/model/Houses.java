package br.com.lauracezar.houses.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "house")
public class Houses {
    private String name;
    @Id
    private int code;
    private String animal;
    private String color;
    private String value;

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public int setCode(int code) {
        this.code = code;
    }

    public String getAnimal() {
        return animal;
    }

    public String setAnimal(String animal) {
        this.animal = animal;
    }

    public String getColor() {
        return color;
    }

    public String setColor(String color) {
        this.color = color;
    }

    public String getValue() {
        return value;
    }

    public String setValue(String value) {
        this.value = value;
    }
}