package br.com.lauracezar.affiliations.model;

public class Validation {
    public static boolean nameValidation(String name) {
        return name.length() > 2 && name.length() <= 100;
    }
}