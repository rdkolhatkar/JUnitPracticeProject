package com.ratnakar.junit.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
//@SelectClasses(AnnotationTest.class) // To run a single Junit class
@SelectClasses({AnnotationTest.class, CalculatorTest.class, StudentServiceTest.class}) // To run Multiple Junit test classes
@SelectPackages("com.ratnakar.junit.test") // To run all the Junit test classes from a certain package
//@SelectPackages({"com.ratnakar.junit.test", "com.ratnakar.junit.practice"}) // To run Junit tests from Multiple packages
public class TestSuite {

}
