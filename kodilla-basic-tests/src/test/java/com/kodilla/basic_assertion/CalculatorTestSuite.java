package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator.subtract(a, b);
        assertEquals(-3, subResult);
    }

    @Test
    public void testPow() {
        Calculator calculator = new Calculator();
        int a = 3;
        int b = 5;
        double powResult = calculator.power(a, b);
        assertEquals(243, powResult, 0.001);
    }
}
