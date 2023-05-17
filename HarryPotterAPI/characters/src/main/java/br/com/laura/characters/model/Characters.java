package br.com.laura.characters.model;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Characters {
    private String name;
    private int code;
    private String house;
    private String affiliation;

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

    public String getHouse() {
        return house;
    }

    public String setHouse(String house) {
        this.house = house;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public String setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }
}