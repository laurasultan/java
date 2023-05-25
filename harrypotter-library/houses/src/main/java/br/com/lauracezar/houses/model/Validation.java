package br.com.lauracezar.houses.model;

public class Validation {
    public static boolean nameValidation(String name) {
        return name.length() > 1 && name.length() <= 100;
    }
}