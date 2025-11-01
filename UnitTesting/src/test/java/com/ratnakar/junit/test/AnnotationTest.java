package com.ratnakar.junit.test;

import com.ratnakar.junit.practice.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnnotationTest {
    // Now here we have created the Calculator class Instance in each and every test case, So here we will create the Generalized method which will run before every test
    public Calculator calculator;
    @BeforeEach // @BeforeEach runs before each test method to set up test data or initialize resources, ensuring a fresh state for every test execution in the JUnit test class.
    public void calculatorSetUp(){
        calculator = new Calculator();
        System.out.println("Calling calculatorSetUp method Before each test");
    }
    @AfterEach // @AfterEach in JUnit is used to define a method that runs after each test to perform cleanup or reset resources.
    public void tearDown(){
        calculator = null;
        System.out.println("Calling the tearDown Method");
    }

    @DisplayName("Test Addition Method")
    @Test
    public void addTest() {
        int a = 20;
        int b = 30;
        int result = calculator.add(a, b);
        assertEquals(50, result);
        System.out.println("Calling addTest method ....................");
    }
    @DisplayName("Test Factorial Method")
    @Test
    public void factorialTest() {
        int a = 5;
        int result = calculator.factorial(a);
        assertEquals(120, result);
        System.out.println("Calling factorialTest method ....................");
    }
    @DisplayName("Test Subtraction Method")
    @Test
    public void subtractTest() {
        int a = 20;
        int b = 10;
        int result = calculator.subtract(a, b);
        assertEquals(10, result);
        System.out.println("Calling subtractTest method ....................");
    }
    @DisplayName("Test Multiplication Method")
    @Test
    public void multiplyTest() {
        int a = 5;
        int b = 4;
        int result = calculator.multiply(a, b);
        assertEquals(20, result);
        System.out.println("Calling multiplyTest method ....................");
    }
}
