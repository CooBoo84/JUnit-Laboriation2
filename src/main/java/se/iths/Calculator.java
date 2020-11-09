package se.iths;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("2 + 2 is " + new Calculator().add(2, 2) + ".");
        System.out.println("2 - 2 is " + new Calculator().subtract(2, 2) + ".");
        System.out.println("2 * 2 is " + new Calculator().multiply(2, 2) + ".");
        System.out.println("2 / 2 is " + new Calculator().divide(2, 2) + ".");
    }
}
