package com.ratnakar.junit.test;

import com.ratnakar.junit.practice.MathUtilities;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MathUtilitiesTest {

    @ParameterizedTest //
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
}
