package com.ratnakar.junit.test;

import com.ratnakar.junit.practice.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Operations Test Suite")
public class CalculatorTest {

    @DisplayName("Test Addition Method")
    @Test
    public void addTest() {
        int a = 20;
        int b = 30;
        Calculator calculator = new Calculator();
        int result = calculator.add(a, b);
        assertEquals(50, result);
    }
    @DisplayName("Test Factorial Method")
    @Test
    public void factorialTest() {
        int a = 5;
        Calculator calculator = new Calculator();
        int result = calculator.factorial(a);
        assertEquals(120, result);
    }
    @DisplayName("Test Subtraction Method")
    @Test
    public void subtractTest() {
        int a = 20;
        int b = 10;
        Calculator calculator = new Calculator();
        int result = calculator.subtract(a, b);
        assertEquals(10, result);
    }
    @DisplayName("Test Multiplication Method")
    @Test
    public void multiplyTest() {
        int a = 5;
        int b = 4;
        Calculator calculator = new Calculator();
        int result = calculator.multiply(a, b);
        assertEquals(20, result);
    }
    @DisplayName("Test Division Method")
    @Test
    public void divideTest() {
        int a = 20;
        int b = 4;
        Calculator calculator = new Calculator();
        int result = calculator.divide(a, b);
        assertEquals(5, result);
    }
    @DisplayName("Test Division by Zero")
    @Test
    public void powerTest() {
        double base = 2.0;
        double exponent = 3.0;
        Calculator calculator = new Calculator();
        double result = calculator.power(base, exponent);
        assertEquals(8.0, result);
    }
    @DisplayName("Test Square Root Method")
    @Test
    public void squareRootTest() {
        double number = 16.0;
        Calculator calculator = new Calculator();
        double result = calculator.squareRoot(number);
        assertEquals(4.0, result);
    }
    @DisplayName("Test Square Root of Negative Number")
    @Test
    public void modulusTest() {
        int a = 10;
        int b = 3;
        Calculator calculator = new Calculator();
        int result = calculator.modulus(a, b);
        assertEquals(1, result);
    }
    @DisplayName("Test Modulus by Zero")
    @Test
    public void absoluteTest() {
        int number = -10;
        Calculator calculator = new Calculator();
        int result = calculator.absolute(number);
        assertEquals(10, result);
    }


}