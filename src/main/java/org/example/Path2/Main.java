package org.example.Path2;

public class Main {
    public static void main(String[] args) {
        try {
            throw new CustomException("Пример исключения");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Блок finally выполнен");
        }
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
