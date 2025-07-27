package com.ratnakar.junit.practice;

import java.util.ArrayList;
import java.util.List;

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
}
