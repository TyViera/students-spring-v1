package com.travelport.students.model;

import java.time.LocalDate;
import java.util.List;

public record TravelportClass(List<Student> students, LocalDate initialDate) {
}
