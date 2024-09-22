package com.travelport.students.controller;

import com.travelport.students.model.Student;
import com.travelport.students.model.TravelportClass;
import java.util.List;

public class StudentController {

    private final TravelportClass travelportClass;

    public StudentController(TravelportClass travelportClass) {
        this.travelportClass = travelportClass;
    }

    public List<Student> readAllStudents() {
        return travelportClass.students();
    }

    public void addStudent(Student student) {
        travelportClass.students().add(student);
    }

}
