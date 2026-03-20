package com.ratnakar.junit.practice;

public class MathUtilities {

    public boolean isEvenNumber(int number){
        return number % 2 == 0;
    }

    public long calculateFactorial(int number){
        int result = 1;
        for(int i = 1; i<= number; i++){
            result = result * i;
        }
        return result;
    }

}
