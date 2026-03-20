package com.ratnakar.junit.test;

import com.ratnakar.junit.practice.DayChecker;
import com.ratnakar.junit.practice.Days;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EnumSourceTest {
    /*
        @ParameterizedTest: Runs the test method multiple times with different input values.
        @EnumSource(value = Days.class, names = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY"}): Provides specific enum constants from the Days enum (only weekdays) as inputs to the test method one by one.
    */
    @ParameterizedTest
    @EnumSource(value = Days.class, names = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY"})
    public void isWeekDayTest(Days days){
        DayChecker dayChecker = new DayChecker();
        assertTrue(dayChecker.isWeekDay(days));

    }
}
