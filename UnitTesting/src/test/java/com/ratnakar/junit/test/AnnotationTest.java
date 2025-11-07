package com.ratnakar.junit.test;

import com.ratnakar.junit.practice.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnnotationTest {
    // Now here we have created the Calculator class Instance in each and every test case, So here we will create the Generalized method which will run before every test
    public Calculator calculator;

    @BeforeAll // @BeforeAll annotation is used to execute a method once before all test methods in a class, and it is applicable only at the class level, not project level.
    public static void setUpBeforeClass(){
        System.out.println("This method will execute before all test methods in a class");
    }

    @AfterAll // @AfterAll annotation is used to execute a method once after all test methods in a class, and it is applicable only at the class level, not project level.
    public static void setUpAfterClass(){
        System.out.println("This method will execute after all test methods in a class");
    }

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

    /*
    @Nested can be used only on non-static inner classes, and the outer test class must be non-final.
    Each nested class can have its own lifecycle methods, but @BeforeAll and @AfterAll must be static unless the nested test class uses the per-class lifecycle mode.
    Use it to group logically related tests.
    */
    @Nested //@Nested in JUnit is used to group related test cases inside an inner class to improve test structure and readability.
    class AdditionalTest {
        @Test
        public void addPositiveNumberTest(){
            assertEquals(7, calculator.add(3, 4));
        }
        @Test
        public void addPositiveAndNegativeNumberTest(){
            assertEquals(1, calculator.add(-3, 4));
        }
        @Nested
        class NestedClassInsideAnotherNestedClass {
            @Test
            public void multiplicationTest(){
                assertEquals(2, calculator.multiply(2, 1));
            }
            @Test
            public void multiplyNegativeNumbers(){
                assertEquals(16, calculator.multiply(-2, -8));
            }
        }
    }
    @Nested
    class SubstractionTest {
        @Test
        public void subtractPositiveNumberTest(){
            assertEquals(1, calculator.subtract(4, 3));
        }
        @Test
        public void subtractNumberTest(){
            assertEquals(-1, calculator.subtract(-4, -3));
        }
    }

    @DisplayName("Test Addition Method")
    @RepeatedTest(value = 5, name = RepeatedTest.LONG_DISPLAY_NAME) // The @RepeatedTest annotation in JUnit is used to run the same test multiple times in a row to verify consistent behavior and reliability. This method will run for 5 times
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
