package br.com.lauracezar.library.model;

public class Validation {
    public static boolean titleValidation(String title) {
        return title.length() > 2 && title.length() <= 100;
    }
    public static boolean nameValidation(String name) {
        return name.length() > 2 && name.length() <= 50;
    }
}
