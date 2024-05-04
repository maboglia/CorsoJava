package com.example;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample {

  public static void main(String argv[]) {
    JFrame f = new JFrame("BorderLayout"); 
    f.getContentPane().setLayout(new BorderLayout()); 
    f.getContentPane().add(new Button("North"), BorderLayout.NORTH); 
    f.getContentPane().add(new Button("South"), BorderLayout.SOUTH); 
    f.getContentPane().add(new Button("East"), BorderLayout.EAST); 
    f.getContentPane().add(new Button("West"), BorderLayout.WEST); 
    f.getContentPane().add(new Button("Center"), BorderLayout.CENTER); 
    f.setSize(500,400); 
    f.setVisible(true);
  }
}
