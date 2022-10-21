package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 3;
        int b = 5;
        int sumResult = calculator.sum(a, b);
        int subResult = calculator.subtract(a, b);
        double powResult = calculator.power(a, b);
        boolean correctSum = ResultChecker.assertEquals(8, sumResult);
        boolean correctSub = ResultChecker.assertEquals(-2, subResult);
        boolean correctPow = ResultChecker.assertEquals(243, (int) powResult);
        if (correctSum && correctSub && correctPow) {
            System.out.println("Metoda sum, sub i pow działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum, sub i pow nie działa poprawnie dla liczb " + a + " i " + b);
        }
    }
}
