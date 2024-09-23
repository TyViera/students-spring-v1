package com.travelport.students;

import com.travelport.students.config.MyBeansConfig;
import com.travelport.students.view.ListView;
import javax.swing.*;
import org.springframework.context.ApplicationContext;

public class Main {
  public static void main(String[] args) {
    ApplicationContext context =
        new org.springframework.context.annotation.AnnotationConfigApplicationContext(
            MyBeansConfig.class);

    SwingUtilities.invokeLater(
        () -> {
          var frame = context.getBean(ListView.class);
          frame.setVisible(true);
        });
  }
}
