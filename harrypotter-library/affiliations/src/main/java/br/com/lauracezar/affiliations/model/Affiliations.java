package br.com.laura.affiliations.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "affiliation")
public class affiliations {
    private String name;
    @Id
    private int code;

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public int setCode(int Code) {
        this.code = code;
    }
}