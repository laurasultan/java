package br.com.laura.affiliations.model;

import com.fasterxml.jackson.annotation.JsonFormat;

public class affiliations {
    private String name;
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