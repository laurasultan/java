package br.com.lauracezar.characters.model;

public class Validation {
    public static boolean nameValidation(String name) {
        return name.length() > 2 && name.length() <= 300;
    }
}