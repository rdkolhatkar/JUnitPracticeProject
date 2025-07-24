package com.ratnakar.junit.practice;

// This class is called class under test
public class Calculator {

    // This method is called method under test
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
}
