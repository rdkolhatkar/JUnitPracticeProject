package com.ratnakar.junit.practice;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Students> students = new ArrayList<>();
    public List<Students> getStudents(){
        return this.students;
    }
    public void addStudentDetails(Students addStudent){
        students.add(addStudent);
    }
}
