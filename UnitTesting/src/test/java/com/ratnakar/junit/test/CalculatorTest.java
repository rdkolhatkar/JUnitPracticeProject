package com.ratnakar.junit.test;

import com.ratnakar.junit.practice.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void addTest() {
        int a = 20;
        int b = 30;
        Calculator calculator = new Calculator();
        int result = calculator.add(a, b);
        assertEquals(result, 50);
    }
}