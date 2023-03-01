package com.example;

import javax.swing.*;
import java.awt.*;

public class FirstExample {

  public static void main(String argv[]) {
    // Componenti
    JLabel label = new JLabel("Un programma Swing");
    JCheckBox checkBox1 = new JCheckBox("Check Box 1");
    JCheckBox checkBox2 = new JCheckBox("Check Box 2");
    JButton okButton = new JButton("OK");
    JButton cancelButton = new JButton("Cancel");

    // Pannello NORTH
    JPanel northPanel = new JPanel();
    northPanel.add(label);
    
    // Pannello CENTER
    JPanel centralPanel = new JPanel();
    centralPanel.setLayout(new GridLayout(0,1));
    centralPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 50, 50));
    centralPanel.add(checkBox1);
    centralPanel.add(checkBox2);
    
    // Pannello SOUTH
    JPanel southPanel = new JPanel();
    southPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
    southPanel.add(cancelButton);
    southPanel.add(okButton);
    
    // Top Level Container
    JFrame f = new JFrame("First Example");
    f.getContentPane().setLayout(new BorderLayout());
    f.getContentPane().add(BorderLayout.NORTH, northPanel);
    f.getContentPane().add(BorderLayout.CENTER, centralPanel);
    f.getContentPane().add(BorderLayout.SOUTH, southPanel);
    f.pack();
    f.setVisible(true);
  }
}
