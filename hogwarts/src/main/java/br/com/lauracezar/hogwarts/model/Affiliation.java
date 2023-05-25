package br.com.lauracezar.hogwarts.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "affiliations")
public class Affiliation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    @Column(length = 200, nullable = false)
    private String name;

    @ManyToMany(mappedBy = "affiliation")
    @JsonIgnore
    private List<Character> characters;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

}