package com.ratnakar.junit.test;

import com.ratnakar.junit.practice.MathUtilities;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilitiesTest {

    /*
    @ParameterizedTest: Indicates that the test method will run multiple times with different input values.
    @ValueSource(ints = {2, 4, 6, 8, 10}): Supplies a set of integer values that are passed one-by-one
    */
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    public void isEvenNumber(int value) {
        MathUtilities mathUtilities = new MathUtilities();
        assertTrue(mathUtilities.isEvenNumber(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Hello", "Unit", "Test", "Ratnakar"})
    public void valueSourceTest(String parameter){
        assertNotNull(parameter);
    }
    // @CsvSource: Supplies multiple sets of comma-separated values (rows), where each row is passed as arguments to the test method.
    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 1",
            "2, 2",
            "3, 6",
            "4, 24",
            "5, 120" // Here first index is input number and second index is the factorial value of first number which is expected result. Factorial of 5 is 120
    })
    public void checkFactorialTest(int number, int expected){
        MathUtilities mathUtilities = new MathUtilities();
        assertEquals(expected, mathUtilities.calculateFactorial(number));
    }
    // @CsvFileSource: Reads test data from a CSV file and passes each row as arguments to the test method one by one.
    @ParameterizedTest
    @CsvFileSource(resources = "/FactorialNumberTest.csv")
    public void checkFactorialNumberTest(int number, int expected){
        MathUtilities mathUtilities = new MathUtilities();
        assertEquals(expected, mathUtilities.calculateFactorial(number));
    }

    public static Stream<Arguments> argumentsProvider(){
        return Stream.of(
                Arguments.arguments(0, 1),
                Arguments.arguments(1, 1),
                Arguments.arguments(2, 2),
                Arguments.arguments(3, 6),
                Arguments.arguments(4, 24),
                Arguments.arguments(5, 120)

        );
    }
    // @MethodSource: Uses a specified method to provide a stream or collection of arguments that are passed to the test method one by one.
    @ParameterizedTest
    @MethodSource("argumentsProvider") // Here we pass the above custom static method called 'argumentsProvider'
    public void checkFactorialValueTest(int number, int expected){
        MathUtilities mathUtilities = new MathUtilities();
        assertEquals(expected, mathUtilities.calculateFactorial(number));
    }

    // @ArgumentsSource: Uses a custom arguments provider class to supply data to the test method one by one.
    @ParameterizedTest
    @ArgumentsSource(MathUtilitiesArgumentsProvider.class)
    public void checkFactorialArgumentsTest(int number, int expected){
        MathUtilities mathUtilities = new MathUtilities();
        assertEquals(expected, mathUtilities.calculateFactorial(number));
    }
}
