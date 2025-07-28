package com.ratnakar.junit.test;

import com.ratnakar.junit.practice.StudentService;
import com.ratnakar.junit.practice.Students;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest {

    @Test
    public void getStudentsTest() {
        StudentService studentService = new StudentService();
        List<Students> listOfStudents = studentService.getStudents();
        boolean actualResult = listOfStudents.isEmpty();
        assertTrue(actualResult);
        assertTrue(() -> actualResult); //  booleanSupplier interface for assertions
        assertTrue(actualResult, "List of Students is empty");
        assertTrue(() -> actualResult, "List of Students is empty");
        // assertion with implementation of supplier functional interface
        assertTrue(actualResult, () -> "List of Students is empty");
        assertTrue(() -> actualResult, "List of students is empty");
    }

    @Test
    public void addStudentDetailsTest() {
        Students students = new Students(1, "Suresh");
        StudentService studentService = new StudentService();
        List<Students> listOfStudents = studentService.getStudents();
        listOfStudents.add(students);
        // studentService.addStudentDetails(students);
        boolean actualResult = listOfStudents.isEmpty();
        assertFalse(actualResult);
        assertFalse(() -> actualResult);
        assertFalse(actualResult, () -> "Student list should not be empty");
    }

    @Test
    public void getStudentByIdTest(){
        StudentService studentService = new StudentService();
        Students students = new Students(1, "Ramesh");
        studentService.addStudentDetails(students);
        Students actualObject = studentService.getStudentById(5);
        assertNull(actualObject); // It verifies that if actual object is null or not
        assertNull(actualObject, "Student object is not null");
        assertNull(actualObject, () -> "Student object is not null");
    }

    @Test
    public void getStudentByIdValueTest(){
        StudentService studentService = new StudentService();
        Students students = new Students(1, "Ramesh");
        studentService.addStudentDetails(students);
        Students actualObject = studentService.getStudentById(1);
        assertNotNull(actualObject);
        assertNotNull(actualObject, "Student Object is null");
        assertNotNull(actualObject, () -> "Student object is null");
    }
}