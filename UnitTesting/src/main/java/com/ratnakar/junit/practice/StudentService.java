package com.ratnakar.junit.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentService {

    private final List<Students> students = new ArrayList<>();
    public List<Students> getStudents(){
        return this.students;
    }
    public void addStudentDetails(Students addStudent){
        students.add(addStudent);
    }

    public Students getStudentById(int studentId){
        return students.stream().filter((students) -> students.getId() == studentId)
                .findFirst()
                .orElse(null);
    }

    public String[] getStudentNamesByDepartments(String department){
        return students.stream().filter((student) -> student.getDepartment().equals(department))
                .map(Students::getName)
                .toArray(String[]::new);
    }

    public Integer[] getStudentIdByDepartments(String department){
        return students.stream().filter((student) -> student.getDepartment().equals(department))
                .map(Students::getId)
                .toArray(Integer[]::new);
    }

    public List<String> getStudentNamesListByDepartments(String department){
        return students.stream().filter((student) -> student.getDepartment().equals(department))
                .map(Students::getName)
                .collect(Collectors.toList());
    }

    public List<Integer> getStudentIdListByDepartments(String department){
        return students.stream().filter((student) -> student.getDepartment().equals(department))
                .map(Students::getId)
                .collect(Collectors.toList());
    }

    public Students getStudentByName(String name) throws StudentException {
        return students.stream().filter((student) -> student.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new StudentException("Student not found with name: " + name));
    }
}
