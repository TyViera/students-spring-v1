package com.travelport.students.controller;

import com.travelport.students.model.Student;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class StudentController {

  private final StudentRepository studentRepository;

  public StudentController(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  public List<Student> readAllStudents() {
    return studentRepository.readAllStudents();
  }

  public void addStudent(Student student) {
    studentRepository.addStudent(student);
  }
}
