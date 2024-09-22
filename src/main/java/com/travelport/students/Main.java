package com.travelport.students;

import com.travelport.students.controller.StudentController;
import com.travelport.students.model.TravelportClass;
import com.travelport.students.view.CommonViewUtils;
import com.travelport.students.view.ListView;
import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            var frame = new ListView(new CommonViewUtils(), new StudentController(new TravelportClass(new ArrayList<>(), LocalDate.now())));
            frame.setVisible(true);

        });
    }
}
