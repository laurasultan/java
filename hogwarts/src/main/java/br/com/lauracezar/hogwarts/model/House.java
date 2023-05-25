package br.com.lauracezar.hogwarts.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "houses")
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    @Column(length = 10, nullable = false)
    private String name;
    @Column(length = 10, nullable = false)
    private String color;
    @Column(length = 50, nullable = false)
    private String animal;
    @Column(length = 200, nullable = false)
    private String value;
}