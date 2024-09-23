package com.travelport.students.view;

import javax.swing.JOptionPane;
import java.awt.Component;

@org.springframework.stereotype.Component
public class CommonViewUtils {
    public String readString(Component parent, String message) {
        return JOptionPane.showInputDialog(parent, message, "Fill the data", JOptionPane.PLAIN_MESSAGE);
    }

    public Integer readInt(Component parent, String message) {
        String value;
        do {
            value = JOptionPane.showInputDialog(parent, message, "Fill the data", JOptionPane.PLAIN_MESSAGE);
        } while (!value.matches("\\d+"));
        return Integer.parseInt(value);
    }

}
