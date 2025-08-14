package com.ratnakar.junit.practice;

// This class is called class under test
public class Calculator {

    // This method is called method under test
    // Addition logic
    public int add(int a, int b){
        return a + b;
    }

    // Factorial logic -> n! = n * (n-1) * (n-2) * ... * 2 * 1
    public int factorial(int number){
        int factorial = 1;
        for(int i = 1; i <= number; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
    // Subtraction logic
    public int subtract(int a, int b) {
        return a - b;
    }
    // Multiplication logic
    public int multiply(int a, int b) {
        return a * b;
    }
    // Division logic
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
    // Power logic
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    // Square root logic
    public double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(number);
    }
    // Modulus logic
    public int modulus(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Modulus by zero is not allowed");
        }
        return a % b;
    }
    // Absolute value logic
    /*
    The absolute value of a number is its distance from zero on the number line.
    It is always a non-negative value.
    To calculate the absolute value, you simply remove any negative sign if present, or leave it as is if it's already positive.
    For example, the absolute value of -5 is 5, and the absolute value of 5 is also 5.
    */
    public int absolute(int number) {
        return Math.abs(number);
    }
}
