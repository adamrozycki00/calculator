package pl.adaroz.calculator;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double a = 6;
        double b = 9;
        System.out.printf("%f + %f = %f\n", a, b, calc.add(a, b));
        a = 4.5;
        b = 3.1;
        System.out.printf("%f - %f = %f\n", a, b, calc.subtract(a, b));
    }

}
