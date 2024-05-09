package org.example.Path2;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Перехвачено исключение в методе main(): " + e.getMessage());
        }
    }

    public static void f() throws CustomException2 {
        try {
            g();
        } catch (CustomException1 e) {
            System.out.println("Перехвачено исключение в методе f(): " + e.getMessage());
            throw new CustomException2("Новое исключение в методе f()");
        }
    }

    public static void g() throws CustomException1 {
        throw new CustomException1("Исключение в методе g()");
    }
}

class CustomException1 extends Exception {
    public CustomException1(String message) {
        super(message);
    }
}

class CustomException2 extends Exception {
    public CustomException2(String message) {
        super(message);
    }
}

