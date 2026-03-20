package com.ratnakar.junit.practice;

public class DayChecker {
    public boolean isWeekDay(Days day){
        return day != Days.SATURDAY || day != Days.SUNDAY;
    }
}
