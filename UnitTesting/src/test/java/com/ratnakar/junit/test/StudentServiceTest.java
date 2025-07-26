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
        boolean actualResult = listOfStudents.isEmpty();
        assertFalse(actualResult);
        assertFalse(() -> actualResult);
        assertFalse(actualResult, () -> "Student list should not be empty");
    }
}