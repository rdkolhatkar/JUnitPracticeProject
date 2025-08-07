package com.ratnakar.junit.test;

import com.ratnakar.junit.practice.StudentService;
import com.ratnakar.junit.practice.Students;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link StudentService} using JUnit 5.
 * This class tests various functionalities such as retrieving,
 * adding, filtering, and validating student data.
 */
public class StudentServiceTest {

    /**
     * Test to verify that initially the student list is empty.
     * Uses various assertTrue overloads for demonstration.
     */
    @Test
    public void getStudentsTest() {
        StudentService studentService = new StudentService();
        List<Students> listOfStudents = studentService.getStudents();
        boolean actualResult = listOfStudents.isEmpty();

        assertTrue(actualResult);
        assertTrue(() -> actualResult); // booleanSupplier
        assertTrue(actualResult, "List of Students is empty");
        assertTrue(() -> actualResult, "List of Students is empty");
        assertTrue(actualResult, () -> "List of Students is empty");
        assertTrue(() -> actualResult, "List of students is empty");
    }

    /**
     * Test to verify that the student list is not empty after adding a student.
     * Demonstrates use of assertFalse with different overloads.
     */
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

    /**
     * Test to validate that retrieving a student with a non-existing ID returns null.
     * This checks the behavior when a student is not found.
     */
    @Test
    public void getStudentByIdTest(){
        StudentService studentService = new StudentService();
        Students students = new Students(1, "Ramesh");
        studentService.addStudentDetails(students);

        Students actualObject = studentService.getStudentById(5);

        assertNull(actualObject);
        assertNull(actualObject, "Student object is not null");
        assertNull(actualObject, () -> "Student object is not null");
    }

    /**
     * Test to validate retrieval of an existing student by ID returns a non-null object.
     */
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

    /**
     * Test to compare the actual student's ID and name retrieved by ID
     * and validate it matches the expected values.
     */
    @Test
    public void compareStudentByIdValues(){
        StudentService studentService = new StudentService();
        Students students = new Students(1, "Ramesh");
        studentService.addStudentDetails(students);

        Students actualObject = studentService.getStudentById(1);

        assertEquals(1, actualObject.getId());
        assertEquals("Ramesh", actualObject.getName());
        assertEquals(students, actualObject);
        assertEquals(1, actualObject.getId(), "Student Id is not matching with expected value");
        assertEquals("Ramesh", actualObject.getName(), () -> "Student name is not matching with expected value");
    }

    /**
     * Test to ensure that the student's ID and name are not equal to unexpected values.
     * Validates incorrect data scenarios.
     */
    @Test
    public void getIdOfStudentTest(){
        StudentService studentService = new StudentService();
        Students students = new Students(1, "Ramesh");
        studentService.addStudentDetails(students);

        Students actualObject = studentService.getStudentById(1);

        assertNotEquals(0, actualObject.getId());
        assertNotEquals(1, actualObject.getId() + 1, "Student Id is matching with expected value");
        assertNotEquals(2, actualObject.getId(), () -> "Student Id is matching with expected value");
        assertNotEquals("Ramesh", actualObject.getName() + "1", "Student name is matching with expected value");
    }

    /**
     * Test to retrieve student names by department and verify that
     * the returned names match the expected list for the "Science" department.
     */
    @Test
    public void getStudentNamesByDepartmentTest(){
        StudentService studentService = new StudentService();
        Students students = new Students(1, "Ramesh", "Science");
        Students students1 = new Students(2, "Suresh", "Commerce");
        Students students2 = new Students(3, "Mahesh", "Arts");
        Students students3 = new Students(4, "Raja", "Science");
        Students students4 = new Students(5, "Ram", "Science");

        studentService.addStudentDetails(students);
        studentService.addStudentDetails(students1);
        studentService.addStudentDetails(students2);
        studentService.addStudentDetails(students3);
        studentService.addStudentDetails(students4);

        String[] actualNamesArray = studentService.getStudentNamesByDepartments("Science");
        String[] expectedNamesArray = {"Ramesh", "Raja", "Ram"};

        assertArrayEquals(expectedNamesArray, actualNamesArray);
        assertArrayEquals(expectedNamesArray, actualNamesArray, "Student names are not matching with expected values");
        assertArrayEquals(expectedNamesArray, actualNamesArray, () -> "Student names are not matching with expected values");
    }

    /**
     * Test to retrieve student IDs by department and verify that
     * the returned IDs match the expected list for the "Science" department.
     */
    @Test
    public void getStudentIdByDepartmentTest(){
        StudentService studentService = new StudentService();
        Students students = new Students(1, "Ramesh", "Science");
        Students students1 = new Students(2, "Suresh", "Commerce");
        Students students2 = new Students(3, "Mahesh", "Arts");
        Students students3 = new Students(4, "Raja", "Science");
        Students students4 = new Students(5, "Ram", "Science");

        studentService.addStudentDetails(students);
        studentService.addStudentDetails(students1);
        studentService.addStudentDetails(students2);
        studentService.addStudentDetails(students3);
        studentService.addStudentDetails(students4);

        Integer[] actualIdsArray = studentService.getStudentIdByDepartments("Science");
        Integer[] expectedIdsArray = {1, 4, 5};

        assertArrayEquals(expectedIdsArray, actualIdsArray);
        assertArrayEquals(expectedIdsArray, actualIdsArray, "Student Ids are not matching with expected values");
        assertArrayEquals(expectedIdsArray, actualIdsArray, () -> "Student Ids are not matching with expected values");
    }
    /**
     * Test to retrieve student names as a list by department and verify that
     * Demonstrates the use of List assertions in JUnit 5.
     * assertIterableEquals is used to compare two lists.
     */
    @Test
    public void getStudentNamesListByDepartmentTest(){
        StudentService studentService = new StudentService();
        Students students = new Students(1, "Ramesh", "Science");
        Students students1 = new Students(2, "Suresh", "Commerce");
        Students students2 = new Students(3, "Mahesh", "Arts");
        Students students3 = new Students(4, "Raja", "Science");
        Students students4 = new Students(5, "Ram", "Science");

        studentService.addStudentDetails(students);
        studentService.addStudentDetails(students1);
        studentService.addStudentDetails(students2);
        studentService.addStudentDetails(students3);
        studentService.addStudentDetails(students4);

        List<String> actualNamesList = studentService.getStudentNamesListByDepartments("Science");
        List<String> expectedNamesList = List.of("Ramesh", "Raja", "Ram");

        assertIterableEquals(expectedNamesList, actualNamesList);
        assertIterableEquals(expectedNamesList, actualNamesList, "Student names list is not matching with expected values");
        assertIterableEquals(expectedNamesList, actualNamesList, () -> "Student names list is not matching with expected values");

    }

    /**
     * Test to retrieve student IDs as a list by department and verify that
     * Demonstrates the use of List assertions in JUnit 5.
     * assertIterableEquals is used to compare two lists.
     */
    @Test
    public void getStudentIdListByDepartmentTest(){
        StudentService studentService = new StudentService();
        Students students = new Students(1, "Ramesh", "Science");
        Students students1 = new Students(2, "Suresh", "Commerce");
        Students students2 = new Students(3, "Mahesh", "Arts");
        Students students3 = new Students(4, "Raja", "Science");
        Students students4 = new Students(5, "Ram", "Science");

        studentService.addStudentDetails(students);
        studentService.addStudentDetails(students1);
        studentService.addStudentDetails(students2);
        studentService.addStudentDetails(students3);
        studentService.addStudentDetails(students4);

        List<Integer> actualIdsList = studentService.getStudentIdListByDepartments("Science");
        List<Integer> expectedIdsList = List.of(1, 4, 5);

        assertIterableEquals(expectedIdsList, actualIdsList);
        assertIterableEquals(expectedIdsList, actualIdsList, "Student Ids list is not matching with expected values");
        assertIterableEquals(expectedIdsList, actualIdsList, () -> "Student Ids list is not matching with expected values");
    }
}
