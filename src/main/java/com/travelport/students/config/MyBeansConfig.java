package com.travelport.students.config;

import com.travelport.students.controller.StudentRepository;
import com.travelport.students.model.Student;
import com.travelport.students.model.TravelportClass;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.travelport.students")
public class MyBeansConfig {

  @Bean("studentRepository")
  public StudentRepository studentRepository() {
    return new StudentRepository(new TravelportClass(studentList(), LocalDate.now()));
  }

  @Bean
  public List<Student> studentList() {
    List<Student> list = new ArrayList<>();
    list.add(new Student("Naz", 29, "Piura"));
    list.add(new Student("Toni", 50, "Barcelona"));
    list.add(new Student("Mauro", 19, "Barcelona"));
    return list;
  }
}
