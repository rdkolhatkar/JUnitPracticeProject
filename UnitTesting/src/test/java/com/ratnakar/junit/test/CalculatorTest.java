package com.ratnakar.junit.test;

import com.ratnakar.junit.practice.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Operations Test Suite")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {

    // @DisplayName -> This annotation is used to provide a custom name for the test method in the output
    // @Disabled -> This annotation is used to disable a test method, so it won't be executed
    // By default Junit runs the test in random order, if we want to run our Junit tests in a specific order then we have to use '@TestMethodOrder' annotation
    // @TestMethodOrder is used to control the execution order of test methods in a test class, based on a specified ordering strategy

    @Order(1)
    @DisplayName("Test Addition Method")
    @Test
    public void addTest() {
        int a = 20;
        int b = 30;
        Calculator calculator = new Calculator();
        int result = calculator.add(a, b);
        assertEquals(50, result);
    }
    @Order(2)
    @DisplayName("Test Factorial Method")
    @Test
    public void factorialTest() {
        int a = 5;
        Calculator calculator = new Calculator();
        int result = calculator.factorial(a);
        assertEquals(120, result);
    }
    @Order(3)
    @DisplayName("Test Subtraction Method")
    @Test
    public void subtractTest() {
        int a = 20;
        int b = 10;
        Calculator calculator = new Calculator();
        int result = calculator.subtract(a, b);
        assertEquals(10, result);
    }
    @Order(5)
    @DisplayName("Test Multiplication Method")
    @Test
    public void multiplyTest() {
        int a = 5;
        int b = 4;
        Calculator calculator = new Calculator();
        int result = calculator.multiply(a, b);
        assertEquals(20, result);
    }
    @Order(4)
    @DisplayName("Test Division Method")
    @Test
    public void divideTest() {
        int a = 20;
        int b = 4;
        Calculator calculator = new Calculator();
        int result = calculator.divide(a, b);
        assertEquals(5, result);
    }
    @Order(6)
    @DisplayName("Test Division by Zero")
    @Test
    public void powerTest() {
        double base = 2.0;
        double exponent = 3.0;
        Calculator calculator = new Calculator();
        double result = calculator.power(base, exponent);
        assertEquals(8.0, result);
    }
    @Order(7)
    @DisplayName("Test Square Root Method")
    @Test
    public void squareRootTest() {
        double number = 16.0;
        Calculator calculator = new Calculator();
        double result = calculator.squareRoot(number);
        assertEquals(4.0, result);
    }
    @Order(9)
    @DisplayName("Test Square Root of Negative Number")
    @Test
    public void modulusTest() {
        int a = 10;
        int b = 3;
        Calculator calculator = new Calculator();
        int result = calculator.modulus(a, b);
        assertEquals(1, result);
    }
    @Order(8)
    @DisplayName("Test Modulus by Zero")
    @Test
    public void absoluteTest() {
        int number = -10;
        Calculator calculator = new Calculator();
        int result = calculator.absolute(number);
        assertEquals(10, result);
    }
    @Order(10)
    @Disabled("Negate method is not implemented yet")
    @Test
    public void negateTest() {
        int number = 10;
        Calculator calculator = new Calculator();
        int result = calculator.negate(number);
        assertEquals(-10, result);
    }


}